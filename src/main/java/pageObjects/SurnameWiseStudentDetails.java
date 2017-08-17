package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class SurnameWiseStudentDetails {
    WebDriver dr;
    String r="SurnameWiseStudentDetails";
    
    By cls= By.id("ContentPlaceHolder1_ddlclass");
    By section= By.name("ctl00$ContentPlaceHolder1$ddlsection");
    //By student= By.id("ContentPlaceHolder1_lstStudent");
    By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
	
    public SurnameWiseStudentDetails(WebDriver d)
    {
    	this.dr=d;
    }
    public void openSurnameWiseStudentDetails() throws InterruptedException
    {
       WebElement menu;
       Actions builder= new Actions(dr);
       menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
       Thread.sleep(4000);
  	   builder.moveToElement(menu).build().perform();
  	   WebElement menuop1= dr.findElement(By.linkText("Surname Wise Student Details"));
  	   menuop1.click();
  	   dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  	   dr.switchTo().frame(dr.findElement(By.id("Surname Wise Student Details")));
    }
    public void selectClass(String c)throws InterruptedException
    {
    	try {
    	  new Select(dr.findElement(cls)).selectByVisibleText(c);
    	}
    	catch(NoSuchElementException e)
   	    {
    		new Select(dr.findElement(cls)).selectByIndex(1);
   	    }
    	Thread.sleep(10000);
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
    public void selectStudentDetails(String adm, String c)
    {
       //new Select(dr.findElement(student)).selectByVisibleText(sdetails);
    	dr.findElement(By.xpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all']")).click();
    	dr.findElement(By.xpath("//a[@class='ui-multiselect-none']")).click();
    	WebElement select = dr.findElement(By.cssSelector("body > div.ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all > ul"));
      	List<WebElement> options = select.findElements(By.tagName("span"));
      	for(WebElement option:options)
      		if(adm.equals(option.getText())||c.equals(option.getText()))
      			option.click();
      	dr.findElement(By.xpath("//a[@class='ui-multiselect-close']")).click();
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
