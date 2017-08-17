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

public class DefineConcessionType {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "DefineConcessionType";

	@FindBy(id="ContentPlaceHolder1_txtConcType_TextBox")WebElement concessiontype;
	@FindBy(id="ContentPlaceHolder1_BtnAllEvent_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnAllEvent_btnView")WebElement view;

	public DefineConcessionType(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineConcessionType()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Master.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Concession Type")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Concession Type")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterConcessionType(String ctype)
	{
		concessiontype.sendKeys(ctype);
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
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptwingDefine')]")).click();
				break;
			}

		dr.findElement(By.id("ContentPlaceHolder1_BtnAllEvent_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
