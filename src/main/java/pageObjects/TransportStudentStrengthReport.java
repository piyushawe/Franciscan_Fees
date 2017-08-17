package pageObjects;

import java.io.IOException;
import java.util.Collection;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class TransportStudentStrengthReport {
WebDriver dr;
String r= "TransportStudentStrengthReport";

  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By route= By.id("ContentPlaceHolder1_ddlRoute");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
  
   public TransportStudentStrengthReport(WebDriver d)
   {
       this.dr=d;
   }
   public void openTransportStudentStrengthReport() throws InterruptedException
   {   
      WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
      //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(5000);
      Actions builder= new Actions(dr);
      builder.moveToElement(menu).build().perform();
      dr.findElement(By.linkText("Transport Student Strength Report")).click();
      dr.switchTo().frame(dr.findElement(By.id("Transport Student Strength Report")));
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
   public void selectRoute(String r) throws InterruptedException
   {
	   Thread.sleep(1000);
	   Select rt= new Select(dr.findElement(route));
	   try {
	     rt.selectByVisibleText(r);
	   }
	   catch(NoSuchElementException e)
  	   {
   		 rt.selectByIndex(1);
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
