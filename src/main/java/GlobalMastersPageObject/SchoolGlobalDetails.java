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
import org.openqa.selenium.support.ui.Select;

public class SchoolGlobalDetails {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "SchoolGlobalDetails";

	@FindBy(id="ContentPlaceHolder1_txtschoolname_TextBox")WebElement schoolname;
	@FindBy(id="ContentPlaceHolder1_txtschoolad_TextBox")WebElement schooladdress1;
	@FindBy(id="ContentPlaceHolder1_txtschooladd2_TextBox")WebElement schooladdress2;
	@FindBy(id="ContentPlaceHolder1_txtshortname_TextBox")WebElement schoolshortname;
	@FindBy(id="ContentPlaceHolder1_txtContact_TextBox")WebElement contactno;
	@FindBy(id="ContentPlaceHolder1_txtphone_TextBox")WebElement mobile;
	@FindBy(id="ContentPlaceHolder1_txtmail_TextBox")WebElement email;
	@FindBy(id="ContentPlaceHolder1_txtsupportmail_TextBox")WebElement supportemailid;
	@FindBy(id="ContentPlaceHolder1_txtwebsite_TextBox")WebElement website;
	@FindBy(id="ContentPlaceHolder1_txtprefix_TextBox")WebElement prefix;
	@FindBy(id="ContentPlaceHolder1_txtiso_TextBox")WebElement isodetails;
	@FindBy(id="ContentPlaceHolder1_txtschoolno_TextBox")WebElement schoolno;
	@FindBy(id="ContentPlaceHolder1_txtaffiliationto_TextBox")WebElement affiliationto;
	@FindBy(id="ContentPlaceHolder1_txtaffiliationno_TextBox")WebElement affiliationno;
	@FindBy(id="ContentPlaceHolder1_txtassociates_TextBox")WebElement associates;
	@FindBy(id="ContentPlaceHolder1_txtrenewed_TextBox")WebElement renewupto;
	@FindBy(id="ContentPlaceHolder1_txtschoolstatus_TextBox")WebElement schoolstatus;
	@FindBy(id="ContentPlaceHolder1_txtcity_TextBox")WebElement city;
	@FindBy(id="ContentPlaceHolder1_txtecare_TextBox")WebElement ecaremobileno;
	@FindBy(id="ContentPlaceHolder1_txtworkingdays_TextBox")WebElement workingdays;
	@FindBy(id="ContentPlaceHolder1_txtrecess_TextBox")WebElement recess;
	@FindBy(id="ContentPlaceHolder1_txttotalperiod_TextBox")WebElement totalperiod;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
	@FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

  public SchoolGlobalDetails(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openSchoolGlobalDetails()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 WebElement submenu= dr.findElement(By.linkText("Define School"));
	 builder.moveToElement(submenu).build().perform();
	 dr.findElement(By.linkText("School Global Details")).click();
	 dr.switchTo().frame(dr.findElement(By.id("School Global Details")));
	 dr.findElement(By.xpath("//div[@class='content']")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	 Thread.sleep(1000);
	 u.captureScreenshot(dr, schl, pg, sc);
	 verifySchoolType();
  }
  public void verifySchoolType()
  {
	  List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$"));
	  boolean flag=false;
	  int i=0;
	  for(WebElement option:options)
	  {
		  if(options.get(i).isSelected())
			  flag=true;
		  i++;
	  }
	  if(flag)
		  System.out.println("School Type is Selected");
	  else
		  System.out.println("School Type is Not Selected");
  }
  public void enterSchoolName(String sname)
  {
	 schoolname.sendKeys(sname);
  }
  public void enterSchoolAddress(String add)
  {
     schooladdress1.sendKeys(add);
  }
  public void enterSchoolAddress2(String add)
  {
  	schooladdress2.sendKeys(add);
  }
  public void enterSchoolShortName(String ssname)
  {
 	schoolshortname.sendKeys(ssname);
  }
  public void enterContactNo(String cno)
  {
 	contactno.sendKeys(cno);
  }
  public void enterMobileNo(String mob)
  {
  	mobile.sendKeys(mob);
  }
  public void enterEMail(String em)
  {
 	email.sendKeys(em);
  }
  public void enterSupportEmailID(String seid)
  {
 	supportemailid.sendKeys(seid);
  }
  public void enterWebsite(String wsite)
  {
	website.sendKeys(wsite);
  }
  public void enterPrefix(String pfix)
  {
	prefix.sendKeys(pfix);
  }
  public void enterISODetails(String isodet)
  {
    isodetails.sendKeys(isodet);
  }
  public void enterSchoolNo(String sno)
  {
	schoolno.sendKeys(sno);
  }
  public void enterAffiliationTo(String ato)
  {
	affiliationto.sendKeys(ato);
  }
  public void enterAffiliationNo(String ano)
  {
 	affiliationno.sendKeys(ano);
  }
  public void enterAssociates(String assc)
  {
	associates.sendKeys(assc);
  }
  public void enterRenewUpto(String rupto)
  {
 	renewupto.sendKeys(rupto);
  }
  public void enterSchoolStatus(String sstatus)
  {
 	schoolstatus.sendKeys(sstatus);
  }
  public void enterCity(String c)
  {
 	city.sendKeys(c);
  }
  public void enterECareMobileNo(String ecaremob)
  {
 	ecaremobileno.sendKeys(ecaremob);
  }
  public void enterWorkingDays(String wdays)
  {
 	workingdays.sendKeys(wdays);
  }
  public void enterRecess(String rec)
  {
 	recess.sendKeys(rec);
  }
  public void enterTotalPeriod(String tperiod)
  {
 	totalperiod.sendKeys(tperiod);
  }
  public void clickSave(String school, Collection<String> sc)throws IOException
  {
 	save.click();
	u.verifySave(dr, school, pg, sc);
  }
  public void clickView(String school, Collection<String> sc)throws IOException
  {
 	view.click();
	WebElement table= dr.findElement(By.id("example1"));
	List<WebElement> cells= table.findElements(By.tagName("td"));
	if (cells.size()>1) {
		for (WebElement cell : cells) {
			cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptSchoolDetails')]")).click();
			break;
		}
	dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
	dr.findElement(By.id("popup_ok")).click();
    }else
        System.out.println("No record Found");
	u.verifyView(dr,school, pg, sc);
  }
}
