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

public class ReligionGenderWiseStudentStrength {
WebDriver dr;
String r= "ReligionGenderWiseStudentStrength";

   By cls= By.id("ContentPlaceHolder1_ddlClass");
   By sectionwise= By.id("ContentPlaceHolder1_chkForSection");
   By section= By.id("ContentPlaceHolder1_ddlSection");
   By religionwise= By.id("ContentPlaceHolder1_rdbOption_0");
   By genderwise= By.id("ContentPlaceHolder1_rdbOption_1");
   By religionandgenderwise= By.id("ContentPlaceHolder1_rdbOption_2");
   By show= By.xpath("//*[@id=\"ContentPlaceHolder1_SingleButton1\"]/input");
   
    public ReligionGenderWiseStudentStrength(WebDriver d)
    {
       this.dr=d;
    }
    public void openCategoryGenderWiseStudentStrength() throws InterruptedException
    {   
      WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
      Actions builder= new Actions(dr);
      builder.moveToElement(menu).build().perform();
      WebElement submenu= dr.findElement(By.linkText("Student Strength"));
      builder.moveToElement(submenu).build().perform();
      dr.findElement(By.linkText("Religion / Gender Wise Student Strength")).click();
      dr.switchTo().frame(dr.findElement(By.id("Religion / Gender Wise Student Strength")));
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
 	   Thread.sleep(500);
    }
    public void checkClickForSectionwise()
    {
       if(dr.findElement(sectionwise).isSelected()){
    	   
       }else
 	   dr.findElement(sectionwise).click();
    }
    public void selectSection(String s) throws InterruptedException
    {  
       Thread.sleep(1000);	
 	   Select sec= new Select(dr.findElement(section));
 	   try {
 	      sec.selectByVisibleText(s);
 	   }
 	   catch(NoSuchElementException e)
	   {
		   sec.selectByIndex(1);
	   }
    }
    public void clickReligionWise() throws InterruptedException
    {
    	Thread.sleep(1000);	
 	    dr.findElement(religionwise).click();
    }
    public void clickGenderWise() throws InterruptedException
    {
    	Thread.sleep(1000);	
 	    dr.findElement(genderwise).click();
    }
    public void clickReligionAndGenderWise() throws InterruptedException
    {
    	Thread.sleep(1000);	
 	    dr.findElement(religionandgenderwise).click();
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
