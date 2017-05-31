package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class GlobalSearchOptionSettings {
	WebDriver dr;
	Utility u= new Utility();
	String pg= "GlobalSearchOptionSettings";
	
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
}
