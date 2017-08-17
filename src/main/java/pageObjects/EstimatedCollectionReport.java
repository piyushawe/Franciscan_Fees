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

public class EstimatedCollectionReport {
   WebDriver dr;
   String r= "EstimatedCollectionReport";
   
   By school= By.id("ContentPlaceHolder1_ddlSchool");
   //By cls= By.id("ContentPlaceHolder1_lstClass");
   By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
   //By installment= By.id("ContentPlaceHolder1_lstInstallment");
   By user= By.id("ContentPlaceHolder1_ddlUser");
   By tilldate= By.id("ContentPlaceHolder1_txtDateTo_TextBox");
   By reportfilter= By.id("ContentPlaceHolder1_ddl_reportsrch");
   By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
	 
	public EstimatedCollectionReport(WebDriver d)
    {
  	  this.dr=d;
    }
    public void openEstimatedCollectionReport() throws InterruptedException
    {
  	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 WebElement submenu= dr.findElement(By.linkText("Collection"));
		 builder.moveToElement(submenu).build().perform();
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 dr.findElement(By.linkText("Estimated Collection Report")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Estimated Collection Report")));
    }
    public void selectSchool(String sch)
    {
    	try {
    	  new Select(dr.findElement(school)).selectByVisibleText(sch);
    	}
    	catch(NoSuchElementException e)
  	    {
   		 new Select(dr.findElement(school)).selectByIndex(1);
  	    }
    }
    public void selectClass(String c)
    {
    	dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(3) > div > button")).click();
    	dr.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a")).click();
    	WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(c.equals(option.getText()))
	  			option.click();
    	dr.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li.ui-multiselect-close")).click();
    }
    public void selectFeeType(String ftype)
    {
    	try {
    	   new Select(dr.findElement(feetype)).selectByVisibleText(ftype);
    	}
    	catch(NoSuchElementException e)
  	    {
   		 new Select(dr.findElement(feetype)).selectByIndex(1);
  	    }
    }
    public void selectInstallment(String inst)
    {
    	dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(6) > div > button")).click();
    	dr.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a")).click();
    	WebElement select= dr.findElement(By.xpath("/html/body/div[3]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(inst.equals(option.getText()))
	  			option.click();
    	dr.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li.ui-multiselect-close")).click();
    }
    public void selectUser(String u)
    {
    	try {
   	          new Select(dr.findElement(user)).selectByVisibleText(u);
    	}
    	catch(NoSuchElementException e)
  	    {
   		 new Select(dr.findElement(user)).selectByIndex(1);
  	    }
    }
    public void selectTillDate(String mm, String yy, String dd) throws InterruptedException
    {
    	dr.findElement(tilldate).click();
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
    public void selectReportFilter(String rfilter)
    {
    	new Select(dr.findElement(reportfilter)).selectByVisibleText(rfilter);
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
