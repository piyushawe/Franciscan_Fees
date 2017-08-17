package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpeningDuesReport {
WebDriver dr;
String r= "OpeningDuesReport";

  By school= By.id("ContentPlaceHolder1_ddlSchool");
  By cls= By.id("ContentPlaceHolder1_ddlStandard");
  By section=By.id("ContentPlaceHolder1_ddlSection");
  By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
  By installment= By.id("ContentPlaceHolder1_ddlInstallment");
  By user= By.id("ContentPlaceHolder1_ddlUser");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
  
  public OpeningDuesReport(WebDriver d)
  {
	  this.dr=d;
  }
	public void openOpeningDuesReport()
	{
		WebElement menu;
	  	Actions builder= new Actions(dr);
	  	menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  	dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		builder.moveToElement(menu).build().perform();
		WebElement menuop1= dr.findElement(By.linkText("Opening Dues Report"));
		menuop1.click();
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		dr.switchTo().frame(dr.findElement(By.id("Opening Dues Report")));
	}
	public void selectSchool(String s)
	{
		Select sch= new Select(dr.findElement(school));
		try{
		   sch.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   sch.selectByIndex(1);
		}
	}
	public void selectClass(String s)
	{
		Select c= new Select(dr.findElement(cls));
		try {
		   c.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   c.selectByIndex(1);
		}
	}
	public void selectSection(String s)
	{
		Select sec= new Select(dr.findElement(section));
		try {
		   sec.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   new Select(dr.findElement(section)).selectByIndex(1);
		}
	}
	public void selectFeeType(String s)
	{
		Select ftype= new Select(dr.findElement(feetype));
		try {
		   ftype.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   ftype.selectByIndex(1);
		}
	}
	public void selectInstallment(String s)
	{
		Select inst= new Select(dr.findElement(installment));
		try {
	       inst.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   inst.selectByIndex(1);
		}
	}
	public void selectUser(String s)
	{
		Select u= new Select(dr.findElement(user));
		try {
		  u.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		{
		   u.selectByIndex(1);
		}
	}
	public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
    {                                                                                                 
       Utility u= new Utility();                                                                    
       dr.findElement(show).click();
		Utilities ut= new Utilities();
		ut.verifyShow(dr,schl,r,sc);
       Thread.sleep(2000);                                                                          
       u.captureScreenshot(dr,schl,r,sc);                                                           
       //u.downloadPDF(dr);
    } 
}
