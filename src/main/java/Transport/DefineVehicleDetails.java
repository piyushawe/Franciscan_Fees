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

import MasterSettingsPageObjects.Utilities;
import org.openqa.selenium.support.ui.Select;

public class DefineVehicleDetails {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "DefineVehicleDetails";

	@FindBy(name="ctl00$ContentPlaceHolder1$TransPort")List<WebElement>options;
	@FindBy(id="ContentPlaceHolder1_ddlVehicleType")WebElement vehicletype;
	@FindBy(id="ContentPlaceHolder1_txtVehicleName_TextBox")WebElement vehiclename;
	@FindBy(id="ContentPlaceHolder1_txtVehicleNo_TextBox")WebElement vehicleregno;
	@FindBy(id="ContentPlaceHolder1_txtDriverName_TextBox")WebElement drivername;
	@FindBy(id="ContentPlaceHolder1_txtDriverMobile_TextBox")WebElement drmobileno;
	@FindBy(id="ContentPlaceHolder1_txtgpsno_TextBox")WebElement gpsno;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;
	@FindBy(id="ContentPlaceHolder1_ddlvender")WebElement vendor;

	public DefineVehicleDetails(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openDefineVehicleDetails()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transport.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Define Vehicle Details")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Define Vehicle Details")));
	   dr.findElement(By.xpath("//div[@class='float oneOne']")).click();
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	}
	public void selectVehicleOwner(String vowner)
	{
	   String owner;
       for(WebElement option:options)
	   {
	   	if (vowner.equalsIgnoreCase("school"))
	    {
		   owner= "rbtnSchool";
		   if(option.getAttribute("value").equals(owner))
		   	option.click();
	    }
		if (vowner.equalsIgnoreCase("vendor"))
		{
		   owner= "rbtnPrivate";
			if(option.getAttribute("value").equals(owner))
			 option.click();
		}
	   }
	}
	public void selectVehicleType(String vtype)
	{
		new Select(vehicletype).selectByVisibleText(vtype);
	}
	public void enterVehicleName(String vname)
	{
		vehiclename.sendKeys(vname);
	}
	public void enterVehicleRegistrationNo(String vregno)
	{
		vehicleregno.sendKeys(vregno);
	}
	public void enterDriverName(String dname)
	{
		drivername.sendKeys(dname);
	}
	public void enterDriverMobileNo(String mobno)
	{
		drmobileno.sendKeys(mobno);
	}
	public void enterGPSNo(String gno)
	{
		gpsno.sendKeys(gno);
	}
	public void selectVendor(String vnd)
	{
		new Select(vendor).selectByVisibleText(vnd);
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
