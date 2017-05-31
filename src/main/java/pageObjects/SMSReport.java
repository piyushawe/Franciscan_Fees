package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SMSReport {
  WebDriver dr;	
  String r= "SMSReport";
  
    By fromdate= By.id("ContentPlaceHolder1_txtfromDate_TextBox");
    By todate= By.id("ContentPlaceHolder1_txttoDate_TextBox");
    By smstype= By.id("ContentPlaceHolder1_ddlsmstype");
    By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
 
   public SMSReport(WebDriver d)
    {
	   this.dr=d;
    }
   public void openSMSReport()
    {
	   WebElement menu;
  	   Actions builder= new Actions(dr);
  	   menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
  	   dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   builder.moveToElement(menu).build().perform();
	   WebElement menuop1= dr.findElement(By.linkText("Sms Report"));
	   menuop1.click();
	   dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   dr.switchTo().frame(dr.findElement(By.id("Sms Report")));
   }
   public void selectFromDate(String mm, String yy, String dd) throws InterruptedException
   {
	   dr.findElement(fromdate).click();
	  	  Thread.sleep(1000);
	  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
	      Thread.sleep(1000);
	      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
	  	  Thread.sleep(1000);
	  	  WebElement myw=dr.findElement(By.className("datepick"));
	  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
	  		  for(WebElement cell: cells) {
	  			if (cell.getText().equals(dd)){  
	  			cell.click();
	  			break; 
	  		 }  
	    }Thread.sleep(1000);
   }
   public void selectToDate(String mm, String yy, String dd) throws InterruptedException
   {
	   dr.findElement(todate).click();
	  	  Thread.sleep(1000);
	  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
	      Thread.sleep(1000);
	      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
	  	  Thread.sleep(1000);
	  	  WebElement myw=dr.findElement(By.className("datepick"));
	  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
	  		  for(WebElement cell: cells) {
	  			if (cell.getText().equals(dd)){  
	  			cell.click();
	  			break; 
	  		 }  
	    }Thread.sleep(1000);
   }
   public void selectSMSType(String s)
   {
    	Select sms= new Select(dr.findElement(smstype));
    	try {
	       sms.selectByVisibleText(s);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   sms.selectByIndex(1);
 	    }
   }
   public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
   {                                                                                                 
      Utility u= new Utility();                                                                    
      dr.findElement(show).click();                                                                
      Thread.sleep(5000);                                                                          
      u.captureScreenshot(dr,schl,r,sc);                                                           
      u.downloadPDF(dr);                                                                           
   } 
 }
