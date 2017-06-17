package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;
import org.openqa.selenium.support.ui.Select;

public class StudentHealthEntry {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "StudentHealthEntry";

	@FindBy(id="ContentPlaceHolder1_ddlclass")WebElement cls;
	@FindBy(id="ContentPlaceHolder1_ddlsection")WebElement section;
	@FindBy(id="ContentPlaceHolder1_ddlTerm")WebElement term;
	@FindBy(name="ctl00$ContentPlaceHolder1$btnSave$ctl00")WebElement save;

	public StudentHealthEntry(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
    }
	public void openStudentHealthEntry()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Student Health Entry")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Student Health Entry")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
    }
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void selectClass()
	{
		new Select(cls).selectByIndex(1);
	}
	public void selectSection()
	{
		new Select(section).selectByIndex(1);
	}
	public void selectTerm()
	{
		new Select(term).selectByIndex(1);
	}
	public void clickSave(String school, Collection<String> sc)throws IOException
	{
		save.click();
		u.verifySave(dr, school, pg, sc);
	}
}
