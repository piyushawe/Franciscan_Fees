package GlobalMastersPageObject;

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

import org.openqa.selenium.support.ui.Select;

public class RelateClassSection {
	WebDriver dr;
	Utilities u= new Utilities();
	String pg= "RelateClassSection";

	@FindBy(id="ContentPlaceHolder1_ddlClass")WebElement cls;
	@FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement save;

	public RelateClassSection(WebDriver d)
	{
	   this.dr=d;
	   PageFactory.initElements(d, this);
    }
	public void openRelateClassSection()
	{
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Relate Class Section")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Relate Class Section")));
	   dr.findElement(By.xpath("//div[@class='content']")).click();
     }
	 public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	 {
	    Thread.sleep(1000);
	    u.captureScreenshot(dr, schl, pg, sc);
	 }
	 public void selectClass()throws InterruptedException
	 {
	 	new Select(cls).selectByIndex(1);
		 Thread.sleep(500);
	 }
	 public void assignSection()
	 {
	 	WebElement table= dr.findElement(By.id("example"));
		 List<WebElement>cells= table.findElements(By.tagName("td"));
		 if(cells.size()>1){
		 	for(WebElement cell:cells)
			{
				if(dr.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptDefineClass_chkSection')]")).isSelected())
				{
					System.out.println("Section is already assigned");
				}
				else
					dr.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptDefineClass_chkSection')]")).click();
				break;
			}
		 }
		 else
			 System.out.println("No section is available");
	 }
	public void clickSave(String school, Collection<String> sc)throws IOException
	{
		save.click();
		u.verifySave(dr, school, pg, sc);
	}
}
