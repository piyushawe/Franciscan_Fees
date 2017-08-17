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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class TransportReportClassWise {
WebDriver dr;
String r= "TransportReportClassWise";

    By classwise= By.id("ContentPlaceHolder1_rbtnClass");
    By busstopwise= By.id("ContentPlaceHolder1_rbtnStop");
    By installment= By.id("ContentPlaceHolder1_ddlInstallment");
    By stopfare= By.id("ContentPlaceHolder1_txtStopFare_TextBox");
    By route= By.id("ContentPlaceHolder1_ddlroute");
    By busstop=	By.id("ContentPlaceHolder1_ddlStop");	
  //By cls= By.id("ContentPlaceHolder1_lstClass");
    By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
    public TransportReportClassWise(WebDriver d)
    {
    	this.dr=d;
    }
    public void openTransportReportClassWise() throws InterruptedException
	 {   
	     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 WebElement submenu= dr.findElement(By.linkText("Transport Report"));
		 builder.moveToElement(submenu).build().perform();
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 dr.findElement(By.linkText("Transport Report Class Wise")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Transport Report Class Wise")));
	 }
    public void clickClassWise()
    {
    	dr.findElement(classwise).click();
    }
    public void clickBusStopWise()
    {
    	dr.findElement(busstopwise).click();
    }
    public void selectInstallment(String inst)
    {
    	try{
    	    // Waits for 20 seconds
    	    WebDriverWait wait = new WebDriverWait(dr, 20);
    	    // Wait until expected condition size of the dropdown increases and becomes more than 1
    	    wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>(){
    	        public Boolean apply(WebDriver driver)  
    	        {
    	        	return new Select(dr.findElement(installment)).getOptions().size()>1;
    	        }
    	    });
    	    //To select the first option
    	    try {
    	     new Select(dr.findElement(installment)).selectByVisibleText(inst);
    	    }
    	    catch(NoSuchElementException e)
    		{
    	       new Select(dr.findElement(installment)).selectByIndex(1);
    	    }
    	}catch(Throwable e){
    	    System.out.println("Error found: "+e.getMessage());
    	}
    }
    public void enterStopFare(String f)
    {
    	dr.findElement(stopfare).sendKeys(f);
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
    public void selectBusStop(String s)
    {
    	try {
     	  new Select(dr.findElement(busstop)).selectByVisibleText(s);
    	}
    	catch(NoSuchElementException e)
		{
	       new Select(dr.findElement(busstop)).selectByIndex(1);
	    }
    }
    public void selectClass(String c)
    {
    	dr.findElement(By.xpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all']")).click();
    	dr.findElement(By.xpath("//a[@class='ui-multiselect-none']")).click();
    	WebElement select= dr.findElement(By.cssSelector("body > div.ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all > ul"));
    	List<WebElement>options= select.findElements(By.tagName("span"));
    	for(WebElement option:options) {
      		if(c.equals(option.getText()))
      			option.click();
    	}
    	dr.findElement(By.xpath("//a[@class='ui-multiselect-close']")).click();
    }
    public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException {
        Utility u = new Utility();
        dr.findElement(show).click();
        Utilities ut = new Utilities();
        ut.verifyShow(dr, schl, r, sc);
        sleep(7000);
        u.captureScreenshot(dr, schl, r, sc);
        //u.downloadPDF(dr);
    }
}
