package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SessionTransfer {
  WebDriver dr;
  Utilities u= new Utilities();
  String pg= "SessionTransfer";
					
  public SessionTransfer(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openSessionTransfer()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
     Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Session Transfer")).click();
	 dr.switchTo().frame(dr.findElement(By.id("Session Transfer")));
	 dr.findElement(By.xpath("//div[@class='content']")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     Thread.sleep(1000);
	 u.captureScreenshot(dr, schl, pg, sc);
  }
}
