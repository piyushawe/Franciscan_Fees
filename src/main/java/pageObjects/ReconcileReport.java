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

public class ReconcileReport {
	WebDriver dr;
	String r= "ReconcileReport";
	
	By school= By.id("ContentPlaceHolder1_ddlSchool");
	//By cls= By.id("//*[@id=\"MainLeftPanel\"]/div/div/div[2]/div/button");
	By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
	//By installment= By.id("ContentPlaceHolder1_lstInstallment");
	By user= By.id("ContentPlaceHolder1_ddlUser");
	By summary= By.id("ContentPlaceHolder1_RbtnReconcile_0");
	By consolidated= By.id("ContentPlaceHolder1_RbtnReconcile_1");
	By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
	
	public ReconcileReport(WebDriver d)
    {
	    this.dr=d;
    }
    public void openReconcileReport() throws InterruptedException
    {
    	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
         //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         Thread.sleep(5000);
         Actions builder= new Actions(dr);
      	 builder.moveToElement(menu).build().perform();
      	 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         dr.findElement(By.linkText("Reconcile Report")).click();
         dr.switchTo().frame(dr.findElement(By.id("Reconcile Report")));
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
    	dr.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a")).click();
    	WebElement select= dr.findElement(By.xpath("/html/body/div[3]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(c.equals(option.getText()))
	  			option.click();
        dr.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]")).click();
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
    	//new Select(dr.findElement(installment)).selectByVisibleText(inst);
    	dr.findElement(By.cssSelector("#MainLeftPanel > div > div > div:nth-child(4) > div > button")).click();
    	dr.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a")).click();
    	WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(inst.equals(option.getText()))
	  			option.click();
        dr.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]")).click();
    }
    public void selectUser(String usr)
    {
    	try {
    	  new Select(dr.findElement(user)).selectByVisibleText(usr);
    	}
    	catch(NoSuchElementException e)
 	    {
 		   new Select(dr.findElement(user)).selectByIndex(1);
 	    }
    }
    public void clickSummary()
    {
    	dr.findElement(summary).click();
    }
    public void clickConsolidated()
    {
    	dr.findElement(consolidated).click();
    }
    public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException  
    {                                                                                                 
       Utility u= new Utility();                                                                    
       dr.findElement(show).click();
		Utilities ut= new Utilities();
		ut.verifyShow(dr,schl,r,sc);
       Thread.sleep(9000);                                                                          
       u.captureScreenshot(dr,schl,r,sc);                                                           
       //u.downloadPDF(dr);
    } 
}
