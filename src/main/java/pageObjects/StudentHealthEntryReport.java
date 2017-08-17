package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StudentHealthEntryReport {
WebDriver dr;
String r= "StudentHealthEntryReport";

   By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
    
   public StudentHealthEntryReport(WebDriver d)
   {
	   this.dr=d;
   }
   public void openStudentHealthEntryReport() throws InterruptedException
   {   
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Student Health Entry Report")).click();
	  dr.switchTo().frame(dr.findElement(By.id("Student Health Entry Report")));
   }
   public void selectClass(String c)
   {
	   dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(1) > div > button")).click();
	   dr.findElement(By.xpath("//a[@class='ui-multiselect-none']")).click();
	   WebElement select= dr.findElement(By.xpath("//ul[@class='ui-multiselect-checkboxes ui-helper-reset']"));
	   List<WebElement> options= select.findElements(By.tagName("span"));
	   for(WebElement option:options)
	   {
		   if(c.equals(option.getText())){
			 option.click();   
		   }
	   }dr.findElement(By.className("ui-multiselect-close")).click();
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
