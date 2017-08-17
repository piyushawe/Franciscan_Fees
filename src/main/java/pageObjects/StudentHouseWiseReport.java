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

public class StudentHouseWiseReport {
WebDriver dr;
String r= "StudentHouseWiseReport";

  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By sectionwise= By.id("ContentPlaceHolder1_CheckBox1");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By house= By.id("ContentPlaceHolder1_ddlHouse");
  By all= By.id("ContentPlaceHolder1_rdbOption_0");
  By active= By.id("ContentPlaceHolder1_rdbOption_1");
  By inactive= By.id("ContentPlaceHolder1_rdbOption_2");
  By range= By.id("ContentPlaceHolder1_ddlRange");
  By age= By.id("ContentPlaceHolder1_ddlFromAge");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton2\"]/input");

 public StudentHouseWiseReport(WebDriver drv)
 {
	this.dr=drv;
 }
 public void openStudentHouseWiseReport()
 {
      WebElement menu;
	  Actions builder= new Actions(dr);
	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Student House Wise Report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Student House Wise Report")));
 } 
 public void selectClass(String c)
 {
	 Select cs= new Select(dr.findElement(cls));
	 try {
	    cs.selectByVisibleText(c);
	 }
	 catch(NoSuchElementException e)
	 {
		 cs.selectByIndex(1);
	 }
 }
 public void clickSectionWise() throws InterruptedException
 {
	 dr.findElement(sectionwise).click();
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
 public void selectHouse(String h)
 {
	 Select hs= new Select(dr.findElement(house));
	 try {
	    hs.selectByVisibleText(h);
	 }
	 catch(NoSuchElementException e)
	 {
		 hs.selectByIndex(1);
	 }
 }
 public void clickAll()
 {
	 dr.findElement(all).click();
 }
 public void clickActive()
 {
	 dr.findElement(active).click();
 }
 public void clickInActive()
 {
	 dr.findElement(inactive).click();
 }
 public void rangeType(String r)
 {
	 Select rg= new Select(dr.findElement(range));
	 rg.selectByVisibleText(r);
 }
 public void selectAge(String a)
 {
	 Select ag= new Select(dr.findElement(age));
	 ag.selectByVisibleText(a);
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
