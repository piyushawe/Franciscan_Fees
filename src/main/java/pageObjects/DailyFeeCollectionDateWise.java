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

public class DailyFeeCollectionDateWise {
WebDriver dr;
String r= "DailyFeeCollectionDateWise";

    //By entrymode= By.id("ContentPlaceHolder1_lstentrymode");
      By fromdate= By.id("ContentPlaceHolder1_txtDateFrom_TextBox");
      By todate= By.id("ContentPlaceHolder1_txtdateTo_TextBox");
    //By cls= By.id("ContentPlaceHolder1_ddlStanard");
      By school= By.id("ContentPlaceHolder1_ddlSchoolSubHead");
      By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
    //By paymode= By.id("ContentPlaceHolder1_lstPayMode");
    //By bankname= By.id("ContentPlaceHolder1_DDlDepBank");
      By head= By.id("ContentPlaceHolder1_ddlFeeHeadToshown");
      By chqdd_details= By.id("ContentPlaceHolder1_lstchqdtls");
      By user= By.id("ContentPlaceHolder1_ddlUser");
      By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
      String exp= "DAILY FEE COLLECTION DATE WISE";
      
      public DailyFeeCollectionDateWise(WebDriver d)
      {
    	  this.dr=d;
      }
      public void openDailyFeeCollectionDateWise() throws InterruptedException
      {
    	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
 		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		 Thread.sleep(6000);
 		 Actions builder= new Actions(dr);
 		 builder.moveToElement(menu).build().perform();
 		 WebElement submenu= dr.findElement(By.linkText("Collection"));
 		 builder.moveToElement(submenu).build().perform();
 		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
 		 dr.findElement(By.linkText("Daily Fee Collection Date Wise")).click();
 		 dr.switchTo().frame(dr.findElement(By.id("Daily Fee Collection Date Wise")));
      }
      public void selectEntryMode(String emode)
      {
    	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[5]/div/div/button")).click();
    	  dr.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).click();
            WebElement select = dr.findElement(By.cssSelector("body > div:nth-child(7) > ul"));
    	  	List<WebElement> options = select.findElements(By.tagName("span"));
    	  	for(WebElement opt:options) {
      	     	//System.out.println(opt.getText());
    	  		if(emode.equals(opt.getText()))
    	  			opt.click();
    	  	}
    	  dr.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]")).click();
      }
      public void selectFromDate(String mm, String yy, String dd) throws InterruptedException
      {    dr.findElement(By.className("csslabel")).click();
           dr.findElement(fromdate).click();
    	  Thread.sleep(1000);
     	  new Select(dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/div/select[1]"))).selectByVisibleText(mm);
          Thread.sleep(500);
          new Select(dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/div/select[2]"))).selectByVisibleText(yy);
     	  Thread.sleep(500);
     	  WebElement myw=dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/table"));      
			 List<WebElement> cells=myw.findElements(By.tagName("td"));
			  for(WebElement cell: cells) {
				if (cell.getText().equals(dd)){  	
					cell.click();
				break; 
			 }  
      }Thread.sleep(500);
      }
      public void selectToDate(String mm, String yy, String dd) throws InterruptedException
      {
    	  dr.findElement(todate).click();
   	      Thread.sleep(1000);
    	  new Select(dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/div/select[1]"))).selectByVisibleText(mm);
          Thread.sleep(500);
          new Select(dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/div/select[2]"))).selectByVisibleText(yy);
    	  Thread.sleep(500);
    	  WebElement myw=dr.findElement(By.xpath("//*[@id=\"datepick-div\"]/div[3]/table"));
			 List<WebElement> cells=myw.findElements(By.tagName("td"));
			  for(WebElement cell: cells) {
				if (cell.getText().equals(dd)){  
					cell.click();
				break; 
			 }  
      }Thread.sleep(500);
      }
      public void selectClass(String c)
      {  
    	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[3]/div/div/button")).click();
     	  dr.findElement(By.xpath("/html/body/div[6]/div/ul/li[2]/a")).click();
            WebElement select = dr.findElement(By.cssSelector("body > div:nth-child(9) > ul"));
     	  	List<WebElement> options = select.findElements(By.tagName("span"));
     	  	for(WebElement option:options) {
     	  		if(c.equals(option.getText()))
     	  			option.click();
     	  	}
     	  dr.findElement(By.cssSelector("body > div:nth-child(9) > div > ul > li.ui-multiselect-close")).click();
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
      public void selectPayMode(String pmode1, String pmode2)
      {
    	  dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(7) > div > button")).click();
    	  dr.findElement(By.cssSelector("body > div:nth-child(8) > div > ul > li:nth-child(2) > a")).click();
    	  WebElement select= dr.findElement(By.xpath("/html/body/div[5]/ul"));
  		  List<WebElement> options = select.findElements(By.tagName("span"));
  	  	  for(WebElement option:options)
  	  		if(pmode1.equals(option.getText())||pmode2.equals(option.getText()))
  	  			option.click();
    	  dr.findElement(By.cssSelector("body > div:nth-child(8) > div > ul > li.ui-multiselect-close")).click();
      }
      public void selectBankName(String bname)
      {
    	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[8]/div/button")).click();
    	  dr.findElement(By.xpath("/html/body/div[9]/div/ul/li[2]/a")).click();
    	  WebElement select = dr.findElement(By.cssSelector("body > div:nth-child(12) > ul"));
   	      List<WebElement> options = select.findElements(By.tagName("span"));
   	    	for(WebElement option:options)
   	  		if(bname.equals(option.getText()))
   	  		   option.click();
    	    dr.findElement(By.cssSelector("body > div:nth-child(12) > div > ul > li.ui-multiselect-close")).click();
      }
      public void selectHead(String h)
      {
    	 // new Select(dr.findElement(head)).selectByVisibleText(h);
      }
      public void selectChequeDD_Details(String cd)
      {
    	//  new Select(dr.findElement(chqdd_details)).selectByVisibleText(cd);
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
		 Utilities ut= new Utilities();
		 ut.verifyShow(dr,schl,r,sc);
         Thread.sleep(5000);                                                                          
         u.captureScreenshot(dr,schl,r,sc);                                                           
         //u.downloadPDF(dr);
      } 
}
