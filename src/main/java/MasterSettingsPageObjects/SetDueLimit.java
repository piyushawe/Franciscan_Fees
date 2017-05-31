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
	Utility u= new Utility();
	String pg= "SetDueLimit";
	
	@FindBy(id="ContentPlaceHolder1_txtDueAmount_TextBox")WebElement duesamount;
	@FindBy(id="ContentPlaceHolder1_chkisperc")WebElement percent;
	@FindBy(id="ContentPlaceHolder1_ddlheadid")WebElement feehead;
	@FindBy(id="ContentPlaceHolder1_rdoyes")WebElement yes;
	@FindBy(id="ContentPlaceHolder1_rdono")WebElement no;
	
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
		for(@SuppressWarnings("unused") WebElement setting:settings)
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
}
