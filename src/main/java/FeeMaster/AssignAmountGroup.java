package FeeMaster;

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

public class AssignAmountGroup {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "AssignAmountGroup";

	@FindBy(id="ContentPlaceHolder1_ddlFeeGroup")WebElement feegroup;
	@FindBy(id="ContentPlaceHolder1_ddlInstallment")WebElement installment;
	@FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement save;
	@FindBy(name="ctl00$ContentPlaceHolder1$btn_view$ctl00")WebElement show;

	public AssignAmountGroup(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openAssignAmountGroup()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Assign Amount Group")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Assign Amount Group")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void selectFeeGroup(String feegp)
	{
		new Select(feegroup).selectByVisibleText(feegp);
	}
	public void selectInstallment(String inst)
	{
		new Select(installment).selectByVisibleText(inst);
	}
	public void clickSave(String school, Collection<String> sc)throws IOException
	{
		save.click();
		u.verifySave(dr, school, pg, sc);
	}
	public void clickShow()
	{
		show.click();
	}
}
