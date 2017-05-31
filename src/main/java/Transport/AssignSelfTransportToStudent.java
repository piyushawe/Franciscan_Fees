package Transport;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class AssignSelfTransportToStudent {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "AssignSelfTransportToStudent";
				
	public AssignSelfTransportToStudent(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openAssignSelfTransportToStudent()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transport.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Assign Self Transport To Student")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Assign Self Transport To Student")));
	   dr.findElement(By.xpath("//span[@class='csslabel']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
