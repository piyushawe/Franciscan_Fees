package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class SchoolGlobalDetails {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "SchoolGlobalDetails";
			
  public SchoolGlobalDetails(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openSchoolGlobalDetails()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 WebElement submenu= dr.findElement(By.linkText("Define School"));
	 builder.moveToElement(submenu).build().perform();
	 dr.findElement(By.linkText("School Global Details")).click();
	 dr.switchTo().frame(dr.findElement(By.id("School Global Details")));
	 dr.findElement(By.xpath("//div[@class='content']")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	 Thread.sleep(1000);
	 u.captureScreenshot(dr, schl, pg, sc);
	 verifySchoolType();
  }
  public void verifySchoolType()
  {
	  List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$"));
	  boolean flag=false;
	  int i=0;
	  for(WebElement option:options)
	  {
		  if(options.get(i).isSelected())
			  flag=true;
		  i++;
	  }
	  if(flag)
		  System.out.println("School Type is Selected");
	  else
		  System.out.println("School Type is Not Selected");
  }
}
