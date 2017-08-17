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

public class DailyFeeCollectionDateClassWise {
WebDriver dr;
String r="DailyFeeCollectionDateClassWise";

  By cls= By.id("ContentPlaceHolder1_ddlClass");
  By section= By.id("ContentPlaceHolder1_ddlSection");
  By student= By.id("ContentPlaceHolder1_txtName");
  By feehead= By.id("ContentPlaceHolder1_lstfeehead");
  By orderby= By.id("ContentPlaceHolder1_ddlorder");
  By user= By.id("ContentPlaceHolder1_ddlUser");
  By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
  
  public DailyFeeCollectionDateClassWise(WebDriver d)
  {
	  this.dr=d;
  }
  public void openDailyFeeCollectionDateClassWise() throws InterruptedException
  {
	  WebElement menu;
      menu = dr.findElement(By.xpath("//img[@src='/Images/layout/Transaction-Report.png']"));
      Thread.sleep(4000);
      Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  WebElement menuop1= dr.findElement(By.linkText("Daily Fee Collection Date/Class Wise"));
	  menuop1.click();
	  dr.switchTo().frame(dr.findElement(By.id("Daily Fee Collection Date/Class Wise")));
  }
  public void selectClass(String s)
  {
	  Select c= new Select(dr.findElement(cls));
	  try {
	     c.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
  		c.selectByIndex(1);
	  }
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
  public void searchStudent(String stu)
  {
	  dr.findElement(student).sendKeys(stu);
  }
  public void selectFeeHead(String s)
  {
	  Select fhead= new Select(dr.findElement(feehead));
	  fhead.selectByVisibleText(s);
  }
  public void selectOrderBy(String s)
  {
	  Select or= new Select(dr.findElement(orderby));
	  or.selectByVisibleText(s);
  }
  public void selectUser(String s)
  {
	  Select usr= new Select(dr.findElement(user));
	  try {
	     usr.selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	  {
  		usr.selectByIndex(1);
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
