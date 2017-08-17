package FeeMaster;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class LateFeeSetting {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "LateFeeSetting";

	@FindBy(id="ContentPlaceHolder1_ddlFeeGroup")WebElement feegroup;
	@FindBy(id="ContentPlaceHolder1_ddlFeeType")WebElement feetype;
	@FindBy(id="ContentPlaceHolder1_ddlInstallment")WebElement installment;
	@FindBy(id="ContentPlaceHolder1_txtctype")WebElement latefeetype;
	@FindBy(id="ContentPlaceHolder1_txtAmount_TextBox")WebElement amount;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;
	@FindBy(name="ctl00$ContentPlaceHolder1$BtnControls1$ctl01")WebElement cancel;

	public LateFeeSetting(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openLateFeeSetting()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Late Fee Setting")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Late Fee Setting")));
	   cancel.click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void selectFeeGroup()
	{
		new Select(feegroup).selectByIndex(1);
	}
	public void selectFeeType()
	{
		new Select(feetype).selectByIndex(1);
	}
	public void selectInstallment()
	{
		new Select(installment).selectByIndex(1);
	}
	public void selectLateFeeType() throws InterruptedException {
		latefeetype.click();
		Thread.sleep(500);
		latefeetype.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		latefeetype.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		latefeetype.sendKeys(Keys.ENTER);
	}
	public void enterAmount(String amt)
	{
		amount.sendKeys(amt);
	}
	public void clickSave(String school, Collection<String> sc)throws IOException
	{
		save.click();
		u.verifySave(dr, school, pg, sc);
	}
	public void clickView(String school, Collection<String> sc)throws IOException
	{
		view.click();
		WebElement table= dr.findElement(By.id("example"));
		List<WebElement> cells= table.findElements(By.tagName("td"));
		if (cells.size()>1) {
			for (WebElement cell : cells) {
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptlatefee')]")).click();
				break;
			}
			dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
			dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
