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

public class ChequeClearingStatusReport {
WebDriver dr;
String r="ChequeClearingStatusReport";

  By fromdate= By.id("ContentPlaceHolder1_txtDateFrom_TextBox");
  By todate= By.id("ContentPlaceHolder1_txtdateTo_TextBox");
  By school=By.id("ContentPlaceHolder1_ddlSchoolSubHead");
  By feetype=By.id("ContentPlaceHolder1_ddlFeeType");
  By head= By.id("ContentPlaceHolder1_ddlFeeHeadToshown");
  By receiptnorange= By.id("ContentPlaceHolder1_chkReceiptNoRange");
  By from= By.id("ContentPlaceHolder1_txtFrom_TextBox");
  By to= By.id("ContentPlaceHolder1_txtTo_TextBox");
  By chequedetails= By.id("ContentPlaceHolder1_lstchqdtls");
  By headwise=By.name("ctl00$ContentPlaceHolder1$rbtnShowCollection");
  By withoutheadtotalamount=By.id("ContentPlaceHolder1_rbtnShowCollection_1");
  By user= By.id("ContentPlaceHolder1_ddlUser");
  By clearingstatus= By.id("ContentPlaceHolder1_ddlclearstatus");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_btnShow\"]/input");

  public ChequeClearingStatusReport(WebDriver d)
  {
	  this.dr=d;
  }
//openChequeClearingStatus report  
  public void openChequeClearingStatusReport() throws InterruptedException
  {
	  WebElement menu;
   	  Actions builder= new Actions(dr);
      menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
      Thread.sleep(4000);
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Cheque Clearing Status Report"));
	  menuop1.click();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  dr.switchTo().frame(dr.findElement(By.id("Cheque Clearing Status Report")));
  }
  public void selectEntryMode(String emode)
  {
	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[1]/div/div/button")).click();
	  dr.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
		List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(emode.equals(option.getText()))
	  			option.click();
	  dr.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]")).click();
  }
  public void selectFromDate(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(fromdate).click();
  	  Thread.sleep(1000);
  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(500);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
  	  Thread.sleep(500);
  	  WebElement myw=dr.findElement(By.className("datepick"));     
  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
  		  for(WebElement cell: cells) {
  			if (cell.getText().equals(dd)){    			
  			cell.click();
  			break; 
  		 }      
    }Thread.sleep(1000);
  }
  public void selectToDate(String mm, String yy, String dd) throws InterruptedException
  {
	  dr.findElement(todate).click();
  	  Thread.sleep(1000);
  	  new Select(dr.findElement(By.className("datepick-new-month"))).selectByVisibleText(mm);
      Thread.sleep(500);
      new Select(dr.findElement(By.className("datepick-new-year"))).selectByVisibleText(yy);
  	  Thread.sleep(500);
  	  WebElement myw=dr.findElement(By.className("datepick"));    
  		 List<WebElement> cells=myw.findElements(By.tagName("td"));
  		  for(WebElement cell: cells) {
  			if (cell.getText().equals(dd)){   			
  			cell.click();
  			break; 
  		 }   
    }Thread.sleep(1000);
  }
  public void selectClass(String c)
  {
	dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[4]/div/div/button")).click();
  	dr.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]/a")).click();
  	WebElement select = dr.findElement(By.cssSelector("body > div:nth-child(8) > ul"));
  	List<WebElement> options = select.findElements(By.tagName("span"));
  	for(WebElement option:options)
  		if(c.equals(option.getText()))
  			option.click();
  	dr.findElement(By.xpath("/html/body/div[5]/div/ul/li[3]")).click();
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
  public void selectBankName(String bname)
  {
	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[7]/div/button")).click();
	  dr.findElement(By.xpath("/html/body/div[7]/div/ul/li[2]/a")).click();
	  WebElement select = dr.findElement(By.cssSelector("body > div:nth-child(10) > ul"));
	  	List<WebElement> options = select.findElements(By.tagName("span"));
	  	for(WebElement option:options)
	  		if(bname.equals(option.getText()))
	  			option.click();
	  dr.findElement(By.xpath("/html/body/div[7]/div/ul/li[3]")).click();
  }
  public void selectHead(String h)
  {
	  new Select(dr.findElement(head)).selectByVisibleText(h);
  }
  public void clickReceiptNoRange()
  {
	  dr.findElement(receiptnorange).click();
  }
  public void enterReceiptRange(String f, String t)
  {
	  dr.findElement(from).sendKeys(f);
	  dr.findElement(to).sendKeys(t);
  }
  public void selectChequeDetails(String dt)
  {
	  new Select(dr.findElement(chequedetails)).selectByVisibleText(dt);
  }
  public void clickHeadWise()
  {   
	  if(dr.findElement(headwise).isSelected()) {
		  
	  }else
	     dr.findElement(headwise).click();
  }
  public void clickWithOutHeadTotalAmount()
  {
	  dr.findElement(withoutheadtotalamount).click();
  }
  public void selectUser(String usr)
  {
	  new Select(dr.findElement(user)).selectByVisibleText(usr);
  }
  public void selectClearingStatus(String cstatus)
  {
	  new Select(dr.findElement(clearingstatus)).selectByVisibleText(cstatus);
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
