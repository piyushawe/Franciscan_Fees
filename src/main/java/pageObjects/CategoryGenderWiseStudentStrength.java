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

public class CategoryGenderWiseStudentStrength {
WebDriver dr;
String r="CategoryGenderWiseStudentStrength";

	By cls= By.id("ContentPlaceHolder1_ddlClass");
	By sectionwise= By.id("ContentPlaceHolder1_chkForSection");
	By section= By.id("ContentPlaceHolder1_ddlSection");
	By categorywise= By.id("ContentPlaceHolder1_rdbOption_0");
	By genderwise= By.id("ContentPlaceHolder1_rdbOption_1");
	By categoryandgenderwise= By.id("ContentPlaceHolder1_rdbOption_2");
	By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
	
	public CategoryGenderWiseStudentStrength(WebDriver d)
    {
	    this.dr=d;
    }
//open category gender wise student strength	
    public void openCategoryGenderWiseStudentStrength() throws InterruptedException
    {   
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   WebElement submenu= dr.findElement(By.linkText("Student Strength"));
	   builder.moveToElement(submenu).build().perform();
	   dr.findElement(By.linkText("Category / Gender Wise Student Strength")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Category / Gender Wise Student Strength")));
     }
//class    
   public void selectClass(String c)
   {
	   Select cs= new Select(dr.findElement(cls));
	   try {
	     cs.selectByVisibleText(c);
	   }
	   catch(NoSuchElementException e)
	   {
		   cs.selectByIndex(1);
	   }
   }
//section wise   
   public void checkClickForSectionwise() throws InterruptedException
   {
	   dr.findElement(sectionwise).click();
	   Thread.sleep(2000);
   }
//section   
   public void selectSection(String s)
   {
	  try {
	    new Select(dr.findElement(section)).selectByVisibleText(s);
	  }
	  catch(NoSuchElementException e)
	   {
		  new Select(dr.findElement(section)).selectByIndex(1);
	   }
   }
//category wise   
   public void clickCategoryWise()
   {
	   dr.findElement(categorywise).click();
   }
//gender wise   
   public void clickGenderWise()
   {
	   dr.findElement(genderwise).click();
   }
//category and gender wise   
   public void clickCategoryAndGenderWise()
   {
	   dr.findElement(categoryandgenderwise).click();
   }
//show   
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
