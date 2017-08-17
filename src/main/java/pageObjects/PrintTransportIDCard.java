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

public class PrintTransportIDCard {
	WebDriver dr;
	String r="PrintTransportIDCard";
	By school= By.id("ContentPlaceHolder1_ddlSchool");
	By cls= By.id("ContentPlaceHolder1_ddlStandard");
	By section= By.id("ContentPlaceHolder1_ddlSection");
	By student= By.id("ContentPlaceHolder1_txtName");
	By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btn_print\"]/input");
	
	public PrintTransportIDCard(WebDriver d)
    {
	    this.dr=d;
    }
    public void openPrintTransportIDCard() throws InterruptedException
    {
      WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
      Thread.sleep(5000);
      Actions builder= new Actions(dr);
   	  builder.moveToElement(menu).build().perform();
      WebElement submenu= dr.findElement(By.linkText("Transport Report"));
   	  builder.moveToElement(submenu).build().perform();
   	  Actions builder1= new Actions(dr);
	  builder1.moveToElement(dr.findElement(By.cssSelector("#form2 > div.menu-h > div > ul > li:nth-child(8) > ul > li:nth-child(18) > ul > li:nth-child(7) > a"))).click().perform();;
      //dr.findElement(By.linkText("Print TransportId Card")).click();
      dr.switchTo().frame(dr.findElement(By.id("Print TransportId Card")));
    }
    public void selectSchool(String s)
    {
    	try {
    	   new Select(dr.findElement(school)).selectByVisibleText(s);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   new Select(dr.findElement(school)).selectByIndex(1);
 	    }
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
    public void enterStudent(String stu)
    {
    	dr.findElement(student).sendKeys(stu);
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
