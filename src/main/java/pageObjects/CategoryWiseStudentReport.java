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

public class CategoryWiseStudentReport {
WebDriver dr;
String r="CategoryWiseStudentReport";

  By category= By.id("ContentPlaceHolder1_ddlCategory");
  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By fatherprofession= By.id("ContentPlaceHolder1_ddlFProfession");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
		  
	public CategoryWiseStudentReport(WebDriver d)
	{
		this.dr=d;
	}
//open category wise student report	
	public void openCategoryWiseStudentReport()
	{
		 WebElement menu;
	  	  Actions builder= new Actions(dr);
	  	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  	  dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  builder.moveToElement(menu).build().perform();
		  WebElement menuop1= dr.findElement(By.linkText("Category Wise Student Report"));
		  menuop1.click();
		  dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  dr.switchTo().frame(dr.findElement(By.id("Category Wise Student Report")));
	}
//category	
	public void selectCategory(String c)
	{
		Select cg= new Select(dr.findElement(category));
		try {
		  cg.selectByVisibleText(c);
		}
		catch(NoSuchElementException e)
		{
		   cg.selectByIndex(1);
		}
	}
//class	
	public void selectClass(String c)
	{
		Select cl= new Select(dr.findElement(cls));
		try {
		   cl.selectByVisibleText(c);
		}
		catch(NoSuchElementException e)
		{
		   cl.selectByIndex(1);
		}
	}
//section
	public void selectSection(String s) throws InterruptedException
	{   
		Thread.sleep(1000);
		Select sec= new Select(dr.findElement(section));
		try {
		  sec.selectByVisibleText(s);
		}
		catch(NoSuchElementException e)
		   {
			   sec.selectByIndex(1);
		   }
	}
//father profession	
	public void selectFatherProfession(String p)
	{
		Select pf= new Select(dr.findElement(fatherprofession));
		try {
		  pf.selectByVisibleText(p);
		}
		catch(NoSuchElementException e)
		{
		   pf.selectByIndex(1);
		}
	}
//show	
	public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException
	{
	 	 Utility u= new Utility(); 
	  	 dr.findElement(show).click();
		 Utilities ut= new Utilities();
		 ut.verifyShow(dr,schl,r,sc);
	  	 Thread.sleep(5000);
	  	 u.captureScreenshot(dr,schl,r,sc);
	  	// u.downloadPDF(dr);
	}
}
