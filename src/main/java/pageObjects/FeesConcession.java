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

public class FeesConcession {
	WebDriver dr;
	String r= "FeesConcession";
	
	By school= By.id("ContentPlaceHolder1_ddlSchool");
	By cls= By.id("ContentPlaceHolder1_ddlStandard");
	By section= By.id("ContentPlaceHolder1_ddlSection");
	By feetype= By.id("ContentPlaceHolder1_ddlFeeType");
	By consolidated= By.id("ContentPlaceHolder1_rbnsearch_0");
	By separated= By.id("ContentPlaceHolder1_rbnsearch_1");
	//By installment= By.id("ContentPlaceHolder1_lstInstallment");
	By concession= By.id("ContentPlaceHolder1_lstCon");
	By head= By.name("ctl00$ContentPlaceHolder1$ddlFeeHeadToshown");
	By tilldate= By.name("ctl00$ContentPlaceHolder1$txtDateTo$TextBox");
	By paidconcession= By.id("ContentPlaceHolder1_chkpaidconcessn");
	By entrytime= By.id("ContentPlaceHolder1_ChkEntry");
	By assigned= By.id("ContentPlaceHolder1_ChkAss");
	By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");
	
	public FeesConcession(WebDriver d)
    {
    	this.dr=d;
    }
    public void openFeesConcession() throws InterruptedException
	 {   
	     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 dr.findElement(By.linkText("Fees Concession")).click();
		 dr.switchTo().frame(dr.findElement(By.id("Fees Concession")));
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
   public void clickConsolidated()
   {
	   dr.findElement(consolidated).click();
   }
   public void clickSeparated()
   {
	   dr.findElement(separated).click();
   }
   public void selectInstallment(String inst)
   {
	   //new Select(dr.findElement(installment)).selectByVisibleText(inst);
	   dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[5]/div/button")).click();
	   dr.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	   WebElement select= dr.findElement(By.xpath("/html/body/div[3]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(inst.equals(option.getText()))
	  			option.click();
	   dr.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]")).click();
   }
   public void selectConcession(String conc)
   {
	   new Select(dr.findElement(concession)).selectByVisibleText(conc);
   }
   public void selectHead(String h)
   {
	   new Select(dr.findElement(head)).selectByVisibleText(h);
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
   public void clickPaidConcession()
   {   
	   if(dr.findElement(paidconcession).isSelected()) {
		   
	   }else
	   dr.findElement(paidconcession).click();
   }
   public void clickAssigned()
   {
      // if(dr.findElement(assigned).isSelected()) {
		   
	  // }else
	   dr.findElement(assigned).click();
   }
   public void clickEntryTime()
   {
	   if(dr.findElement(entrytime).isSelected()){
		   
	   }else
	   dr.findElement(entrytime).click();
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
