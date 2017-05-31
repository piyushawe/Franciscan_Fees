package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class FeeEntrySetting {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "FeeEntrySetting";
  
  public FeeEntrySetting(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
	}
	public void openFeeEntrySetting()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Fee Entry Setting")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Fee Entry Setting")));
	}
	public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	{
	   Thread.sleep(1000);
	   dr.findElement(By.xpath("//div[@class='mainForm displayNone']")).click();
	   u.captureScreenshot(dr,schl,pg,sc); 	  
	   verifyFeeEntryFormSetting();
	   verifySchoolAccountSetting();
	   verifyFeeTypeSetting();
    }
	public void verifyFeeEntryFormSetting()
	{
		List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$FEFS"));
		int i=0;
		boolean flag=false;
		for(WebElement option:options)
		{
			if(options.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Fee Entry Form Setting is there");
		else
			System.out.println("Fee Entry Form Setting is not there");
	}
	public void verifySchoolAccountSetting()
	{
		List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$School"));
		int i=0;
		boolean flag=false;
		for(WebElement option:options)
		{
			if(options.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("School Account Setting is there");
		else
			System.out.println("School Account Setting is not there");
	}
	public void verifyFeeTypeSetting()
	{
		List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$Fee"));
		int i=0;
		boolean flag=false;
		for(WebElement option:options)
		{
			if(options.get(i).isSelected())
				flag=true;
			i++;
		}
		if(flag)
			System.out.println("Fee Type Setting is there");
		else
			System.out.println("Fee Type Setting is not there");
	}
}
