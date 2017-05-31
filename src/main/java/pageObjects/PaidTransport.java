package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PaidTransport {
  WebDriver dr;
  String r= "PaidTransport";
  
  By school= By.id("ContentPlaceHolder1_ddlSchool");
  //By cls= By.id("ContentPlaceHolder1_lstClass");
  By route= By.id("ContentPlaceHolder1_ddlRoute");
  By vehicle= By.id("ContentPlaceHolder1_ddlVehicle");
  //By paymode= By.id("ContentPlaceHolder1_lstPayMode");
  //By installment= By.id("ContentPlaceHolder1_lstInstallment");
  By datefrom= By.id("ContentPlaceHolder1_txtDateFrom_TextBox");
  By dateto= By.id("ContentPlaceHolder1_txtDateTo_TextBox");
  By user= By.id("ContentPlaceHolder1_ddlUser");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
  
  public PaidTransport(WebDriver d)
  {
	  this.dr=d;
  }
  public void openPaidTransport() throws InterruptedException
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 WebElement submenu= dr.findElement(By.linkText("Transport Report"));
		 builder.moveToElement(submenu).build().perform();
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 dr.findElement(By.linkText("Paid Transport")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Paid Transport")));
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
  	//new Select(dr.findElement(cls)).selectByVisibleText(c);
	  dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(2) > div > button")).click();
	  dr.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[5]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(c.equals(option.getText()))
	  			option.click();
	  	dr.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li.ui-multiselect-close")).click();
  }
  public void selectRoute(String r)
  {
	try {  
  	  new Select(dr.findElement(route)).selectByVisibleText(r);
	}
	catch(NoSuchElementException e)
	{
	   new Select(dr.findElement(route)).selectByIndex(1);
	}
  }
  public void selectVehicle(String v)
  {
	try {  
  	   new Select(dr.findElement(vehicle)).selectByVisibleText(v);
	}
	catch(NoSuchElementException e)
	{
	   new Select(dr.findElement(vehicle)).selectByIndex(1);
	}
  }
  public void selectPayMode(String pmode1, String pmode2)
  {
 	 //new Select(dr.findElement(paymode)).selectByVisibleText(pmode);
	  dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(5) > div > button")).click();
	  dr.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(pmode1.equals(option.getText())||pmode2.equals(option.getText()))
	  			option.click();
	  	dr.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li.ui-multiselect-close")).click();
  }
  public void selectInstallment(String inst)
  {
  	//new Select(dr.findElement(installment)).selectByVisibleText(inst);
	  dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(6) > div > button")).click();
	  dr.findElement(By.cssSelector("body > div:nth-child(5) > div > ul > li:nth-child(2) > a")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[3]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(inst.equals(option.getText()))
	  			option.click();
	  	dr.findElement(By.cssSelector("body > div:nth-child(5) > div > ul > li.ui-multiselect-close")).click();
  }
  public void selectDateFrom(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(datefrom).click();
  	  Thread.sleep(1000);
  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(1000);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
  	  Thread.sleep(1000);
  	  WebElement myw=dr.findElement(By.className("datepick"));
        List<WebElement> rows= myw.findElements(By.className("datepick-days-row"));
  		for (WebElement row: rows){  
  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
  		  for(WebElement cell: cells) {
  			if (cell.getText().equals(dd)){  
  			//System.out.println("cell value"+cell.getText());
  			cell.click();
  			break; 
  		 }  
  	    }
    }Thread.sleep(1000);
  }
  public void selectDateTo(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(dateto).click();
  	  Thread.sleep(1000);
  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(1000);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
  	  Thread.sleep(1000);
  	  WebElement myw=dr.findElement(By.className("datepick"));
        List<WebElement> rows= myw.findElements(By.className("datepick-days-row"));
  		for (WebElement row: rows){  
  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
  		  for(WebElement cell: cells) {
  			if (cell.getText().equals(dd)){  
  			//System.out.println("cell value"+cell.getText());
  			cell.click();
  			break; 
  		 }  
  	    }
    }Thread.sleep(1000);
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
  public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
  {                                                                                                 
     Utility u= new Utility();                                                                    
     dr.findElement(show).click();                                                                
     Thread.sleep(7000);                                                                          
     u.captureScreenshot(dr,schl,r,sc);                                                           
     u.downloadPDF(dr);                                                                           
  } 
}
