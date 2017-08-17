package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmountWithoutStructureReport {
WebDriver dr;
String r= "AmountWithoutStructureReport";

  By datefrom= By.id("ContentPlaceHolder1_txtDateFrom_TextBox");
  By dateto= By.id("ContentPlaceHolder1_txtDateTo_TextBox");
  By cls= By.id("ContentPlaceHolder1_ddlStanard");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By head= By.id("ContentPlaceHolder1_ddlFeeHeadToshown");
  By school= By.id("ContentPlaceHolder1_ddlSchool");
  By user=By.id("ContentPlaceHolder1_ddlUser");
  By year= By.id("ContentPlaceHolder1_ddlyear");
  By cancelfee= By.id("ContentPlaceHolder1_chkcancel");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
  
  public AmountWithoutStructureReport(WebDriver d)
  {
	  this.dr=d;
  }
//open amount without structure report  
  public void openAmountWithoutStructureReport()
  {
	  WebElement menu;
   	  Actions builder= new Actions(dr);
   	  menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Amount without Structure report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Amount without Structure report")));
  }
//from date  
  public void selectDateFrom(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(datefrom).click();
	  Thread.sleep(1000);
	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(500);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
	  Thread.sleep(500);
	  WebElement myw=dr.findElement(By.className("datepick"));
     
		 List<WebElement> cells=myw.findElements(By.tagName("td"));
		  for(WebElement cell: cells) {
			if (cell.getText().equals(dd)){  
			cell.click();
			break; 
		 }  
  }Thread.sleep(500);
  }
//to date  
  public void selectDateTo(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(dateto).click();
	  Thread.sleep(1000);
	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(500);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
	  Thread.sleep(500);
	  WebElement myw=dr.findElement(By.className("datepick"));
		 List<WebElement> cells=myw.findElements(By.tagName("td"));
		  for(WebElement cell: cells) {
			if (cell.getText().equals(dd)){  
			cell.click();
			break; 
		 }  
  }Thread.sleep(500);
  }
//select class  
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
//select section  
  public void selectSection(String s)
  {
	  Select sec=new Select(dr.findElement(section));
	  try {
	     sec.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  sec.selectByIndex(1);
	  }
  }
//select head  
  public void selectHead(String h)
  {
	  new Select(dr.findElement(head)).selectByVisibleText(h);
  }
//select school  
  public void selectSchool(String s)
  {
	  Select sch=new Select(dr.findElement(school));
	  try {
	     sch.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
		  sch.selectByIndex(1);
	  }
  }
//select user  
  public void selectUser(String u)
  {
	  try {
	     new Select(dr.findElement(user)).selectByVisibleText(u);
	  }
	  catch(NoSuchElementException e)
	  {
		  new Select(dr.findElement(user)).selectByIndex(0);
	  }
  }
//select year  
  public void selectYear(String yr)
  {
	  try {
	     new Select(dr.findElement(year)).selectByVisibleText(yr);
	  }
	  catch(NoSuchElementException e) {
	     new Select(dr.findElement(year)).selectByIndex(4);
	  }
  }
//click cancel fee  
  public void clickCancelFee()
  {
	  dr.findElement(cancelfee).click();
  }
//click show  
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
