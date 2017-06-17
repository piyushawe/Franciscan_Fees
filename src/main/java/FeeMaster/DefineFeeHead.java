package FeeMaster;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MasterSettingsPageObjects.Utility;
import org.openqa.selenium.support.ui.Select;

public class DefineFeeHead {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "DefineFeeHead";

	@FindBy(id="ContentPlaceHolder1_txtHeadName_TextBox")WebElement headname;
	@FindBy(id="ContentPlaceHolder1_txtPrintHead_TextBox")WebElement headprintname;
	@FindBy(id="ContentPlaceHolder1_ddlPaySchedule")WebElement payschedule;
	@FindBy(id="ContentPlaceHolder1_txtPriority_TextBox")WebElement priorityno;
	@FindBy(id="ContentPlaceHolder1_ddlType")WebElement type;
	@FindBy(id="ContentPlaceHolder1_chkIsShowCerti")WebElement showincertificate;
	@FindBy(id="ContentPlaceHolder1_chkIsRefund")WebElement feerefundable;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

	public DefineFeeHead(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineFeeHead()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Fee Head")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Fee Head")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterHeadName(String hname)
	{
		headname.sendKeys(hname);
	}
	public void enterHeadPrintName(String hpname)
	{
		headprintname.sendKeys(hpname);
	}
	public void selectPayschedule(String pschedule)
	{
		new Select(payschedule).selectByVisibleText(pschedule);
	}
	public void selectType(String typ)
	{
		new Select(type).selectByVisibleText(typ);
	}
	public void selectShowInCertificate()
	{
		showincertificate.click();
	}
	public void selectFeeRefundable()
	{
		feerefundable.click();
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
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptFeeHead')]")).click();
				break;
			}
		dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
