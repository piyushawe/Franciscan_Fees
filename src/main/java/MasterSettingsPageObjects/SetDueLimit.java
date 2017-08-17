package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetDueLimit {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "SetDueLimit";
	
	@FindBy(id="ContentPlaceHolder1_txtDueAmount_TextBox")WebElement duesamount;
	@FindBy(id="ContentPlaceHolder1_chkisperc")WebElement percent;
	@FindBy(id="ContentPlaceHolder1_ddlheadid")WebElement feehead;
	@FindBy(id="ContentPlaceHolder1_rdoyes")WebElement yes;
	@FindBy(id="ContentPlaceHolder1_rdono")WebElement no;
	@FindBy(name="ctl00$ContentPlaceHolder1$rdowaveoff")List<WebElement>finewaiveoffsetting;
	@FindBy(id="ContentPlaceHolder1_btnDueLimit_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_btnDueLimit_btnView")WebElement view;
	
	public SetDueLimit(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openSetDueLimit()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Set Due Limit")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Set Due Limit")));
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   dr.findElement(By.xpath("//div[@class='content']")).click();	
	   Thread.sleep(1000);
	   u.captureScreenshot(dr,schl,pg,sc); 	  
	   verifyLateFeeOnDue();
	   verifyFineWaiveOffSetting();
    }
	public void verifyLateFeeOnDue()
	{
		List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rblLateFeeOnDue"));
		if(yes.isSelected()||no.isSelected())
			System.out.println("Late Fee Setting is Done");
		for(WebElement option:options)
		{  	
			if(option.getAttribute("value").equals("rdoyes")) {
			 option.click();
			 duesamount.clear();
			 duesamount.sendKeys("100");
			 duesamount.sendKeys(Keys.ENTER);
			  System.out.println("Yes is selected");	
				if(duesamount.isEnabled()&&percent.isEnabled()&&feehead.isEnabled())
					System.out.println("Yes: Elements are Enabled");
				else
					System.out.println("Yes: Elements are Disabled");
		    }
			if(option.getAttribute("value").equals("rdono")) {
				option.click();
				System.out.println("No is selected");
				if(duesamount.isEnabled()&&percent.isEnabled()&&feehead.isEnabled())
					System.out.println("No: Elements are Enabled");
				else
					System.out.println("No: Elements are Disabled");
			 }
	    }
	}
	public void verifyFineWaiveOffSetting()
	{
		List<WebElement>settings= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdowaveoff"));
		boolean flag= false;
		int i=0;
		for(WebElement setting:settings)
		{
			if(settings.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Fine Waive Off Setting is there");
		else 
			System.out.println("Fine Waive Off Setting is not there");
	}
	public void selectFineWaiveOffSetting(String fwoffset)
	{
         String val;
         for (WebElement woff:finewaiveoffsetting)
		 {
			if(fwoffset.equals("Do not show waive off"))
		      if(woff.getAttribute("value").equals("rdodefault"))
		  		woff.click();
			if(fwoffset.equals("waive off without reason"))
			  if(woff.getAttribute("value").equals("rdowithoutreason"))
			    woff.click();
			if(fwoffset.equals("waive off with reason"))
			  if(woff.getAttribute("value").equals("rdowithreason"))
			    woff.click();
		  }
	}
	public void clickSave(String school, Collection<String> sc)throws IOException
	{
		save.click();
		u.verifySave(dr, school, pg, sc);
	}
	public void clickView(String school, Collection<String> sc)throws IOException
	{
		view.click();
		WebElement table= dr.findElement(By.id("example"));
		List<WebElement> cells= table.findElements(By.tagName("td"));
		if (cells.size()>1) {
			for (WebElement cell : cells) {
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptDuesLimit')]")).click();
				break;
			}
		}else
			System.out.println("No record Found");
		dr.findElement(By.id("ContentPlaceHolder1_btnDueLimit_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		u.verifyView(dr,school, pg, sc);
	}
}
