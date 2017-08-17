package FeeMaster;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class DefineFeeInstallment {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "DefineFeeInstallment";

	@FindBy(id="ContentPlaceHolder1_txtInstallName_TextBox")WebElement installmentname;
	@FindBy(id="ContentPlaceHolder1_txtPrintName_TextBox")WebElement installmentprintname;
	@FindBy(id="ContentPlaceHolder1_txtPrefNo_TextBox")WebElement installmentpreferenceno;
	@FindBy(id="ContentPlaceHolder1_txtDueOn_ddlyear")WebElement dueonyear;
	@FindBy(id="ContentPlaceHolder1_txtDueOn_ddlmonth")WebElement dueonmonth;
	@FindBy(id="ContentPlaceHolder1_txtDueOn_ddlday")WebElement dueonday;
	@FindBy(id="ContentPlaceHolder1_txtDueDate_ddlyear")WebElement duedateyear;
	@FindBy(id="ContentPlaceHolder1_txtDueDate_ddlmonth")WebElement duedatemonth;
	@FindBy(id="ContentPlaceHolder1_txtDueDate_ddlday")WebElement duedateday;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

	public DefineFeeInstallment(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineFeeInstallment()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Fee Installment")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Fee Installment")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterInstallmentName(String iname)
	{
		installmentname.sendKeys(iname);
	}
	public void enterInstallmentPrintName(String ipname)
	{
		installmentprintname.sendKeys(ipname);
	}
	public void enterInstallmentPreferenceNo(String ipno)
	{
		installmentpreferenceno.sendKeys(ipno);
	}
	public void selectDueOnDateYear(String yr) throws InterruptedException {
		new Select(dueonyear).selectByVisibleText(yr);
		Thread.sleep(500);
	}
	public void selectDueOnDateMonth(String mm) throws InterruptedException {
		new Select(dueonmonth).selectByVisibleText(mm);
		Thread.sleep(500);
	}
	public void selectDueOnDateDay(String dd)
	{
		new Select(dueonday).selectByVisibleText(dd);
	}
	public void selectDueDateYear(String yr) throws InterruptedException {
		new Select(duedateyear).selectByVisibleText(yr);
		Thread.sleep(500);
	}
	public void selectDueDateMonth(String mm) throws InterruptedException {
		new Select(duedatemonth).selectByVisibleText(mm);
		Thread.sleep(500);
	}
	public void selectDueDateDay(String dd)
	{
		new Select(duedateday).selectByVisibleText(dd);
	}
	public void selectMonth(String mm)
	{
		dr.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div/div[2]/div/div/div[1]/div[6]/button")).click();
		WebElement list= dr.findElement(By.xpath("/html/body/div[3]/ul"));
		List<WebElement>options= list.findElements(By.tagName("span"));
		for (WebElement option:options)
		{
			if (option.getText().equals(mm)){
				option.click();
				break;
			}
		}
		dr.findElement(By.xpath("//li[@class='ui-multiselect-close']")).click();
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
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptInstall')]")).click();
				break;
			}
		dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
