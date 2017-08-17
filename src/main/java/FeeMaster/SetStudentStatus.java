package FeeMaster;

import java.io.IOException;
import java.util.Collection;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SetStudentStatus {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "SetStudentStatus";
				
	public SetStudentStatus(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openSetStudentStatus()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Set Student Status")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Set Student Status")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
