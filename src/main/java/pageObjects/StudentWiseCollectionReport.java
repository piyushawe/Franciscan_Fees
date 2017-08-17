package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class StudentWiseCollectionReport {
WebDriver dr;
String r= "StudentWiseCollectionReport";

  //By cls= By.id("ContentPlaceHolder1_ddlClass");
  By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
  By school= By.id("ContentPlaceHolder1_ddlAccount");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
		  
  public StudentWiseCollectionReport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openStudentWiseCollectionReport() throws InterruptedException
  {
	     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));		
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 WebElement submenu= dr.findElement(By.linkText("Collection"));
		 builder.moveToElement(submenu).build().perform();
		 dr.findElement(By.linkText("Student Wise Collection Report")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Student Wise Collection Report")));
  }
  public void selectClass(String c) throws InterruptedException
  {
	  dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(2) > div > div > button")).click();
	  dr.findElement(By.cssSelector("body > div.ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all > div > ul > li:nth-child(2) > a")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[3]/ul"));
	  List<WebElement> options = select.findElements(By.tagName("span"));
	  for(WebElement option:options)
		  if(c.equals(option.getText()))
			  option.click();
	  dr.findElement(By.cssSelector("body > div.ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all > div > ul > li.ui-multiselect-close")).click();
  }

  public void selectFeeType(String s) throws InterruptedException
  {
	  Select ftype= new Select(dr.findElement(feetype));
	  try {
	    ftype.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		new Select(dr.findElement(feetype)).selectByIndex(1);
 	  }
	  Thread.sleep(1000);
  }
  public void selectSchool(String s)
  {
	  Select sch= new Select(dr.findElement(school));
	  try {
	    sch.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
 	  {
  		sch.selectByIndex(1);
 	  }
  }
  public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException {
      Utility u = new Utility();
      dr.findElement(show).click();
      Utilities ut = new Utilities();
      ut.verifyShow(dr, schl, r, sc);
      sleep(5000);
      u.captureScreenshot(dr, schl, r, sc);
      //u.downloadPDF(dr);
  } 
}
