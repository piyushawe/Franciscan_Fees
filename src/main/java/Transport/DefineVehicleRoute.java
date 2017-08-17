package Transport;

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

public class DefineVehicleRoute {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "DefineVehicleRoute";

	@FindBy(id="ContentPlaceHolder1_txtRouteNo_TextBox")WebElement routeno;
	@FindBy(id="ContentPlaceHolder1_txtRouteDescription_TextBox")WebElement routedescription;
	@FindBy(id="ContentPlaceHolder1_txtRouteInChargeName_TextBox")WebElement routeinchargename;
	@FindBy(id="ContentPlaceHolder1_txtRouteInChargeMobileNo_TextBox")WebElement routeinchmobileno;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

	public DefineVehicleRoute(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineVehicleRoute()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transport.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Vehicle Route")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Vehicle Route")));
	   dr.findElement(By.xpath("//div[@class='float oneOne']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void enterRouteNo(String rno)
	{
		routeno.sendKeys(rno);
	}
	public void enterRouteDescription(String rd)
	{
		routedescription.sendKeys(rd);
	}
	public void enterRouteInchargeName(String rinchn)
	{
		routeinchargename.sendKeys(rinchn);
	}
	public void enterRouteInchargeMobileNo(String rimno)
	{
		routeinchmobileno.sendKeys(rimno);
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
