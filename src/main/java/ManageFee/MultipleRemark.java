package ManageFee;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class MultipleRemark {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "MultipleRemark";
				
	public MultipleRemark(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openMultipleRemark()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Manage-Fee.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Multiple Remark")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Multiple Remark")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
