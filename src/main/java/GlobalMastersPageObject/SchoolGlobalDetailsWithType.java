package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class SchoolGlobalDetailsWithType {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "SchoolGlobalDetailsWithType";
		
  public SchoolGlobalDetailsWithType(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openSchoolGlobalDetailsWithType()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 WebElement submenu= dr.findElement(By.linkText("Define School"));
	 builder.moveToElement(submenu).build().perform();
	 dr.findElement(By.linkText("School Global Details With Type")).click();
	 dr.switchTo().frame(dr.findElement(By.id("School Global Details With Type")));
	 dr.findElement(By.xpath("//div[@class='content']")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	 Thread.sleep(1000);
	 u.captureScreenshot(dr, schl, pg, sc);
  }
}
