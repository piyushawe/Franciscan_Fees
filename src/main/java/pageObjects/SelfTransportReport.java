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

public class SelfTransportReport {
WebDriver dr;
String r= "SelfTransportReport";

    By transport= By.id("ContentPlaceHolder1_ddltransport");
    By cls= By.id("ContentPlaceHolder1_ddlClass");
    By section= By.id("ContentPlaceHolder1_ddlSection");
    By all= By.id("ContentPlaceHolder1_rdbOption_0");
    By active= By.id("ContentPlaceHolder1_rdbOption_1");
    By inactive= By.id("ContentPlaceHolder1_rdbOption_2");
    By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
    
    public SelfTransportReport(WebDriver d)
    {
	   this.dr=d;
    }
    public void openSelfTransportReport() throws InterruptedException
      {
	     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	     //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Thread.sleep(6000);
	     Actions builder= new Actions(dr);
    	 builder.moveToElement(menu).build().perform();
	     WebElement submenu= dr.findElement(By.linkText("Transport Report"));
	     builder.moveToElement(submenu).build().perform();
	     System.out.println(dr.findElement(By.linkText("Self Transport Report")).getAttribute("display"));
	     //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     dr.findElement(By.linkText("Self Transport Report")).click();
	     dr.switchTo().frame(dr.findElement(By.id("Self Transport Report")));
      }
    public void selectTransport(String t)
    {
    	Select tr= new Select(dr.findElement(transport));
    	try {
    	   tr.selectByVisibleText(t);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   tr.selectByIndex(1);
 	    }
    }
    public void selectClass(String c) throws InterruptedException
    {
    	Select cs= new Select(dr.findElement(cls));
    	try {
    	  cs.selectByVisibleText(c);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   cs.selectByIndex(1);
 	    }
    	Thread.sleep(3000);
    }
    public void selectSection(String s)
    {
    	Select sec= new Select(dr.findElement(section));
    	try {
    	  sec.selectByVisibleText(s);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   sec.selectByIndex(1);
 	    }
    }
    public void clickAll()
    {
    	dr.findElement(all).click();
    }
    public void clickActive()
    {
    	dr.findElement(active).click();
    }
    public void clickInActive()
    {
    	dr.findElement(inactive).click();
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
