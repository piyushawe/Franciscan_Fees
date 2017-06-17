package GlobalMastersPageObject;

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

public class DefineWing {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "DefineWing";

	@FindBy(id="ContentPlaceHolder1_txtWingName_TextBox")WebElement wing;
    @FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
    @FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

	public DefineWing(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
    }
	public void openDefineWing()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Wing")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Wing")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
     }
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	    Thread.sleep(1000);
	    u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterWing(String lang)
	{
		wing.sendKeys(lang);
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
		dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
