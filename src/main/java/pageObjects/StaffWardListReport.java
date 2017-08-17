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

public class StaffWardListReport {
WebDriver dr;	
String r= "StaffWardListReport";

    By cls= By.id("ContentPlaceHolder1_ddlClass");
    By section= By.id("ContentPlaceHolder1_ddlSection");
    By staffward= By.id("ContentPlaceHolder1_ddlStaffWard");
    By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
    
	public StaffWardListReport(WebDriver d)
	{
		this.dr=d;
	}
	public void openDateWiseAdmissionReport()
	  {
		  WebElement menu;
	  	  Actions builder= new Actions(dr);
	  	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  	  dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  builder.moveToElement(menu).build().perform();
		  WebElement menuop1= dr.findElement(By.linkText("Staff Ward List Report"));
		  menuop1.click();
		  dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  dr.switchTo().frame(dr.findElement(By.id("Staff Ward List Report")));
	  }
	public void selectClass(String c) throws InterruptedException
	{
		Select cl= new Select(dr.findElement(cls));
		try {
		   cl.selectByVisibleText(c);
		}
		catch(NoSuchElementException e)
 	    {
 		   new Select(dr.findElement(cls)).selectByIndex(1);
 	    }
		Thread.sleep(1000);
	}
	public void selectSection(String s)
	{
		Select sec= new Select(dr.findElement(section));
		try {
		  sec.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
 	    {
 		   sec.selectByIndex(1);
 	    }
	}
	public void selectStaffWard(String w)
	{
		Select ward= new Select(dr.findElement(staffward));
		ward.selectByVisibleText(w);
	}
	public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
	{                                                                                                 
	   Utility u= new Utility();                                                                    
	   dr.findElement(show).click();
		Utilities ut= new Utilities();
		ut.verifyShow(dr,schl,r,sc);
	   Thread.sleep(5000);                                                                          
	   u.captureScreenshot(dr,schl,r,sc);                                                           
	   //u.downloadPDF(dr);
	}  
}
