package ManageFee;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class TransferConcession {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "TransferConcession";
				
	public TransferConcession(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openTransferConcession()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Manage-Fee.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Transfer Concession")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Transfer Concession")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
