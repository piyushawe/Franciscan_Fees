package pageObjects;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StudentDetails {
  WebDriver dr;
  String r= "StudentDetails";
  
  By groupbyclass= By.id("ContentPlaceHolder1_chkgrpclass");
  By show= By.name("ctl00$ContentPlaceHolder1$SingleButton1$ctl00");
  
  public StudentDetails(WebDriver d)
  {
	  this.dr= d;
  }
  public void openStudentDetails()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Student Details")).click();
	  dr.switchTo().frame(dr.findElement(By.id("Student Details")));
  }
  public void clickGroupByClass()
  {
	  dr.findElement(groupbyclass).click();
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
