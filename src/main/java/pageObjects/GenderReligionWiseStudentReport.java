package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenderReligionWiseStudentReport {
WebDriver dr;
String r= "GenderReligionWiseStudentReport";

  By religion= By.id("ContentPlaceHolder1_ddlReligion");
  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By gender= By.id("ContentPlaceHolder1_ddlGender");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
  
  public GenderReligionWiseStudentReport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openGenderReligionWiseStudentReport()
  {
	  WebElement menu;
  	  Actions builder= new Actions(dr);
  	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
  	  dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Gender/Religion Wise Student Report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Gender/Religion Wise Student Report")));
  }
  public void selectReligion(String r)
  {
	  Select rg= new Select(dr.findElement(religion));
	  try {
	    rg.selectByVisibleText(r);
	  }
	  catch(NoSuchElementException e)
	  {
		   rg.selectByIndex(1);
	  }
  }
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
  public void selectGender(String g)
  {
	  Select gd= new Select(dr.findElement(gender));
	  try {
	    gd.selectByVisibleText(g);
	  }
	  catch(NoSuchElementException e)
	  {
	     gd.selectByIndex(1);
	  }
  }
  public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
  {                                                                                                 
     Utility u= new Utility();                                                                    
     dr.findElement(show).click();                                                                
     Thread.sleep(10000);                                                                          
     u.captureScreenshot(dr,schl,r,sc);                                                           
     u.downloadPDF(dr);                                                                           
  } 
}
