package MasterSettingsPageObjects;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FeeOpeningBalanceSetting {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "FeeOpeningBalanceSetting";
  
  @FindBy(id="ContentPlaceHolder1_ddlFeeType")WebElement feetype;
  
  public FeeOpeningBalanceSetting(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openFeeOpeningBalanceSetting()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Fee Opening Balance Setting")).click();
	 dr.switchTo().frame(dr.findElement(By.id("Fee Opening Balance Setting")));
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  dr.findElement(By.xpath("//div[@class='content']")).click();
	  Thread.sleep(1000);
	  u.captureScreenshot(dr, schl, pg, sc);
	  Select ftype= new Select(feetype);
	  String f= ftype.getFirstSelectedOption().getText();
	  if(f.equals("Select FeeType"))
		  System.out.println("Fee Type Not Selected");
	  else
		  System.out.println("Fee Type Is Selected");
  }
}
