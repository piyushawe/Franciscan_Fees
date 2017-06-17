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

public class BusIDSetting {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "BusIDSetting";

  @FindBy(id="ContentPlaceHolder1_txtprefix_TextBox")WebElement prefix;
  @FindBy(id="ContentPlaceHolder1_txtProsStartFrom_TextBox")WebElement startfrom;
  @FindBy(id="ContentPlaceHolder1_txtLeadZero_TextBox")WebElement leadzero;
  @FindBy(id="ContentPlaceHolder1_txtSufix_TextBox")WebElement suffix;
  @FindBy(name="ctl00$ContentPlaceHolder1$Pros")List<WebElement> settingtype;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement save;

  public BusIDSetting(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openBusIDSetting()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Bus ID Setting")).click();
	 dr.switchTo().frame(dr.findElement(By.id("Bus ID Setting")));
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	 dr.findElement(By.xpath("//div[@class='content']")).click();
	 Thread.sleep(1000);
	 u.captureScreenshot(dr, schl, pg, sc);
  }
  public void selectSettingType(String stype)
  {
      for (WebElement settype:settingtype)
      {
          if(stype.equals("Auto"))
              if (settype.getAttribute("value").equals("rbtnProsNoAutometic"))
                  settype.click();
          if(stype.equals("Manual"))
              if (settype.getAttribute("value").equals("rbtnProsNoManual"))
                  settype.click();
      }
  }
  public void enterPrefix(String pfix)
  {
      if (prefix.getAttribute("value").equals(""))
         prefix.sendKeys(pfix);
  }
  public void enterStartFrom(String sfrom)
  {
      if (startfrom.getAttribute("value").equals(""))
         startfrom.sendKeys(sfrom);
  }
  public void enterLeadZero(String lzero)
  {
      if (leadzero.getAttribute("value").equals(""))
         leadzero.sendKeys(lzero);
  }
  public void enterSuffix(String sfix)
  {
      if (suffix.getAttribute("value").equals(""))
         suffix.sendKeys(sfix);
  }
  public void clickSave(String school, Collection<String> sc)throws IOException
  {
      save.click();
      u.verifySave(dr, school, pg, sc);
  }
}
