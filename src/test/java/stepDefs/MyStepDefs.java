package stepDefs;

import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Certificate.Certificates;
import Certificate.CharacterCertificateWithComboBox;
import Certificate.GenerateTc;
import Certificate.TcForm;
import Certificate.TcFormClassWise;
import FeeMaster.AssignAmountGroup;
import FeeMaster.AssignComputerNoToStudent;
import FeeMaster.AssignConcession;
import FeeMaster.AssignConcessionToSingleStudent;
import FeeMaster.AssignConcessionToStudent;
import FeeMaster.AssignMultipleGroupToStudent;
import FeeMaster.AssignOpeningBalance;
import FeeMaster.AssignRollNoToStudent;
import FeeMaster.CreateStudentsFeeStructure;
import FeeMaster.DefineConcession;
import FeeMaster.DefineConcessionType;
import FeeMaster.DefineFeeGroup;
import FeeMaster.DefineFeeHead;
import FeeMaster.DefineFeeHeadConcession;
import FeeMaster.DefineFeeInstallment;
import FeeMaster.DefineFeeType;
import FeeMaster.FeeGroupToFeeHead;
import FeeMaster.LateFeeSetting;
import FeeMaster.LateFeeSettingHeadWise;
import FeeMaster.SetStudentStatus;
import FeeMaster.StudentFeeDetails;
import GlobalMastersPageObject.DefineAcademicYear;
import GlobalMastersPageObject.DefineBank;
import GlobalMastersPageObject.DefineCaste;
import GlobalMastersPageObject.DefineCategory;
import GlobalMastersPageObject.DefineCharacter;
import GlobalMastersPageObject.DefineClass;
import GlobalMastersPageObject.DefineExtraActivity;
import GlobalMastersPageObject.DefineFinancialYear;
import GlobalMastersPageObject.DefineLanguage;
import GlobalMastersPageObject.DefineLastResult;
import GlobalMastersPageObject.DefineMotherTongue;
import GlobalMastersPageObject.DefineOtherRemark;
import GlobalMastersPageObject.DefinePromotionMaster;
import GlobalMastersPageObject.DefineReligion;
import GlobalMastersPageObject.DefineSchoolBoard;
import GlobalMastersPageObject.DefineSection;
import GlobalMastersPageObject.DefineTcCaste;
import GlobalMastersPageObject.DefineWing;
import GlobalMastersPageObject.HealthMaster;
import GlobalMastersPageObject.HealthUnitMaster;
import GlobalMastersPageObject.RelateClassSection;
import GlobalMastersPageObject.SchoolGlobalDetails;
import GlobalMastersPageObject.SchoolGlobalDetailsWithType;
import GlobalMastersPageObject.SessionTransfer;
import GlobalMastersPageObject.StudentHealthEntry;
import GlobalMastersPageObject.TermMaster;
import ManageFee.CancelFeeReceipt;
import ManageFee.DeleteFeeReceipt;
import ManageFee.FeeChequeClearing;
import ManageFee.FeeEntry;
import ManageFee.FeesExcelUpload;
import ManageFee.FeesUpload;
import ManageFee.ManualFeeModification;
import ManageFee.ModifyFeeReceipt;
import ManageFee.MultipleRemark;
import ManageFee.OnlineFeesSettlement;
import ManageFee.PayAmountWithoutStructure;
import ManageFee.PrintFeeReceiptAndCertificate;
import ManageFee.ReconciliationFeeReceipt;
import ManageFee.RefundHeadAmount;
import ManageFee.TransferConcession;
import MasterSettingsPageObjects.BillBookSetting;
import MasterSettingsPageObjects.BusIDSetting;
import MasterSettingsPageObjects.ChangeAcademic;
import MasterSettingsPageObjects.FeeEntrySetting;
import MasterSettingsPageObjects.FeeEntrySettingOthers;
import MasterSettingsPageObjects.FeeOpeningBalanceSetting;
import MasterSettingsPageObjects.GenerateBillBookDetails;
import MasterSettingsPageObjects.GlobalSearchOptionSettings;
import MasterSettingsPageObjects.ReceiptCertificateSetting;
import MasterSettingsPageObjects.SetDueLimit;
import Transport.AssignSelfTransportToStudent;
import Transport.AssignTransportToStudents;
import Transport.DefineRouteStop;
import Transport.DefineTransportGroup;
import Transport.DefineTransportMedium;
import Transport.DefineVehicleDetails;
import Transport.DefineVehicleRoute;
import Transport.DefineVehicleRouteRelation;
import Transport.DefineVehicleType;
import Transport.TravelAgencyMaster;
import Transport.VehicleReminder;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepDefs {
	WebDriver dr;
	String schoolname;
	Collection<String> scenario;
	
	@Before
	public void launchBrowser(Scenario sc)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		scenario= sc.getSourceTagNames();
	}
	
	@After
	public void closeBrowser() throws InterruptedException
	{
	  Thread.sleep(2000);
	  dr.quit();
	}
	
	@Given("^user enter url \"([^\"]*)\"$")
	public void user_enter_url(String arg1) throws Throwable {
	    dr.get(arg1);
	}

	@When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String arg1, String arg2) throws Throwable {
		dr.findElement(By.id("txtUserName")).sendKeys(arg1);
		dr.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^passes school name \"([^\"]*)\"$")
	public void passes_school_name(String arg1) throws Throwable {
	    schoolname= arg1;
	}

	@When("^click signin$")
	public void click_signin() throws Throwable {
		dr.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}

	@Then("^fee manager home page is opened$")
	public void fee_manager_home_page_is_opened() throws Throwable {
		 dr.findElement(By.xpath("//img[@src='images/big/Fee-Manager.png']")).click();
	}

//change academic
	@When("^user open change academic page$")
	public void user_open_change_academic_page() throws Throwable {
		ChangeAcademic ca= new ChangeAcademic(dr);
		ca.openChangeAcademic();
	}

	@Then("^verify change academic page$")
	public void verify_change_academic_page() throws Throwable {
		ChangeAcademic ca= new ChangeAcademic(dr);
		ca.verifyPage(schoolname, scenario);
	}

//set due limit
	@When("^user open set due limit page$")
	public void user_open_set_due_limit_page() throws Throwable {
		SetDueLimit sdl= new SetDueLimit(dr);
		sdl.openSetDueLimit();
	}

	@Then("^verify set due limit page$")
	public void verify_set_due_limit_page() throws Throwable {
		SetDueLimit sdl= new SetDueLimit(dr);
		sdl.verifyPage(schoolname, scenario);
	}

//fee entry setting
	@When("^user open fee entry setting page$")
	public void user_open_fee_entry_setting_page() throws Throwable {
		FeeEntrySetting fes= new FeeEntrySetting(dr);
		fes.openFeeEntrySetting();
	}

	@Then("^verify fee entry setting page$")
	public void verify_fee_entry_setting_page() throws Throwable {
		FeeEntrySetting fes= new FeeEntrySetting(dr);
		fes.verifyPage(schoolname, scenario);
	}
	
//fee entry setting others
	@When("^user open fee entry setting others page$")
	public void user_open_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.openFeeEntrySettingOthers();
	}

	@Then("^verify fee entry setting others page$")
	public void verify_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.verifyPage(schoolname, scenario);
	}
	
//fee opening balance setting
	@When("^user open fee opening balance setting page$")
	public void user_open_fee_opening_balance_setting_page() throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.openFeeOpeningBalanceSetting();
	}

	@Then("^verify fee opening balance setting page$")
	public void verify_fee_opening_balance_setting_page() throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.verifyPage(schoolname, scenario);
	}

//global search option settings
	@When("^user open global search option settings page$")
	public void user_open_global_search_option_settings_page() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.openGlobalSearchOptionSettings();
	}

	@Then("^verify global search option settings page$")
	public void verify_global_search_option_settings_page() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.verifyPage(schoolname, scenario);
	}
	
//receipt certificate setting
	@When("^user open receipt certificate setting page$")
	public void user_open_receipt_certificate_setting_page() throws Throwable {
		ReceiptCertificateSetting rcs= new ReceiptCertificateSetting(dr);
		rcs.openReceiptCertificateSetting();
	}

	@Then("^verify receipt certificate setting page$")
	public void verify_receipt_certificate_setting_page() throws Throwable {
		ReceiptCertificateSetting rcs= new ReceiptCertificateSetting(dr);
		rcs.verifyPage(schoolname, scenario);
	}

//bus id setting
	@When("^user open bus id setting page$")
	public void user_open_bus_id_setting_page() throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.openBusIDSetting();
	}

	@Then("^verify bus id setting page$")
	public void verify_bus_id_setting_page() throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.verifyPage(schoolname, scenario);
	}
//bill book	setting
	@When("^user open bill book setting page$")
	public void user_open_bill_book_setting_page() throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.openBillBookSetting();
	}

	@Then("^verify bill book setting page$")
	public void verify_bill_book_setting_page() throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.verifyPage(schoolname, scenario);
	}

//generate bill book details
	@When("^user open generate bill book details page$")
	public void user_open_generate_bill_book_details_page() throws Throwable {
		GenerateBillBookDetails gbbd= new GenerateBillBookDetails(dr);
		gbbd.openGenerateBillBookDetails();
	}

	@When("^select installment \"([^\"]*)\" on generate bill book details$")
	public void select_installment_on_generate_bill_book_details(String arg1) throws Throwable {
		GenerateBillBookDetails gbbd= new GenerateBillBookDetails(dr);
		gbbd.selectInstallment(arg1);
	}

	@Then("^verify generate bill book details page$")
	public void verify_generate_bill_book_details_page() throws Throwable {
		GenerateBillBookDetails gbbd= new GenerateBillBookDetails(dr);
		gbbd.clickShow(schoolname, scenario);
	}

//school global details with type
	@When("^user open school global details with type page$")
	public void user_open_school_global_details_with_type_page() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.openSchoolGlobalDetailsWithType();
	}

	@Then("^verify school global details with type page$")
	public void verify_school_global_details_with_type_page() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.verifyPage(schoolname, scenario);
	}

//school global details
	@When("^user open school global details page$")
	public void user_open_school_global_details_page() throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.openSchoolGlobalDetails();
	}

	@Then("^verify school global details type page$")
	public void verify_school_global_details_type_page() throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.verifyPage(schoolname, scenario);
	}
	
//define school board
	@When("^user open define school board page$")
	public void user_open_define_school_board_page() throws Throwable {
		DefineSchoolBoard dsb= new DefineSchoolBoard(dr);
		dsb.openDefineSchoolBoard();
	}

	@Then("^verify define school board page$")
	public void verify_define_school_board_page() throws Throwable {
		DefineSchoolBoard dsb= new DefineSchoolBoard(dr);
		dsb.verifyPage(schoolname, scenario);
	}

//define language
	@When("^user open define language page$")
	public void user_open_define_language_page() throws Throwable {
		DefineLanguage dl= new DefineLanguage(dr);
		dl.openDefineLanguage();
	}

	@Then("^verify define language page$")
	public void verify_define_language_page() throws Throwable {
		DefineLanguage dl= new DefineLanguage(dr);
		dl.verifyPage(schoolname, scenario);
	}

//session transfer
	@When("^user open session transfer page$")
	public void user_open_session_transfer_page() throws Throwable {
		SessionTransfer st= new SessionTransfer(dr);
		st.openSessionTransfer();
	}

	@Then("^verify session transfer page$")
	public void verify_session_transfer_page() throws Throwable {
		SessionTransfer st= new SessionTransfer(dr);
		st.verifyPage(schoolname, scenario);
	}
	
//define mother tongue
	@When("^user open define mother tongue page$")
	public void user_open_define_mother_tongue_page() throws Throwable {
		DefineMotherTongue dmt= new DefineMotherTongue(dr);
		dmt.openDefineMotherTongue();
	}

	@Then("^verify define mother tongue page$")
	public void verify_define_mother_tongue_page() throws Throwable {
		DefineMotherTongue dmt= new DefineMotherTongue(dr);
		dmt.verifyPage(schoolname, scenario);
	}
	
//student health entry
	@When("^user open student health entry page$")
	public void user_open_student_health_entry_page() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.openStudentHealthEntry();
	}

	@Then("^verify student health entry page$")
	public void verify_student_health_entry_page() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.verifyPage(schoolname, scenario);
	}
	
//define academic year
	@When("^user open define academic year page$")
	public void user_open_define_academic_year_page() throws Throwable {
		DefineAcademicYear day= new DefineAcademicYear(dr);
		day.openDefineAcademicYear();
	}

	@Then("^verify define academic year page$")
	public void verify_define_academic_year_page() throws Throwable {
		DefineAcademicYear day= new DefineAcademicYear(dr);
		day.verifyPage(schoolname, scenario);
	}
	
//define financial year
	@When("^user open define financial year page$")
	public void user_open_define_financial_year_page() throws Throwable {
		DefineFinancialYear dfy= new DefineFinancialYear(dr);
		dfy.openDefineFinancialYear();
	}

	@Then("^verify define financial year page$")
	public void verify_define_financial_year_page() throws Throwable {
		DefineFinancialYear dfy= new DefineFinancialYear(dr);
		dfy.verifyPage(schoolname, scenario);
	}

//define category
	@When("^user open define category page$")
	public void user_open_define_category_page() throws Throwable {
		DefineCategory dc= new DefineCategory(dr);
		dc.openDefineCategory();
	}

	@Then("^verify define category page$")
	public void verify_define_category_page() throws Throwable {
		DefineCategory dc= new DefineCategory(dr);
		dc.verifyPage(schoolname, scenario);
	}
	
//define religion
	@When("^user open define religion page$")
	public void user_open_define_religion_page() throws Throwable {
		DefineReligion drg= new DefineReligion(dr);
		drg.openDefineReligion();
	}

	@Then("^verify define religion page$")
	public void verify_define_religion_page() throws Throwable {
		DefineReligion drg= new DefineReligion(dr);
		drg.verifyPage(schoolname, scenario);
	}
	
//define wing
	@When("^user open define wing page$")
	public void user_open_define_wing_page() throws Throwable {
		DefineWing dw= new DefineWing(dr);
		dw.openDefineWing();
	}

	@Then("^verify define wing page$")
	public void verify_define_wing_page() throws Throwable {
		DefineWing dw= new DefineWing(dr);
		dw.verifyPage(schoolname, scenario);
	}
	
//define class
	@When("^user open define class page$")
	public void user_open_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.openDefineClass();
	}

	@Then("^verify define class page$")
	public void verify_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.verifyPage(schoolname, scenario);
	}

//relate class section
	@When("^user open relate class section page$")
	public void user_open_relate_class_section_page() throws Throwable {
		RelateClassSection rcs= new RelateClassSection(dr);
		rcs.openRelateClassSection();
	}

	@Then("^verify relate class section page$")
	public void verify_relate_class_section_page() throws Throwable {
		RelateClassSection rcs= new RelateClassSection(dr);
		rcs.verifyPage(schoolname, scenario);
	}
	
//define section
	@When("^user open define section page$")
	public void user_open_define_section_page() throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.openDefineSection();
	}

	@Then("^verify define section page$")
	public void verify_define_section_page() throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.verifyPage(schoolname, scenario);
	}

//define caste
	@When("^user open define caste page$")
	public void user_open_define_caste_page() throws Throwable {
		DefineCaste dc= new DefineCaste(dr);
		dc.openDefineCaste();
	}

	@Then("^verify define caste page$")
	public void verify_define_caste_page() throws Throwable {
		DefineCaste dc= new DefineCaste(dr);
		dc.verifyPage(schoolname, scenario);
	}
	
//define last result
	@When("^user open define last result page$")
	public void user_open_define_last_result_page() throws Throwable {
		DefineLastResult dlr= new DefineLastResult(dr);
		dlr.openDefineLastResult();
	}

	@Then("^verify define last result page$")
	public void verify_define_last_result_page() throws Throwable {
		DefineLastResult dlr= new DefineLastResult(dr);
		dlr.verifyPage(schoolname, scenario);
	}

//define promotion master
	@When("^user open define promotion master page$")
	public void user_open_define_promotion_master_page() throws Throwable {
		DefinePromotionMaster dpm= new DefinePromotionMaster(dr);
		dpm.openDefinePromotionMaster();
	}

	@Then("^verify define promotion master page$")
	public void verify_define_promotion_master_page() throws Throwable {
		DefinePromotionMaster dpm= new DefinePromotionMaster(dr);
		dpm.verifyPage(schoolname, scenario);
	}

//define character
	@When("^user open define character page$")
	public void user_open_define_character_page() throws Throwable {
		DefineCharacter dc= new DefineCharacter(dr);
		dc.openDefineCharacter();
	}

	@Then("^verify define character page$")
	public void verify_define_character_page() throws Throwable {
		DefineCharacter dc= new DefineCharacter(dr);
		dc.verifyPage(schoolname, scenario);
	}
	
//define other remark
	@When("^user open define other remark page$")
	public void user_open_define_other_remark_page() throws Throwable {
		DefineOtherRemark dor= new DefineOtherRemark(dr);
		dor.openDefineOtherRemark();
	}

	@Then("^verify define other remark page$")
	public void verify_define_other_remark_page() throws Throwable {
		DefineOtherRemark dor= new DefineOtherRemark(dr);
		dor.verifyPage(schoolname, scenario);
	}

//define extra activity
	@When("^user open define extra activity page$")
	public void user_open_define_extra_activity_page() throws Throwable {
		DefineExtraActivity dea= new DefineExtraActivity(dr);
		dea.openDefineExtraActivity();
	}

	@Then("^verify define extra activity page$")
	public void verify_define_extra_activity_page() throws Throwable {
		DefineExtraActivity dea= new DefineExtraActivity(dr);
		dea.verifyPage(schoolname, scenario);
	}

//define tc caste
	@When("^user open define tc caste page$")
	public void user_open_define_tc_caste_page() throws Throwable {
		DefineTcCaste dtc= new DefineTcCaste(dr);
		dtc.openDefineTcCaste();
	}

	@Then("^verify define tc caste page$")
	public void verify_define_tc_caste_page() throws Throwable {
		DefineTcCaste dtc= new DefineTcCaste(dr);
		dtc.verifyPage(schoolname, scenario);
	}

//define bank
	@When("^user open define bank page$")
	public void user_open_define_bank_page() throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.openDefineBank();
	}

	@Then("^verify define bank page$")
	public void verify_define_bank_page() throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.verifyPage(schoolname, scenario);
	}

//health unit master
	@When("^user open health unit master page$")
	public void user_open_health_unit_master_page() throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.openHealthUnitMaster();
	}

	@Then("^verify health unit master page$")
	public void verify_health_unit_master_page() throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.verifyPage(schoolname, scenario);
	}
	
//health master
	@When("^user open health master page$")
	public void user_open_health_master_page() throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.openHealthMaster();
	}

	@Then("^verify health master page$")
	public void verify_health_master_page() throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.verifyPage(schoolname, scenario);
	}

//term master
	@When("^user open term master page$")
	public void user_open_term_master_page() throws Throwable {
		TermMaster tm= new TermMaster(dr);
		tm.openTermMaster();
	}

	@Then("^verify term master page$")
	public void verify_term_master_page() throws Throwable {
		TermMaster tm= new TermMaster(dr);
		tm.verifyPage(schoolname, scenario);
	}
	
//define fee installment
	@When("^user open define fee installment page$")
	public void user_open_define_fee_installment_page() throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.openDefineFeeInstallment();
	}

	@Then("^verify define fee installment page$")
	public void verify_define_fee_installment_page() throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.verifyPage(schoolname, scenario);
	}

//define fee head
	@When("^user open define fee head page$")
	public void user_open_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.openDefineFeeHead();
	}

	@Then("^verify define fee head page$")
	public void verify_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.verifyPage(schoolname, scenario);
	}
	
//define fee type
	@When("^user open define fee type page$")
	public void user_open_define_fee_type_page() throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.openDefineFeeType();
	}

	@Then("^verify define fee type page$")
	public void verify_define_fee_type_page() throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.verifyPage(schoolname, scenario);
	}

//define fee group
	@When("^user open define fee group page$")
	public void user_open_define_fee_group_page() throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.openDefineFeeGroup();
	}

	@Then("^verify define fee group page$")
	public void verify_define_fee_group_page() throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.verifyPage(schoolname, scenario);
	}
	
//fee group to fee head
	@When("^user open fee group to fee head page$")
	public void user_open_fee_group_to_fee_head_page() throws Throwable {
		FeeGroupToFeeHead fgfh= new FeeGroupToFeeHead(dr);
		fgfh.openFeeGroupToFeeHead();
	}

	@Then("^verify fee group to fee head page$")
	public void verify_fee_group_to_fee_head_page() throws Throwable {
		FeeGroupToFeeHead fgfh= new FeeGroupToFeeHead(dr);
		fgfh.verifyPage(schoolname, scenario);
	}
	
//assign amount group
	@When("^user open assign amount group page$")
	public void user_open_assign_amount_group_page() throws Throwable {
		AssignAmountGroup agp= new AssignAmountGroup(dr);
		agp.openAssignAmountGroup();
	}

	@Then("^verify assign amount group page$")
	public void verify_assign_amount_group_page() throws Throwable {
		AssignAmountGroup agp= new AssignAmountGroup(dr);
		agp.verifyPage(schoolname, scenario);
	}
	
//define concession type
	@When("^user open define concession type page$")
	public void user_open_define_concession_type_page() throws Throwable {
		DefineConcessionType dct= new DefineConcessionType(dr);
		dct.openDefineConcessionType();
	}

	@Then("^verify define concession type page$")
	public void verify_define_concession_type_page() throws Throwable {
		DefineConcessionType dct= new DefineConcessionType(dr);
		dct.verifyPage(schoolname, scenario);
	}
	
//define concession
	@When("^user open define concession page$")
	public void user_open_define_concession_page() throws Throwable {
		DefineConcession dc= new DefineConcession(dr);
		dc.openDefineConcession();
	}

	@Then("^verify define concession page$")
	public void verify_define_concession_page() throws Throwable {
		DefineConcession dc= new DefineConcession(dr);
		dc.verifyPage(schoolname, scenario);
	}

//define fee head concession
	@When("^user open define fee head concession page$")
	public void user_open_define_fee_head_concession_page() throws Throwable {
		DefineFeeHeadConcession dfhc= new DefineFeeHeadConcession(dr);
		dfhc.openDefineFeeHeadConcession();
	}

	@Then("^verify define fee head concession page$")
	public void verify_define_fee_head_concession_page() throws Throwable {
		DefineFeeHeadConcession dfhc= new DefineFeeHeadConcession(dr);
		dfhc.verifyPage(schoolname, scenario);
	}

//assign concession to student
	@When("^user open assign concession to student page$")
	public void user_open_assign_concession_to_student_page() throws Throwable {
		AssignConcessionToStudent acs= new AssignConcessionToStudent(dr);
		acs.openAssignConcessionToStudent();
	}

	@Then("^verify assign concession to student page$")
	public void verify_assign_concession_to_student_page() throws Throwable {
		AssignConcessionToStudent acs= new AssignConcessionToStudent(dr);
		acs.verifyPage(schoolname, scenario);
	}

//assign concession
	@When("^user open assign concession page$")
	public void user_open_assign_concession_page() throws Throwable {
		AssignConcession ac= new AssignConcession(dr);
		ac.openAssignConcession();
	}

	@Then("^verify assign concession page$")
	public void verify_assign_concession_page() throws Throwable {
		AssignConcession ac= new AssignConcession(dr);
		ac.verifyPage(schoolname, scenario);
	}

//assign concession to single student
	@When("^user open assign concession to single student page$")
	public void user_open_assign_concession_to_single_student_page() throws Throwable {
		AssignConcessionToSingleStudent acss= new AssignConcessionToSingleStudent(dr);
		acss.openAssignConcessionToSingleStudent();
	}

	@Then("^verify assign concession to single student page$")
	public void verify_assign_concession_to_single_student_page() throws Throwable {
		AssignConcessionToSingleStudent acss= new AssignConcessionToSingleStudent(dr);
		acss.verifyPage(schoolname, scenario);
	}

//assign multiple group to student
	@When("^user open assign multiple group to student page$")
	public void user_open_assign_multiple_group_to_student_page() throws Throwable {
		AssignMultipleGroupToStudent amgs= new AssignMultipleGroupToStudent(dr); 
		amgs.openAssignMultipleGroupToStudent();
	}

	@Then("^verify assign multiple group to student page$")
	public void verify_assign_multiple_group_to_student_page() throws Throwable {
		AssignMultipleGroupToStudent amgs= new AssignMultipleGroupToStudent(dr); 
		amgs.verifyPage(schoolname, scenario);
	}
	
//student fee details
	@When("^user open assign student fee details page$")
	public void user_open_assign_student_fee_details_page() throws Throwable {
		StudentFeeDetails sfd= new StudentFeeDetails(dr);
		sfd.openStudentFeeDetails();
	}

	@Then("^verify assign student fee details page$")
	public void verify_assign_student_fee_details_page() throws Throwable {
		StudentFeeDetails sfd= new StudentFeeDetails(dr);
		sfd.verifyPage(schoolname, scenario);
	}
	
//create students fee structure
	@When("^user open create students fee structure page$")
	public void user_open_create_students_fee_structure_page() throws Throwable {
		CreateStudentsFeeStructure csfs= new CreateStudentsFeeStructure(dr);
		csfs.openCreateStudentsFeeStructure();
	}

	@Then("^verify create students fee structure page$")
	public void verify_create_students_fee_structure_page() throws Throwable {
		CreateStudentsFeeStructure csfs= new CreateStudentsFeeStructure(dr);
		csfs.verifyPage(schoolname, scenario);
	}
	
//assign opening balance
	@When("^user open assign opening balance page$")
	public void user_open_assign_opening_balance_page() throws Throwable {
		AssignOpeningBalance aob= new AssignOpeningBalance(dr);
		aob.openAssignOpeningBalance();
	}

	@Then("^verify assign opening balance page$")
	public void verify_assign_opening_balance_page() throws Throwable {
		AssignOpeningBalance aob= new AssignOpeningBalance(dr);
		aob.verifyPage(schoolname, scenario);
	}

//set student status
	@When("^user open set student status page$")
	public void user_open_set_student_status_page() throws Throwable {
		SetStudentStatus ss= new SetStudentStatus(dr);
		ss.openSetStudentStatus();
	}

	@Then("^verify set student status page$")
	public void verify_set_student_status_page() throws Throwable {
		SetStudentStatus ss= new SetStudentStatus(dr);
		ss.verifyPage(schoolname, scenario);
	}

//late fee setting
	@When("^user open late fee setting page$")
	public void user_open_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.openLateFeeSetting();
	}

	@Then("^verify late fee setting page$")
	public void verify_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.verifyPage(schoolname, scenario);
	}

//late fee setting head wise
	@When("^user open late fee setting head wise page$")
	public void user_open_late_fee_setting_head_wise_page() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.openLateFeeSettingHeadWise();
	}

	@Then("^verify late fee setting head wise page$")
	public void verify_late_fee_setting_head_wise_page() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.verifyPage(schoolname, scenario);
	}

//assign computer no to student
	@When("^user open assign computer no to student page$")
	public void user_open_assign_computer_no_to_student_page() throws Throwable {
		AssignComputerNoToStudent acs= new AssignComputerNoToStudent(dr);
		acs.openAssignComputerNoToStudent();
	}

	@Then("^verify assign computer no to student page$")
	public void verify_assign_computer_no_to_student_page() throws Throwable {
		AssignComputerNoToStudent acs= new AssignComputerNoToStudent(dr);
		acs.verifyPage(schoolname, scenario);
	}

//assign roll no to student
	@When("^user open assign roll no to student page$")
	public void user_open_assign_roll_no_to_student_page() throws Throwable {
		AssignRollNoToStudent ars= new AssignRollNoToStudent(dr);
		ars.openAssignRollNoToStudent();
	}

	@Then("^verify assign roll no to student page$")
	public void verify_assign_roll_no_to_student_page() throws Throwable {
		AssignRollNoToStudent ars= new AssignRollNoToStudent(dr);
		ars.verifyPage(schoolname, scenario);
	}
	
//fee entry
	@When("^user open fee entry page$")
	public void user_open_fee_entry_page() throws Throwable {
		FeeEntry fe= new FeeEntry(dr);
		fe.openFeeEntry();
	}

	@Then("^verify fee entry page$")
	public void verify_fee_entry_page() throws Throwable {
		FeeEntry fe= new FeeEntry(dr);  
		fe.verifyPage(schoolname, scenario);
	}

//cancel fee receipt
	@When("^user open cancel fee receipt page$")
	public void user_open_cancel_fee_receipt_page() throws Throwable {
		CancelFeeReceipt cfr= new CancelFeeReceipt(dr);
		cfr.openCancelFeeReceipt();
	}

	@Then("^verify cancel fee receipt page$")
	public void verify_cancel_fee_receipt_page() throws Throwable {
		CancelFeeReceipt cfr= new CancelFeeReceipt(dr);
		cfr.verifyPage(schoolname, scenario);
	}
	
//delete fee receipt
	@When("^user open delete fee receipt page$")
	public void user_open_delete_fee_receipt_page() throws Throwable {
		DeleteFeeReceipt dfr= new DeleteFeeReceipt(dr);
		dfr.openDeleteFeeReceipt();
	}

	@Then("^verify delete fee receipt page$")
	public void verify_delete_fee_receipt_page() throws Throwable {
		DeleteFeeReceipt dfr= new DeleteFeeReceipt(dr);
		dfr.verifyPage(schoolname, scenario);
	}

//print fee receipt and certificate
	@When("^user open print fee receipt and certificate page$")
	public void user_open_print_fee_receipt_and_certificate_page() throws Throwable {
		PrintFeeReceiptAndCertificate pfrc= new PrintFeeReceiptAndCertificate(dr);
		pfrc.openPrintFeeReceiptAndCertificate();
	}

	@Then("^verify print fee receipt and certificate page$")
	public void verify_print_fee_receipt_and_certificate_page() throws Throwable {
		PrintFeeReceiptAndCertificate pfrc= new PrintFeeReceiptAndCertificate(dr);
		pfrc.verifyPage(schoolname, scenario);
	}

//modify fee receipt
	@When("^user open modify fee receipt page$")
	public void user_open_modify_fee_receipt_page() throws Throwable {
		ModifyFeeReceipt mfr= new ModifyFeeReceipt(dr);
		mfr.openModifyFeeReceipt();
	}

	@Then("^verify modify fee receipt page$")
	public void verify_modify_fee_receipt_page() throws Throwable {
		ModifyFeeReceipt mfr= new ModifyFeeReceipt(dr);
		mfr.verifyPage(schoolname, scenario);
	}

//manual fee modification
	@When("^user open manual fee modification page$")
	public void user_open_manual_fee_modification_page() throws Throwable {
		ManualFeeModification mfm= new ManualFeeModification(dr);
		mfm.openManualFeeModification();
	}

	@Then("^verify manual fee modification page$")
	public void verify_manual_fee_modification_page() throws Throwable {
		ManualFeeModification mfm= new ManualFeeModification(dr);
		mfm.verifyPage(schoolname, scenario);
	}
	
//refund head amount
	@When("^user open refund head amount page$")
	public void user_open_refund_head_amount_page() throws Throwable {
		RefundHeadAmount rha= new RefundHeadAmount(dr);
		rha.openRefundHeadAmount();
	}

	@Then("^verify refund head amount page$")
	public void verify_refund_head_amount_page() throws Throwable {
		RefundHeadAmount rha= new RefundHeadAmount(dr);
		rha.verifyPage(schoolname, scenario);
	}
	
//fee cheque clearing
	@When("^user open fee cheque clearing page$")
	public void user_open_fee_cheque_clearing_page() throws Throwable {
		FeeChequeClearing fcc= new FeeChequeClearing(dr);
		fcc.openFeeChequeClearing();
	}

	@Then("^verify fee cheque clearing page$")
	public void verify_fee_cheque_clearing_page() throws Throwable {
		FeeChequeClearing fcc= new FeeChequeClearing(dr);
		fcc.verifyPage(schoolname, scenario);
	}
	
//pay amount without structure
	@When("^user open pay amount without structure page$")
	public void user_open_pay_amount_without_structure_page() throws Throwable {
		PayAmountWithoutStructure paws= new PayAmountWithoutStructure(dr);
		paws.openPayAmountWithoutStructure();
	}

	@Then("^verify pay amount without structure page$")
	public void verify_pay_amount_without_structure_page() throws Throwable {
		PayAmountWithoutStructure paws= new PayAmountWithoutStructure(dr);
		paws.verifyPage(schoolname, scenario);
	}

//fees excel upload
	@When("^user open fee excel upload page$")
	public void user_open_fee_excel_upload_page() throws Throwable {
		FeesExcelUpload feu= new FeesExcelUpload(dr);
		feu.openFeesExcelUpload();
	}

	@Then("^verify fee excel upload page$")
	public void verify_fee_excel_upload_page() throws Throwable {
		FeesExcelUpload feu= new FeesExcelUpload(dr);
		feu.verifyPage(schoolname, scenario);
	}

//reconciliation fee receipt
	@When("^user open reconciliation fee receipt page$")
	public void user_open_reconciliation_fee_receipt_page() throws Throwable {
		ReconciliationFeeReceipt rfr= new ReconciliationFeeReceipt(dr);
		rfr.openReconciliationFeeReceipt();
	}

	@Then("^verify reconciliation fee receipt page$")
	public void verify_reconciliation_fee_receipt_page() throws Throwable {
		ReconciliationFeeReceipt rfr= new ReconciliationFeeReceipt(dr);
		rfr.verifyPage(schoolname, scenario);
	}
	
//fees upload
	@When("^user open fees upload page$")
	public void user_open_fees_upload_page() throws Throwable {
		FeesUpload fu= new FeesUpload(dr);
		fu.openFeesUpload();
	}

	@Then("^verify fees upload page$")
	public void verify_fees_upload_page() throws Throwable {
		FeesUpload fu= new FeesUpload(dr);
		fu.verifyPage(schoolname, scenario);
	}
	
//multiple remark
	@When("^user open multiple remark page$")
	public void user_open_multiple_remark_page() throws Throwable {
		MultipleRemark mr= new MultipleRemark(dr);
		mr.openMultipleRemark();
	}

	@Then("^verify multiple remark page$")
	public void verify_multiple_remark_page() throws Throwable {
		MultipleRemark mr= new MultipleRemark(dr);
		mr.verifyPage(schoolname, scenario);
	}

//online fees settlement
	@When("^user open online fees settlement page$")
	public void user_open_online_fees_settlement_page() throws Throwable {
		OnlineFeesSettlement ofs= new OnlineFeesSettlement(dr);
		ofs.openOnlineFeesSettlement();
	}

	@Then("^verify online fees settlement page$")
	public void verify_online_fees_settlement_page() throws Throwable {
		OnlineFeesSettlement ofs= new OnlineFeesSettlement(dr);
		ofs.verifyPage(schoolname, scenario);
	}

//transfer concession
	@When("^user open transfer concession page$")
	public void user_open_transfer_concession_page() throws Throwable {
		TransferConcession tc= new TransferConcession(dr);
		tc.openTransferConcession();
	}

	@Then("^verify transfer concession page$")
	public void verify_transfer_concession_page() throws Throwable {
		TransferConcession tc= new TransferConcession(dr);
		tc.verifyPage(schoolname, scenario);
	}

//travel agency master
	@When("^user open travel agency master page$")
	public void user_open_travel_agency_master_page() throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.openTravelAgencyMaster();
	}

	@Then("^verify travel agency master page$")
	public void verify_travel_agency_master_page() throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.verifyPage(schoolname, scenario);
	}

//vehicle reminder
	@When("^user open vehicle reminder page$")
	public void user_open_vehicle_reminder_page() throws Throwable {
		VehicleReminder vr= new VehicleReminder(dr);
		vr.openVehicleReminder();
	}

	@Then("^verify vehicle reminder page$")
	public void verify_vehicle_reminder_page() throws Throwable {
		VehicleReminder vr= new VehicleReminder(dr);
		vr.verifyPage(schoolname, scenario);
	}
	
//define vehicle type
	@When("^user open define vehicle type page$")
	public void user_open_define_vehicle_type_page() throws Throwable {
		DefineVehicleType dvt= new DefineVehicleType(dr);
		dvt.openDefineVehicleType();
	}

	@Then("^verify define vehicle type page$")
	public void verify_define_vehicle_type_page() throws Throwable {
		DefineVehicleType dvt= new DefineVehicleType(dr);
		dvt.verifyPage(schoolname, scenario);
	}

//define vehicle details
	@When("^user open define vehicle details page$")
	public void user_open_define_vehicle_details_page() throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.openDefineVehicleDetails();
	}

	@Then("^verify define vehicle details page$")
	public void verify_define_vehicle_details_page() throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.verifyPage(schoolname, scenario);
	}

//define vehicle route
	@When("^user open define vehicle route page$")
	public void user_open_define_vehicle_route_page() throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.openDefineVehicleRoute();
	}

	@Then("^verify define vehicle route page$")
	public void verify_define_vehicle_route_page() throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.verifyPage(schoolname, scenario);
	}
	
//define vehicle route relation
	@When("^user open define vehicle route relation page$")
	public void user_open_define_vehicle_route_relation_page() throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.openDefineVehicleRouteRelation();
	}

	@Then("^verify define vehicle route relation page$")
	public void verify_define_vehicle_route_relation_page() throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.verifyPage(schoolname, scenario);
	}

//define transport group
	@When("^user open define transport group page$")
	public void user_open_define_transport_group_page() throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr); 
		dtg.openDefineTransportGroup();
	}

	@Then("^verify define transport group page$")
	public void verify_define_transport_group_page() throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr); 
		dtg.verifyPage(schoolname, scenario);
	}

//define transport medium
	@When("^user open define transport medium page$")
	public void user_open_define_transport_medium_page() throws Throwable {
		DefineTransportMedium dtm= new DefineTransportMedium(dr);
		dtm.openDefineTransportMedium();
	}

	@Then("^verify define transport medium page$")
	public void verify_define_transport_medium_page() throws Throwable {
		DefineTransportMedium dtm= new DefineTransportMedium(dr);
		dtm.verifyPage(schoolname, scenario);
	}
	
//define route stop
	@When("^user open define route stop page$")
	public void user_open_define_route_stop_page() throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.openDefineTransportMedium();
	}

	@Then("^verify define route stop page$")
	public void verify_define_route_stop_page() throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.verifyPage(schoolname, scenario);
	}

//assign transport to students
	@When("^user open assign transport to students page$")
	public void user_open_assign_transport_to_students_page() throws Throwable {
		AssignTransportToStudents ats= new AssignTransportToStudents(dr);
		ats.openAssignTransportToStudents();
	}

	@Then("^verify assign transport to students page$")
	public void verify_assign_transport_to_students_page() throws Throwable {
		AssignTransportToStudents ats= new AssignTransportToStudents(dr);
		ats.verifyPage(schoolname, scenario);
	}

//assign self transport to students
	@When("^user open assign self transport to students page$")
	public void user_open_assign_self_transport_to_students_page() throws Throwable {
		AssignSelfTransportToStudent asts= new AssignSelfTransportToStudent(dr);
		asts.openAssignSelfTransportToStudent();
	}

	@Then("^verify assign self transport to students page$")
	public void verify_assign_self_transport_to_students_page() throws Throwable {
		AssignSelfTransportToStudent asts= new AssignSelfTransportToStudent(dr);
		asts.verifyPage(schoolname, scenario);
	}

//character certificate with combo box
	@When("^user open character certificate with combo box page$")
	public void user_open_character_certificate_with_combo_box_page() throws Throwable {
		CharacterCertificateWithComboBox ccb= new CharacterCertificateWithComboBox(dr);
		ccb.openCharacterCertificateWithComboBox();
	}

	@Then("^verify character certificate with combo box page$")
	public void verify_character_certificate_with_combo_box_page() throws Throwable {
		CharacterCertificateWithComboBox ccb= new CharacterCertificateWithComboBox(dr);
		ccb.verifyPage(schoolname, scenario);
	}

//tc form class wise
	@When("^user open tc form class wise page$")
	public void user_open_tc_form_class_wise_page() throws Throwable {
		TcFormClassWise tfcw= new TcFormClassWise(dr);
		tfcw.openTcFormClassWise();
	}

	@Then("^verify tc form class wise page$")
	public void verify_tc_form_class_wise_page() throws Throwable {
		TcFormClassWise tfcw= new TcFormClassWise(dr);
		tfcw.verifyPage(schoolname, scenario);
	}
	
//certificates
	@When("^user open certificates page$")
	public void user_open_certificates_page() throws Throwable {
		Certificates c= new Certificates(dr);
		c.openCertificates();
	}

	@Then("^verify certificates page$")
	public void verify_certificates_page() throws Throwable {
		Certificates c= new Certificates(dr);
		c.verifyPage(schoolname, scenario);
	}

//generate tc 
	@When("^user open generate tc page$")
	public void user_open_generate_tc_page() throws Throwable {
		GenerateTc gtc= new GenerateTc(dr);
		gtc.openGenerateTc();
	}

	@Then("^verify generate tc page$")
	public void verify_generate_tc_page() throws Throwable {
		GenerateTc gtc= new GenerateTc(dr);
		gtc.verifyPage(schoolname, scenario);
	}
	
//tc form
	@When("^user open tc form page$")
	public void user_open_tc_form_page() throws Throwable {
		TcForm tf= new TcForm(dr);
		tf.openTcForm();
	}

	@Then("^verify tc form page$")
	public void verify_tc_form_page() throws Throwable {
		TcForm tf= new TcForm(dr);
		tf.verifyPage(schoolname, scenario);
	}

}
