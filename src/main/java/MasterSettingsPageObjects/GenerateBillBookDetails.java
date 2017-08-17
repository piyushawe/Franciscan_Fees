package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenerateBillBookDetails {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "GenerateBillBookDetails";
	
	@FindBy(id="ContentPlaceHolder1_ddlInstallment")WebElement installment;
	@FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
	
	public GenerateBillBookDetails(WebDriver d)
	{
	  this.dr=d;
	  PageFactory.initElements(d, this);
	}
	public void openGenerateBillBookDetails()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Generate Bill Book Details")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Generate Bill Book Details")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
    }
	public void selectInstallment(String inst)
	{
		try {
	     new Select(installment).selectByVisibleText(inst);
		}
		catch(Exception e)
		{
			System.out.println("Element/Text not present");
			new Select(installment).selectByIndex(0);
		}
	}
	public void clickShow(String schl,Collection<String>sc) throws InterruptedException, IOException
	{
		show.click();
		Thread.sleep(1000);
		u.captureScreenshot(dr, schl, pg, sc);
	}
}
