package FeeMaster;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;

public class CreateStudentsFeeStructure {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "CreateStudentsFeeStructure";
				
	public CreateStudentsFeeStructure(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openCreateStudentsFeeStructure()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Create Students Fees Structure")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Create Students Fees Structure")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
}
