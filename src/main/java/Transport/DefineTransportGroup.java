package Transport;

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

public class DefineTransportGroup {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "DefineTransportGroup";

	@FindBy(id="ContentPlaceHolder1_txtdistance_TextBox")WebElement distancename;
	@FindBy(id="ContentPlaceHolder1_txtamount_TextBox")WebElement distanceamount;
	@FindBy(id="ContentPlaceHolder1_txtfrom_TextBox")WebElement distancefrom;
	@FindBy(id="ContentPlaceHolder1_txtto_TextBox")WebElement distanceto;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

	public DefineTransportGroup(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineTransportGroup()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transport.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Transport Group")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Transport Group")));
	   dr.findElement(By.xpath("//div[@class='oneOne']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterDistanceName(String dname)
	{
		distancename.sendKeys(dname);
	}
	public void enterDistanceAmount(String damount)
	{
		distanceamount.sendKeys(damount);
	}
	public void enterDistanceFrom(String dfrom)
	{
		distancefrom.sendKeys(dfrom);
	}
	public void enterDistanceTo(String dto)
	{
		distanceto.sendKeys(dto);
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
				cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptView')]")).click();
				break;
			}
		dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
		dr.findElement(By.id("popup_ok")).click();
		}else
			System.out.println("No record Found");
		u.verifyView(dr,school, pg, sc);
	}
}
