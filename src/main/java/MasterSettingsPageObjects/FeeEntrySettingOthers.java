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
import org.openqa.selenium.support.ui.Select;

public class FeeEntrySettingOthers {
  WebDriver dr;
  Utility u= new Utility();
  String pg= "FeeEntrySettingOthers";

  @FindBy(id="ContentPlaceHolder1_chkSelectBank")WebElement banksetting;
  @FindBy(id="ContentPlaceHolder1_txtChequeBounceFine_TextBox")WebElement chequebouncefine;
  @FindBy(id="ContentPlaceHolder1_ddlSelectPayMode")WebElement paymode;
  @FindBy(id="ContentPlaceHolder1_chkReuserReceiptNo")WebElement reusefeereceipt;
  @FindBy(id="ContentPlaceHolder1_chkdiscount")WebElement discountoption;
  @FindBy(id="ContentPlaceHolder1_chkevngTransprt")WebElement eveningtransport;
  @FindBy(id="ContentPlaceHolder1_ChkBackDateEntry")WebElement backdateentry;
  @FindBy(id="ContentPlaceHolder1_chkLateFineWaive")WebElement latefinewaiveoff;
  @FindBy(id="ContentPlaceHolder1_chklatefinewithchedate")WebElement latefinewithchequedate;
  @FindBy(id="ContentPlaceHolder1_chkCancel")WebElement cancelledreceiptamount;
  @FindBy(id="ContentPlaceHolder1_ChkConReason")WebElement concessionreason;
  @FindBy(id="ContentPlaceHolder1_manual_late_fee")WebElement manuallatefee;
  @FindBy(name="ctl00$ContentPlaceHolder1$manual_late_fee_type")List<WebElement> manuallatefeetype;
  @FindBy(id="ContentPlaceHolder1_chqbounce")WebElement manualchequebounce;
  @FindBy(id="ContentPlaceHolder1_chkchequewave")WebElement waiveoffwithchequebounce;
  @FindBy(id="ContentPlaceHolder1_smsenable")WebElement enablesms;
  @FindBy(id="ContentPlaceHolder1_chkprintreceipt")WebElement printreceipt;
  @FindBy(id="ContentPlaceHolder1_ChkModifyTrans")WebElement modifytransport;
  @FindBy(id="ContentPlaceHolder1_ChkChqDetails")WebElement modifychequedetails;
  @FindBy(name="ctl00$ContentPlaceHolder1$btnSave$ctl00")WebElement save;

  public FeeEntrySettingOthers(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openFeeEntrySettingOthers()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Master-Settings.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Fee Entry Setting Others")).click();
	 dr.switchTo().frame(dr.findElement(By.id("Fee Entry Setting Others")));
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  dr.findElement(By.xpath("//div[@class='content']")).click();
	  Thread.sleep(1000);
	  u.captureScreenshot(dr, schl, pg, sc);
  }
  public void selectBankSetting()
  {
      banksetting.click();
  }
  public void enterChequeBounceFine(String cbfine)
  {
      if(chequebouncefine.getAttribute("value").equals(""))
          chequebouncefine.sendKeys(cbfine);
  }
  public void selectPaymentMode()
  {
      new Select(paymode).selectByIndex(0);
  }
  public void selectReuseFeeReceiptNo()
  {
      reusefeereceipt.click();
  }
  public void selectEnableDiscountOption()
  {
      discountoption.click();
  }
  public void selectEnableEveningTransport()
  {
      eveningtransport.click();
  }
  public void selectBlockBackDateEntry()
  {
      backdateentry.click();
  }
  public void selectLateFineWaiveOffAutoCheck()
  {
      latefinewaiveoff.click();
  }
  public void selectLateFineWithChequeDate()
  {
      latefinewithchequedate.click();
  }
  public void selectCancelledReceiptAmount()
  {
      cancelledreceiptamount.click();
  }
  public void selectAskConcessionReason()
  {
      concessionreason.click();
  }
  public void selectEnableManualLateFee()
  {
      manuallatefee.click();
  }
  public void selectInstallment(String inst)
  {
      for(WebElement instt:manuallatefeetype)
      {
          if(inst.equals("single"))
              if(instt.getAttribute("value").equals("1"))
                  instt.click();
          if(inst.equals("multiple"))
              if(instt.getAttribute("value").equals("0"))
                  instt.click();
      }
  }
  public void selectEnableManualChequeBounce()
  {
      manualchequebounce.click();
  }
  public void selectEnableWaiveOffWithChequeBounce()
  {
      waiveoffwithchequebounce.click();
  }
  public void selectEnableSmsOnFeeEntry()
  {
      enablesms.click();
  }
  public void selectPrintReceipt()
  {
      printreceipt.click();
  }
  public void selectModifyTransport()
  {
      modifytransport.click();
  }
  public void selectModifyChequeDetails()
  {
      modifychequedetails.click();
  }
  public void clickSave(String school, Collection<String> sc)throws IOException
  {
      save.click();
      u.verifySave(dr, school, pg, sc);
  }
}
