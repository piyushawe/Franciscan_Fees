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

public class ClassWiseMarkList {
  WebDriver dr;
  String r="ClassWiseMarkList";
  
     By cls= By.id("ContentPlaceHolder1_ddlclass");
     By section= By.id("ContentPlaceHolder1_ddlsection");
     By surnamewise=By.id("ContentPlaceHolder1_chkSurNameWise");
     By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
     
     public ClassWiseMarkList(WebDriver d)
     {
    	 this.dr=d;
     }
     public void openClassWiseMarkList() throws InterruptedException
     {
    	 WebElement menu;
         Actions builder= new Actions(dr);
         menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
         Thread.sleep(4000);
    	 builder.moveToElement(menu).build().perform();
    	 WebElement menuop1= dr.findElement(By.linkText("Class Wise Mark List"));
    	 menuop1.click();
    	 dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 dr.switchTo().frame(dr.findElement(By.id("Class Wise Mark List")));
     }
     public void selectClass(String c)
     {
    	 try {
    	   new Select(dr.findElement(cls)).selectByVisibleText(c);
    	 }
    	 catch(NoSuchElementException e)
   	     {
   		  new Select(dr.findElement(cls)).selectByIndex(1);
   	     }
     }
     public void selectSection(String sec)
     {
    	 try {
    	    new Select(dr.findElement(section)).selectByVisibleText(sec);
    	 }
    	 catch(NoSuchElementException e)
   	     {
   		  new Select(dr.findElement(section)).selectByIndex(1);
   	     }
     }
     public void clickSurnameWise()
     {
    	 dr.findElement(surnamewise).click();
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
