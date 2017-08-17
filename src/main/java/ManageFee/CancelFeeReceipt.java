package ManageFee;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CancelFeeReceipt {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "CancelFeeReceipt";
				
	public CancelFeeReceipt(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openCancelFeeReceipt()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Manage-Fee.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Cancel Fee Receipt")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Cancel Fee Receipt")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	   verifySearchFilter();
	}
	public void verifySearchFilter()
	{
		List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdoSearch"));
		boolean flag= false;
		int i=0;
		for(WebElement option: options)
		{
			if(options.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Search Filter is Selected");
		else
			System.out.println("Search Filter is Not Selected");
	}
}
