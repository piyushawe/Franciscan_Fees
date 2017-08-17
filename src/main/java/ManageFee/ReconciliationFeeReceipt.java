package ManageFee;

import java.io.IOException;
import java.util.Collection;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ReconciliationFeeReceipt {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "ReconciliationFeeReceipt";
				
	public ReconciliationFeeReceipt(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openReconciliationFeeReceipt()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Manage-Fee.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Reconciliation Fee Receipt")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Reconciliation Fee Receipt")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
