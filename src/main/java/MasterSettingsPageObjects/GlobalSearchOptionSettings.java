package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GlobalSearchOptionSettings {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "GlobalSearchOptionSettings";

	@FindBy(id="ContentPlaceHolder1_chkAdm")WebElement admissionno;
	@FindBy(id="ContentPlaceHolder1_chkName")WebElement name;
	@FindBy(id="ContentPlaceHolder1_chkFname")WebElement fathername;
	@FindBy(id="ContentPlaceHolder1_chkMname")WebElement mothername;
	@FindBy(id="ContentPlaceHolder1_ChkRoll")WebElement rollno;
	@FindBy(id="ContentPlaceHolder1_chkMob")WebElement mobile;
	@FindBy(id="ContentPlaceHolder1_chkAddress")WebElement address;
	@FindBy(id="ContentPlaceHolder1_chkBarcode")WebElement barcode;
	@FindBy(id="ContentPlaceHolder1_chkComp")WebElement computerno;
	@FindBy(id="ContentPlaceHolder1_chkbusid")WebElement busid;
	@FindBy(name="ctl00$ContentPlaceHolder1$search")List<WebElement>registrationformsettings;
	@FindBy(name="ctl00$ContentPlaceHolder1$display")List<WebElement>displayonreport;
	@FindBy(name="ctl00$ContentPlaceHolder1$btnSetGlobal$ctl00")WebElement setglobally;

	public GlobalSearchOptionSettings(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openGlobalSearchOptionSettings()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Global Search Option Settings")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Global Search Option Settings")));
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   dr.findElement(By.xpath("//div[@class='content']")).click();
	   Thread.sleep(1000);
	   u.captureScreenshot(dr, schl, pg, sc);
	   verifySearchSettings();	  
	   verifyDisplaySettings();
	}
	public void verifySearchSettings()
	{
		List<WebElement>search= dr.findElements(By.name("ctl00$ContentPlaceHolder1$search"));
		boolean flag= false;
		int i=0;
		for(WebElement srch:search)
		{
			if(search.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Search Setting is Done");
		else
			System.out.println("Search Setting is Not Done");
	}
	public void verifyDisplaySettings()
	{
		List<WebElement>dsettings= dr.findElements(By.name("ctl00$ContentPlaceHolder1$display"));
		boolean flag= false;
		int i=0;
		for(WebElement dset:dsettings)
		{
			if(dsettings.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Display Setting is Done");
		else
			System.out.println("Display Setting is Not Done");
	}
    public void selectAdmissionNo()
	{
		if(admissionno.isSelected()){
		}else
			admissionno.click();
	}
	public void selectName()
	{
		if (name.isSelected()){

		}else
			name.click();
	}
	public void selectFatherName()
	{
		if (fathername.isSelected()){

		}else
			fathername.click();
	}
	public void selectMotherName()
	{
		if (mothername.isSelected()){

		}else
			mothername.click();
	}
	public void selectRollNo()
	{
		if (rollno.isSelected()){

		}else
			rollno.click();
	}
	public void selectMobile()
	{
		if (mobile.isSelected()){

		}else
			mobile.click();
	}
	public void selectAddress()
	{
		if (address.isSelected()){

		}else
			address.click();
	}
	public void selectBarcode()
	{
		if (barcode.isSelected()){

		}else
			barcode.click();
	}
	public void selectComputerNo()
	{
		if (computerno.isSelected()){

		}else
			computerno.click();
	}
	public void selectBusId()
	{
		if (busid.isSelected()){

		}else
			busid.click();
	}
    public void selectStudentRegistrationFormSettings(String rfsetting)
	{
		for(WebElement rfset:registrationformsettings)
		{
			if(rfsetting.equals("search by admission no"))
				if(rfset.getAttribute("value").equals("rbtnshowAdm"))
					rfset.click();
			if(rfsetting.equals("search by computer no"))
				if(rfset.getAttribute("value").equals("rbtnSearchbyComp"))
					rfset.click();
		}
	}
	public void selectDisplayOnReport(String drpt)
	{
		for(WebElement dreport:displayonreport)
		{
			if(drpt.equals("show admission no"))
				if(dreport.getAttribute("value").equals("rbtadmdisplay"))
					dreport.click();
			if(drpt.equals("show bill"))
			    if(dreport.getAttribute("value").equals("rbtbilldisplay"))
				dreport.click();
			if(drpt.equals("show bus id"))
				if(dreport.getAttribute("value").equals("rbtbusid"))
					dreport.click();
		}
	}
	public void clickSetGlobally(String school, Collection<String> sc)throws IOException
	{
		setglobally.click();
		u.verifySave(dr, school, pg, sc);
	}
}
