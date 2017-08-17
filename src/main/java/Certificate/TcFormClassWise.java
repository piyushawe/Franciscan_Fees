package Certificate;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utilities;

public class TcFormClassWise {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "TcFormClassWise";
				
	public TcFormClassWise(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openTcFormClassWise()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Certificate.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("TC Form Class Wise")).click();
	   dr.switchTo().frame(dr.findElement(By.id("TC Form Class Wise")));
	   dr.findElement(By.xpath("//div[@class='body1']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
