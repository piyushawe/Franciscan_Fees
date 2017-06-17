package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FeeOpeningBalanceSetting {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "FeeOpeningBalanceSetting";
  
  @FindBy(id="ContentPlaceHolder1_ddlFeeType")WebElement feetype;
  @FindBy(name="ctl00$ContentPlaceHolder1$abc")List<WebElement> advanceamount;
  @FindBy(name="ctl00$ContentPlaceHolder1$XYZ")List<WebElement>openingbalance;
  @FindBy(name="ctl00$ContentPlaceHolder1$btnSave$ctl00")WebElement save;
  
  public FeeOpeningBalanceSetting(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openFeeOpeningBalanceSetting()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Fee Opening Balance Setting")).click();
	 dr.switchTo().frame(dr.findElement(By.id("Fee Opening Balance Setting")));
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  dr.findElement(By.xpath("//div[@class='content']")).click();
	  Thread.sleep(1000);
	  u.captureScreenshot(dr, schl, pg, sc);
	  Select ftype= new Select(feetype);
	  String f= ftype.getFirstSelectedOption().getText();
	  if(f.equals("Select FeeType"))
		  System.out.println("Fee Type Not Selected");
	  else
		  System.out.println("Fee Type Is Selected");
  }
  public void selectAdvanceAmountSetting(String aset)
  {
  	for(WebElement adamtsetting:advanceamount)
	{
		String val;
		if(aset.equals("Auto"))
		{
			if(adamtsetting.getAttribute("value").equals("rdoadvanceyes"))
				adamtsetting.click();
		}
		if(aset.equals("Manual"))
		{
			if(adamtsetting.getAttribute("value").equals("rdoadvanceno"))
				adamtsetting.click();
		}
	}
  }
  public void selectOpeningBalanceSetting(String obsetting)
  {
	  for(WebElement opbal:openingbalance)
	  {
		  String val;
		  if(obsetting.equals("Auto"))
		  {
			  if(opbal.getAttribute("value").equals("rdoopenno"))
				  opbal.click();
		  }
		  if(obsetting.equals("Manual"))
		  {
			  if(opbal.getAttribute("value").equals("rdoopenyes"))
				  opbal.click();
		  }
	  }
  }
  public void selectAdvanceFeeType()
  {
  	new Select(feetype).selectByIndex(1);
  }
  public void clickSave(String school, Collection<String> sc)throws IOException
  {
  	 save.click();
     u.verifySave(dr, school, pg, sc);
  }
}
