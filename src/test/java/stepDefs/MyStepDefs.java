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
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
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

	@When("^select fine waive off setting as \"([^\"]*)\" on set due limit page$")
	public void select_fine_waive_off_setting_as_on_set_due_limit_page(String arg1) throws Throwable {
		SetDueLimit sdl= new SetDueLimit(dr);
		sdl.selectFineWaiveOffSetting(arg1);
	}

	@Then("^click save on set due limit page$")
	public void click_save_on_set_due_limit_page() throws Throwable {
		SetDueLimit sdl= new SetDueLimit(dr);
        sdl.clickSave(schoolname, scenario);
	}

	@Then("^click view on set due limit page$")
	public void click_view_on_set_due_limit_page() throws Throwable {
		SetDueLimit sdl= new SetDueLimit(dr);
		sdl.clickView(schoolname, scenario);
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

	@Then("^click update on fee entry setting page$")
	public void click_update_on_fee_entry_setting_page() throws Throwable {
		FeeEntrySetting fes= new FeeEntrySetting(dr);
		fes.clickUpdate(schoolname, scenario);
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

	@When("^select allow user to select bank in fee entry on fee entry setting others page$")
	public void select_allow_user_to_select_bank_in_fee_entry_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectBankSetting();
	}

	@When("^enter cheque bounce fine \"([^\"]*)\" on fee entry setting others page$")
	public void enter_cheque_bounce_fine_on_fee_entry_setting_others_page(String arg1) throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.enterChequeBounceFine(arg1);
 	}

	@When("^select pay mode on fee entry setting others page$")
	public void select_pay_mode_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectPaymentMode();
	}

	@When("^select allow user to reuse fee receipt no on fee entry setting others page$")
	public void select_allow_user_to_reuse_fee_receipt_no_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectReuseFeeReceiptNo();
	}

	@When("^select discount option in fees on fee entry setting others page$")
	public void select_discount_option_in_fees_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableDiscountOption();
	}

	@When("^select enable evening transport on fee entry setting others page$")
	public void select_enable_evening_transport_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableEveningTransport();
	}

	@When("^select block back date receipt entry on fee entry setting others page$")
	public void select_block_back_date_receipt_entry_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectBlockBackDateEntry();
	}

	@When("^select late fine waive off option on fee entry setting others page$")
	public void select_late_fine_waive_off_option_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectLateFineWaiveOffAutoCheck();
	}

	@When("^select late fine with cheque date on fee entry setting others page$")
	public void select_late_fine_with_cheque_date_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectLateFineWithChequeDate();
	}

	@When("^select do not show cancelled receipt amount on fee entry setting others page$")
	public void select_do_not_show_cancelled_receipt_amount_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectCancelledReceiptAmount();
	}

	@When("^select entry time concession reason on fee entry setting others page$")
	public void select_entry_time_concession_reason_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectAskConcessionReason();
	}

	@When("^select enable manual late fee on fee entry setting others page$")
	public void select_enable_manual_late_fee_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableManualLateFee();
	}

	@When("^select manual late fee type \"([^\"]*)\" on fee entry setting others page$")
	public void select_manual_late_fee_type_on_fee_entry_setting_others_page(String arg1) throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectInstallment(arg1);
	}

	@When("^select enable manual cheque bounce on fee entry setting others page$")
	public void select_enable_manual_cheque_bounce_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableManualChequeBounce();
	}

	@When("^select enable waive off with cheque bounce on fee entry setting others page$")
	public void select_enable_waive_off_with_cheque_bounce_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableWaiveOffWithChequeBounce();
	}

	@When("^select enable sms on fee entry setting others page$")
	public void select_enable_sms_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectEnableSmsOnFeeEntry();
	}

	@When("^select print receipt on fee entry setting others page$")
	public void select_print_receipt_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectPrintReceipt();
	}

	@When("^select modify transport on fee entry setting others page$")
	public void select_modify_transport_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectModifyTransport();
	}

	@When("^select modify cheque details on fee entry setting others page$")
	public void select_modify_cheque_details_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.selectModifyChequeDetails();
	}

	@Then("^click save on fee entry setting others page$")
	public void click_save_on_fee_entry_setting_others_page() throws Throwable {
		FeeEntrySettingOthers fso= new FeeEntrySettingOthers(dr);
		fso.clickSave(schoolname, scenario);
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

	@When("^select advance amount setting as \"([^\"]*)\" on fee opening balance setting$")
	public void select_advance_amount_setting_as_on_fee_opening_balance_setting(String arg1) throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.selectAdvanceAmountSetting(arg1);
	}

	@When("^select opening balance setting as \"([^\"]*)\" on fee opening balance setting$")
	public void select_opening_balance_setting_as_on_fee_opening_balance_setting(String arg1) throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.selectOpeningBalanceSetting(arg1);
	}

	@When("^select fee type on fee opening balance setting$")
	public void select_fee_type_on_fee_opening_balance_setting() throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.selectAdvanceFeeType();
	}

	@Then("^click save on fee opening balance setting page$")
	public void click_save_on_fee_opening_balance_setting_page() throws Throwable {
		FeeOpeningBalanceSetting fbal= new FeeOpeningBalanceSetting(dr);
		fbal.clickSave(schoolname, scenario);
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

	@When("^select admission no on global search option setting page$")
	public void select_admission_no_on_global_search_option_setting_page() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectAdmissionNo();
	}

	@When("^select name on global search option setting$")
	public void select_name_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectName();
	}

	@When("^select father name on global search option setting$")
	public void select_father_name_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectFatherName();
	}

	@When("^select mother name on global search option setting$")
	public void select_mother_name_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectMotherName();
	}

	@When("^select roll no on global search option setting$")
	public void select_roll_no_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectRollNo();
	}

	@When("^select mobile no on global search option setting$")
	public void select_mobile_no_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectMobile();
	}

	@When("^select address on global search option setting$")
	public void select_address_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectAddress();
	}

	@When("^select barcode on global search option setting$")
	public void select_barcode_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectBarcode();
	}

	@When("^select computer no on global search option setting$")
	public void select_computer_no_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectComputerNo();
	}

	@When("^select bus id on global search option setting$")
	public void select_bus_id_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectBusId();
	}

	@Then("^click set globally on global search option setting$")
	public void click_set_globally_on_global_search_option_setting() throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.clickSetGlobally(schoolname, scenario);
	}

	@When("^select registration form settings as \"([^\"]*)\"$")
	public void select_registration_form_settings_as(String arg1) throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectStudentRegistrationFormSettings(arg1);
	}

	@When("^select display on report as \"([^\"]*)\"$")
	public void select_display_on_report_as(String arg1) throws Throwable {
		GlobalSearchOptionSettings gsos= new GlobalSearchOptionSettings(dr);
		gsos.selectDisplayOnReport(arg1);
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

	@When("^select setting type \"([^\"]*)\" on bus id setting page$")
	public void select_setting_type_on_bus_id_setting_page(String arg1) throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.selectSettingType(arg1);
	}

	@When("^enter prefix \"([^\"]*)\" on bus id setting page$")
	public void enter_prefix_on_bus_id_setting_page(String arg1) throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.enterPrefix(arg1);
	}

	@When("^enter start from \"([^\"]*)\" on bus id setting page$")
	public void enter_start_from_on_bus_id_setting_page(String arg1) throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.enterStartFrom(arg1);
	}

	@When("^enter lead zero \"([^\"]*)\" on bus id setting page$")
	public void enter_lead_zero_on_bus_id_setting_page(String arg1) throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.enterLeadZero(arg1);
	}

	@When("^enter suffix \"([^\"]*)\" on bus id setting page$")
	public void enter_suffix_on_bus_id_setting_page(String arg1) throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.enterSuffix(arg1);
	}

	@Then("^click save on bus id setting page$")
	public void click_save_on_bus_id_setting_page() throws Throwable {
		BusIDSetting bs= new BusIDSetting(dr);
		bs.clickSave(schoolname, scenario);
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

	@When("^select setting type \"([^\"]*)\" on bill book setting page$")
	public void select_setting_type_on_bill_book_setting_page(String arg1) throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.selectSettingType(arg1);
	}

	@When("^enter prefix \"([^\"]*)\" on bill book setting page$")
	public void enter_prefix_on_bill_book_setting_page(String arg1) throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.enterPrefix(arg1);
	}

	@When("^enter start from \"([^\"]*)\" on bill book setting page$")
	public void enter_start_from_on_bill_book_setting_page(String arg1) throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.enterStartFrom(arg1);
	}

	@When("^enter lead zero \"([^\"]*)\" on bill book setting page$")
	public void enter_lead_zero_on_bill_book_setting_page(String arg1) throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.enterLeadZero(arg1);
	}

	@When("^enter suffix \"([^\"]*)\" on bill book setting page$")
	public void enter_suffix_on_bill_book_setting_page(String arg1) throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.enterSuffix(arg1);
	}

	@Then("^click save on bill book setting page$")
	public void click_save_on_bill_book_setting_page() throws Throwable {
		BillBookSetting bbs= new BillBookSetting(dr);
		bbs.clickSave(schoolname, scenario);
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

	@When("^select fee type on school global details with type page$")
	public void select_fee_type_on_school_global_details_with_type_page() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.selectFeeType();
	}

	@When("^enter school name \"([^\"]*)\" on school global details with type$")
	public void enter_school_name_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolName(arg1);
	}

	@When("^enter school address \"([^\"]*)\" on school global details with type$")
	public void enter_school_address_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolAddress(arg1);
	}

	@When("^enter school addresss \"([^\"]*)\" on school global details with type$")
	public void enter_school_addresss_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolAddress2(arg1);
	}

	@When("^enter school short name \"([^\"]*)\" on school global details with type$")
	public void enter_school_short_name_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolShortName(arg1);
	}

	@When("^enter contact no \"([^\"]*)\" on school global details with type$")
	public void enter_contact_no_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterContactNo(arg1);
	}

	@When("^enter mobile no \"([^\"]*)\" on school global details with type$")
	public void enter_mobile_no_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterMobileNo(arg1);
	}

	@When("^enter email id \"([^\"]*)\" on school global details with type$")
	public void enter_email_id_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterEMail(arg1);
	}

	@When("^enter support email id \"([^\"]*)\" on school global details with type$")
	public void enter_support_email_id_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSupportEmailID(arg1);
	}

	@When("^enter website \"([^\"]*)\" on school global details with type$")
	public void enter_website_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterWebsite(arg1);
	}

	@When("^enter prefix \"([^\"]*)\" on school global details with type$")
	public void enter_prefix_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterPrefix(arg1);
	}

	@When("^select receipt settings on school global details with type$")
	public void select_receipt_settings_on_school_global_details_with_type() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.selectReceiptSettings();
	}

	@When("^enter school no \"([^\"]*)\" on school global details with type$")
	public void enter_school_no_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolNo(arg1);
	}

	@When("^enter affiliation to \"([^\"]*)\" on school global details with type$")
	public void enter_affiliation_to_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterAffiliationTo(arg1);
	}

	@When("^enter affiliation no \"([^\"]*)\" on school global details with type$")
	public void enter_affiliation_no_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterAffiliationNo(arg1);
	}

	@When("^enter associates \"([^\"]*)\" on school global details with type$")
	public void enter_associates_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterAssociates(arg1);
	}

	@When("^enter renew upto \"([^\"]*)\" on school global details with type$")
	public void enter_renew_upto_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterRenewUpto(arg1);
	}

	@When("^enter school status \"([^\"]*)\" on school global details with type$")
	public void enter_school_status_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterSchoolStatus(arg1);
	}

	@When("^enter city \"([^\"]*)\" on school global details with type$")
	public void enter_city_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterCity(arg1);
	}

	@When("^enter ecare mobile no \"([^\"]*)\" on school global details with type$")
	public void enter_ecare_mobile_no_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterECareMobileNo(arg1);
	}

	@When("^enter working days \"([^\"]*)\" on school global details with type$")
	public void enter_working_days_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterWorkingDays(arg1);
	}

	@When("^enter recess \"([^\"]*)\" on school global details with type$")
	public void enter_recess_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterRecess(arg1);
	}

	@When("^enter total periods \"([^\"]*)\" on school global details with type$")
	public void enter_total_periods_on_school_global_details_with_type(String arg1) throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.enterTotalPeriod(arg1);
	}

	@Then("^click save on school global details with type page$")
	public void click_save_on_school_global_details_with_type_page() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.clickSave(schoolname, scenario);
	}

	@Then("^click view on school global details with type page$")
	public void click_view_on_school_global_details_with_type_page() throws Throwable {
		SchoolGlobalDetailsWithType sgd= new SchoolGlobalDetailsWithType(dr);
		sgd.clickView(schoolname, scenario);
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

	@When("^enter school name \"([^\"]*)\" on school global details$")
	public void enter_school_name_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolName(arg1);
	}

	@When("^enter school address \"([^\"]*)\" on school global details$")
	public void enter_school_address_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolAddress(arg1);
	}

	@When("^enter school addresss \"([^\"]*)\" on school global details$")
	public void enter_school_addresss_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolAddress2(arg1);
	}

	@When("^enter school short name \"([^\"]*)\" on school global details$")
	public void enter_school_short_name_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolShortName(arg1);
	}

	@When("^enter contact no \"([^\"]*)\" on school global details$")
	public void enter_contact_no_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterContactNo(arg1);
	}

	@When("^enter mobile no \"([^\"]*)\" on school global details$")
	public void enter_mobile_no_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterMobileNo(arg1);
	}

	@When("^enter email id \"([^\"]*)\" on school global details$")
	public void enter_email_id_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterEMail(arg1);
	}

	@When("^enter support email id \"([^\"]*)\" on school global details$")
	public void enter_support_email_id_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSupportEmailID(arg1);
	}

	@When("^enter website \"([^\"]*)\" on school global details$")
	public void enter_website_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterWebsite(arg1);
	}

	@When("^enter prefix \"([^\"]*)\" on school global details$")
	public void enter_prefix_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterPrefix(arg1);
	}

	@When("^enter iso details \"([^\"]*)\" on school global details$")
	public void enter_iso_details_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterISODetails(arg1);
	}

	@When("^enter school no \"([^\"]*)\" on school global details$")
	public void enter_school_no_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolNo(arg1);
	}

	@When("^enter affiliation to \"([^\"]*)\" on school global details$")
	public void enter_affiliation_to_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterAffiliationTo(arg1);
	}

	@When("^enter affiliation no \"([^\"]*)\" on school global details$")
	public void enter_affiliation_no_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterAffiliationNo(arg1);
	}

	@When("^enter associates \"([^\"]*)\" on school global details$")
	public void enter_associates_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterAssociates(arg1);
	}

	@When("^enter renew upto \"([^\"]*)\" on school global details$")
	public void enter_renew_upto_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterRenewUpto(arg1);
	}

	@When("^enter school status \"([^\"]*)\" on school global details$")
	public void enter_school_status_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterSchoolStatus(arg1);
	}

	@When("^enter city \"([^\"]*)\" on school global details$")
	public void enter_city_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterCity(arg1);
	}

	@When("^enter ecare mobile no \"([^\"]*)\" on school global details$")
	public void enter_ecare_mobile_no_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterECareMobileNo(arg1);
	}

	@When("^enter working days \"([^\"]*)\" on school global details$")
	public void enter_working_days_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterWorkingDays(arg1);
	}

	@When("^enter recess \"([^\"]*)\" on school global details$")
	public void enter_recess_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterRecess(arg1);
	}

	@When("^enter total periods \"([^\"]*)\" on school global details$")
	public void enter_total_periods_on_school_global_details(String arg1) throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.enterTotalPeriod(arg1);
	}

	@Then("^click save on school global details page$")
	public void click_save_on_school_global_details_page() throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.clickSave(schoolname, scenario);
	}

	@Then("^click view on school global details page$")
	public void click_view_on_school_global_details_page() throws Throwable {
		SchoolGlobalDetails sgd= new SchoolGlobalDetails(dr);
		sgd.clickView(schoolname, scenario);
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

	@When("^enter school board as \"([^\"]*)\" on define school board$")
	public void enter_school_board_as_on_define_school_board(String arg1) throws Throwable {
		DefineSchoolBoard dsb= new DefineSchoolBoard(dr);
		dsb.enterBoard(arg1);
	}

	@Then("^click save on define school board$")
	public void click_save_on_define_school_board() throws Throwable {
		DefineSchoolBoard dsb= new DefineSchoolBoard(dr);
		dsb.clickSave(schoolname, scenario);
	}

	@Then("^click view on define school board page$")
	public void click_view_on_define_school_board_page() throws Throwable {
		DefineSchoolBoard dsb= new DefineSchoolBoard(dr);
		dsb.clickView(schoolname, scenario);
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

	@When("^enter language as \"([^\"]*)\"$")
	public void enter_language_as(String arg1) throws Throwable {
		DefineLanguage dl= new DefineLanguage(dr);
		dl.enterLanguage(arg1);
	}

	@Then("^click save on define language page$")
	public void click_save_on_define_language_page() throws Throwable {
		DefineLanguage dl= new DefineLanguage(dr);
		dl.clickSave(schoolname, scenario);
	}

	@Then("^click view on define language page$")
	public void click_view_on_define_language_page() throws Throwable {
		DefineLanguage dl= new DefineLanguage(dr);
		dl.clickView(schoolname, scenario);
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

	@When("^enter mother tongue as \"([^\"]*)\"$")
	public void enter_mother_tongue_as(String arg1) throws Throwable {
		DefineMotherTongue dmt= new DefineMotherTongue(dr);
		dmt.enterMotherTongue(arg1);
	}

	@Then("^click save on define mother tongue page$")
	public void click_save_on_define_mother_tongue_page() throws Throwable {
		DefineMotherTongue dmt= new DefineMotherTongue(dr);
		dmt.clickSave(schoolname, scenario);
	}

	@Then("^click view on define mother tongue page$")
	public void click_view_on_define_mother_tongue_page() throws Throwable {
		DefineMotherTongue dmt= new DefineMotherTongue(dr);
		dmt.clickView(schoolname, scenario);
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

	@When("^select class on student health entry$")
	public void select_class_on_student_health_entry() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.selectClass();
	}

	@When("^select section on student health entry$")
	public void select_section_on_student_health_entry() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.selectSection();
	}

	@When("^select term on student health entry$")
	public void select_term_on_student_health_entry() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.selectTerm();
	}

	@Then("^click save on student health entry page$")
	public void click_save_on_student_health_entry_page() throws Throwable {
		StudentHealthEntry she= new StudentHealthEntry(dr);
		she.clickSave(schoolname, scenario);
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

	@Then("^click view on define academic year page$")
	public void click_view_on_define_academic_year_page() throws Throwable {
		DefineAcademicYear day= new DefineAcademicYear(dr);
		day.clickView(schoolname, scenario);
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

	@Then("^click view on define financial year page$")
	public void click_view_on_define_financial_year_page() throws Throwable {
		DefineFinancialYear dfy= new DefineFinancialYear(dr);
		dfy.clickView(schoolname, scenario);
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

	@When("^enter category as \"([^\"]*)\"$")
	public void enter_category_as(String arg1) throws Throwable {
		DefineCategory dc= new DefineCategory(dr);
		dc.enterCategory(arg1);
	}

	@Then("^click save on define category page$")
	public void click_save_on_define_category_page() throws Throwable {
		DefineCategory dc= new DefineCategory(dr);
		dc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define category page$")
	public void click_view_on_define_category_page() throws Throwable {
		DefineCategory dc= new DefineCategory(dr);
		dc.clickView(schoolname, scenario);
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

	@When("^enter religion as \"([^\"]*)\"$")
	public void enter_religion_as(String arg1) throws Throwable {
		DefineReligion drg= new DefineReligion(dr);
		drg.enterReligion(arg1);
	}

	@Then("^click save on define religion page$")
	public void click_save_on_define_religion_page() throws Throwable {
		DefineReligion drg= new DefineReligion(dr);
		drg.clickSave(schoolname, scenario);
	}

	@Then("^click view on define religion page$")
	public void click_view_on_define_religion_page() throws Throwable {
		DefineReligion drg= new DefineReligion(dr);
		drg.clickView(schoolname, scenario);
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

	@When("^enter wing as \"([^\"]*)\"$")
	public void enter_wing_as(String arg1) throws Throwable {
		DefineWing dw= new DefineWing(dr);
		dw.enterWing(arg1);
	}

	@Then("^click save on define wing page$")
	public void click_save_on_define_wing_page() throws Throwable {
		DefineWing dw= new DefineWing(dr);
		dw.clickSave(schoolname, scenario);
	}

	@Then("^click view on define wing page$")
	public void click_view_on_define_wing_page() throws Throwable {
		DefineWing dw= new DefineWing(dr);
		dw.clickView(schoolname, scenario);
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

	@When("^enter class as \"([^\"]*)\" on define class page$")
	public void enter_class_as_on_define_class_page(String arg1) throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.enterClass(arg1);
	}

	@When("^select wing on define class page$")
	public void select_wing_on_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.selectWing();
	}

	@When("^select school on define class page$")
	public void select_school_on_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.selectSchool();
	}

	@Then("^click save on define class page$")
	public void click_save_on_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define class page$")
	public void click_view_on_define_class_page() throws Throwable {
		DefineClass dc= new DefineClass(dr);
		dc.clickView(schoolname, scenario);
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

	@When("^select class on relate class section page$")
	public void select_class_on_relate_class_section_page() throws Throwable {
		RelateClassSection rcs= new RelateClassSection(dr);
		rcs.selectClass();
	}

	@When("^select section on relate class section page$")
	public void select_section_on_relate_class_section_page() throws Throwable {
		RelateClassSection rcs= new RelateClassSection(dr);
		rcs.assignSection();
	}

	@Then("^click save on relate class section page$")
	public void click_save_on_relate_class_section_page() throws Throwable {
		RelateClassSection rcs= new RelateClassSection(dr);
		rcs.clickSave(schoolname, scenario);
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

	@When("^enter section as \"([^\"]*)\" on define section page$")
	public void enter_section_as_on_define_section_page(String arg1) throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.enterSection(arg1);
	}

	@When("^enter order no as \"([^\"]*)\" on define section page$")
	public void enter_order_no_as_on_define_section_page(String arg1) throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.enterOrderNo(arg1);
	}

	@Then("^click save on define section page$")
	public void click_save_on_define_section_page() throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.clickSave(schoolname, scenario);
	}

	@Then("^click view on define section page$")
	public void click_view_on_define_section_page() throws Throwable {
		DefineSection ds= new DefineSection(dr);
		ds.clickView(schoolname, scenario);
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

	@When("^enter caste as \"([^\"]*)\"$")
	public void enter_caste_as(String arg1) throws Throwable {
		DefineCaste dc= new DefineCaste(dr);
		dc.enterCaste(arg1);
	}

	@Then("^click save on define caste page$")
	public void click_save_on_define_caste_page() throws Throwable {
		DefineCaste dc= new DefineCaste(dr);
		dc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define caste page$")
	public void click_view_on_define_caste_page() throws Throwable {
		DefineCaste dc= new DefineCaste(dr);
		dc.clickView(schoolname, scenario);
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

	@When("^enter last result as \"([^\"]*)\"$")
	public void enter_last_result_as(String arg1) throws Throwable {
		DefineLastResult dlr= new DefineLastResult(dr);
		dlr.enterLastResult(arg1);
	}

	@Then("^click view on define last result page$")
	public void click_view_on_define_last_result_page() throws Throwable {
		DefineLastResult dlr= new DefineLastResult(dr);
		dlr.clickView(schoolname, scenario);
	}

	@Then("^click save on define last result$")
	public void click_save_on_define_last_result() throws Throwable {
		DefineLastResult dlr= new DefineLastResult(dr);
		dlr.clickSave(schoolname, scenario);
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

	@When("^enter promotion name as \"([^\"]*)\"$")
	public void enter_promotion_name_as(String arg1) throws Throwable {
		DefinePromotionMaster dpm= new DefinePromotionMaster(dr);
		dpm.enterPromotion(arg1);
	}

	@Then("^click save on define promotion master$")
	public void click_save_on_define_promotion_master() throws Throwable {
		DefinePromotionMaster dpm= new DefinePromotionMaster(dr);
		dpm.clickSave(schoolname, scenario);
	}

	@Then("^click view on define promotion master page$")
	public void click_view_on_define_promotion_master_page() throws Throwable {
		DefinePromotionMaster dpm= new DefinePromotionMaster(dr);
		dpm.clickView(schoolname, scenario);
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

	@When("^enter character as \"([^\"]*)\"$")
	public void enter_character_as(String arg1) throws Throwable {
		DefineCharacter dc= new DefineCharacter(dr);
		dc.enterCharacter(arg1);
	}

	@Then("^click save on define character$")
	public void click_save_on_define_character() throws Throwable {
		DefineCharacter dc= new DefineCharacter(dr);
		dc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define character page$")
	public void click_view_on_define_character_page() throws Throwable {
		DefineCharacter dc= new DefineCharacter(dr);
		dc.clickView(schoolname, scenario);
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

	@When("^enter other remark as \"([^\"]*)\"$")
	public void enter_other_remark_as(String arg1) throws Throwable {
		DefineOtherRemark dor= new DefineOtherRemark(dr);
		dor.enterRemark(arg1);
	}

	@Then("^click save on define other remark$")
	public void click_save_on_define_other_remark() throws Throwable {
		DefineOtherRemark dor= new DefineOtherRemark(dr);
		dor.clickSave(schoolname, scenario);
	}

	@Then("^click view on define other remark page$")
	public void click_view_on_define_other_remark_page() throws Throwable {
		DefineOtherRemark dor= new DefineOtherRemark(dr);
		dor.clickView(schoolname, scenario);
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

	@When("^enter extra activity as \"([^\"]*)\"$")
	public void enter_extra_activity_as(String arg1) throws Throwable {
		DefineExtraActivity dea= new DefineExtraActivity(dr);
		dea.enterExtraActivity(arg1);
	}

	@Then("^click save on define extra activity$")
	public void click_save_on_define_extra_activity() throws Throwable {
		DefineExtraActivity dea= new DefineExtraActivity(dr);
		dea.clickSave(schoolname, scenario);
	}

	@Then("^click view on define extra activity page$")
	public void click_view_on_define_extra_activity_page() throws Throwable {
		DefineExtraActivity dea= new DefineExtraActivity(dr);
		dea.clickView(schoolname, scenario);
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

	@When("^enter tc caste as \"([^\"]*)\"$")
	public void enter_tc_caste_as(String arg1) throws Throwable {
		DefineTcCaste dtc= new DefineTcCaste(dr);
		dtc.enterCaste(arg1);
	}

	@Then("^click save on define tc caste$")
	public void click_save_on_define_tc_caste() throws Throwable {
		DefineTcCaste dtc= new DefineTcCaste(dr);
		dtc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define tc caste page$")
	public void click_view_on_define_tc_caste_page() throws Throwable {
		DefineTcCaste dtc= new DefineTcCaste(dr);
		dtc.clickView(schoolname, scenario);
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

	@When("^enter bank as \"([^\"]*)\" on define bank page$")
	public void enter_bank_as_on_define_bank_page(String arg1) throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.enterBank(arg1);
	}

	@When("^enter account no as \"([^\"]*)\" on define bank page$")
	public void enter_account_no_as_on_define_bank_page(String arg1) throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.enterAccountNo(arg1);
	}

	@When("^enter contact detail as \"([^\"]*)\" on define bank page$")
	public void enter_contact_detail_as_on_define_bank_page(String arg1) throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.enterContactDetails(arg1);
	}

	@When("^click is school on define bank page$")
	public void click_is_school_on_define_bank_page() throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.selectIsSchool();
	}

	@Then("^click save on define bank$")
	public void click_save_on_define_bank() throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.clickSave(schoolname, scenario);
	}

	@Then("^click view on define bank page$")
	public void click_view_on_define_bank_page() throws Throwable {
		DefineBank db= new DefineBank(dr);
		db.clickView(schoolname, scenario);
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

	@When("^enter unit name as \"([^\"]*)\" on health unit master page$")
	public void enter_unit_name_as_on_health_unit_master_page(String arg1) throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.enterUnitName(arg1);
	}

	@When("^select unit type as \"([^\"]*)\" on health unit master page$")
	public void select_unit_type_as_on_health_unit_master_page(String arg1) throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.selectUnitType(arg1);
	}

	@Then("^click save on health unit master$")
	public void click_save_on_health_unit_master() throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.clickSave(schoolname, scenario);
	}

	@Then("^click view on health unit master page$")
	public void click_view_on_health_unit_master_page() throws Throwable {
		HealthUnitMaster hum= new HealthUnitMaster(dr);
		hum.clickView(schoolname, scenario);
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

	@When("^enter health status as \"([^\"]*)\" on health master$")
	public void enter_health_status_as_on_health_master(String arg1) throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.enterHealthStatus(arg1);
	}

	@When("^select unit \"([^\"]*)\" on health master$")
	public void select_unit_on_health_master(String arg1) throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.selectUnit(arg1);
	}

	@Then("^click save on health master$")
	public void click_save_on_health_master() throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.clickSave(schoolname, scenario);
	}

	@Then("^click view on health master page$")
	public void click_view_on_health_master_page() throws Throwable {
		HealthMaster hm= new HealthMaster(dr);
		hm.clickView(schoolname, scenario);
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

	@When("^enter term name as \"([^\"]*)\" on term master$")
	public void enter_term_name_as_on_term_master(String arg1) throws Throwable {
		TermMaster tm= new TermMaster(dr);
		tm.enterTermName(arg1);
	}

	@Then("^click save on term master$")
	public void click_save_on_term_master() throws Throwable {
		TermMaster tm= new TermMaster(dr);
		tm.clickSave(schoolname, scenario);
	}

	@Then("^click view on term master page$")
	public void click_view_on_term_master_page() throws Throwable {
		TermMaster tm= new TermMaster(dr);
		tm.clickView(schoolname, scenario);
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

	@When("^enter installment name  \"([^\"]*)\" on define fee installment page$")
	public void enter_installment_name_on_define_fee_installment_page(String arg1) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.enterInstallmentName(arg1);
	}

	@When("^enter installment print name \"([^\"]*)\" on define fee installment page$")
	public void enter_installment_print_name_on_define_fee_installment_page(String arg1) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.enterInstallmentPrintName(arg1);
	}

	@When("^enter installment preference no \"([^\"]*)\" on define fee installment page$")
	public void enter_installment_preference_no_on_define_fee_installment_page(String arg1) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.enterInstallmentPreferenceNo(arg1);
	}

	@When("^enter due on date as year \"([^\"]*)\" month \"([^\"]*)\" day \"([^\"]*)\" on define fee installment page$")
	public void enter_due_on_date_as_year_month_day_on_define_fee_installment_page(String arg1, String arg2, String arg3) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.selectDueOnDateYear(arg1);
		df.selectDueOnDateMonth(arg2);
		df.selectDueOnDateDay(arg3);
	}

	@When("^enter due date as year \"([^\"]*)\" month \"([^\"]*)\" day \"([^\"]*)\" on define fee installment page$")
	public void enter_due_date_as_year_month_day_on_define_fee_installment_page(String arg1, String arg2, String arg3) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.selectDueDateYear(arg1);
		df.selectDueDateMonth(arg2);
		df.selectDueDateDay(arg3);
	}

	@When("^select month \"([^\"]*)\" on define fee installment page$")
	public void select_month_on_define_fee_installment_page(String arg1) throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.selectMonth(arg1);
	}

	@Then("^click save on define fee installment page$")
	public void click_save_on_define_fee_installment_page() throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.clickSave(schoolname, scenario);
	}

	@Then("^click view on define fee installment page$")
	public void click_view_on_define_fee_installment_page() throws Throwable {
		DefineFeeInstallment df= new DefineFeeInstallment(dr);
		df.clickView(schoolname, scenario);
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

	@When("^enter head name  \"([^\"]*)\" on define fee head page$")
	public void enter_head_name_on_define_fee_head_page(String arg1) throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.enterHeadName(arg1);
	}

	@When("^enter head print name \"([^\"]*)\" on define fee head page$")
	public void enter_head_print_name_on_define_fee_head_page(String arg1) throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.enterHeadPrintName(arg1);
	}

	@When("^select pay schedule \"([^\"]*)\" on define fee head page$")
	public void select_pay_schedule_on_define_fee_head_page(String arg1) throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.selectPayschedule(arg1);
	}

	@When("^select type as \"([^\"]*)\" on define fee head page$")
	public void select_type_as_on_define_fee_head_page(String arg1) throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.selectType(arg1);
	}

	@When("^select show in certificate on define fee head page$")
	public void select_show_in_certificate_on_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.selectShowInCertificate();
	}

	@When("^select fee refundable on define fee head page$")
	public void select_fee_refundable_on_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.selectFeeRefundable();
	}

	@Then("^click save on define fee head page$")
	public void click_save_on_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.clickSave(schoolname, scenario);
	}

	@Then("^click view on define fee head page$")
	public void click_view_on_define_fee_head_page() throws Throwable {
		DefineFeeHead dfh= new DefineFeeHead(dr);
		dfh.clickView(schoolname, scenario);
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

	@When("^enter fee type name \"([^\"]*)\" on define fee type page$")
	public void enter_fee_type_name_on_define_fee_type_page(String arg1) throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.enterFeeTypeName(arg1);
	}

	@When("^enter fee type preference no \"([^\"]*)\" on define fee type page$")
	public void enter_fee_type_preference_no_on_define_fee_type_page(String arg1) throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.enterFeeTypePreferenceNo(arg1);
	}

	@When("^select head details on define fee type page$")
	public void select_head_details_on_define_fee_type_page() throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.selectHeadDetails();
	}

	@Then("^click save on define fee type page$")
	public void click_save_on_define_fee_type_page() throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.clickSave(schoolname, scenario);
	}

	@Then("^click view on define fee type page$")
	public void click_view_on_define_fee_type_page() throws Throwable {
		DefineFeeType dft= new DefineFeeType(dr);
		dft.clickView(schoolname, scenario);
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

	@When("^enter group name \"([^\"]*)\" on define fee group page$")
	public void enter_group_name_on_define_fee_group_page(String arg1) throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.enterGroupName(arg1);
	}

	@When("^select is special on define fee group page$")
	public void select_is_special_on_define_fee_group_page() throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.selectIsSpecial();
	}

	@Then("^click save on define fee group page$")
	public void click_save_on_define_fee_group_page() throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.clickSave(schoolname, scenario);
	}

	@Then("^click view on define fee group page$")
	public void click_view_on_define_fee_group_page() throws Throwable {
		DefineFeeGroup dfg= new DefineFeeGroup(dr);
		dfg.clickView(schoolname, scenario);
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

	@When("^enter concession type as \"([^\"]*)\" on define concession type page$")
	public void enter_concession_type_as_on_define_concession_type_page(String arg1) throws Throwable {
		DefineConcessionType dct= new DefineConcessionType(dr);
		dct.enterConcessionType(arg1);
	}

	@Then("^click save on define concession type page$")
	public void click_save_on_define_concession_type_page() throws Throwable {
		DefineConcessionType dct= new DefineConcessionType(dr);
		dct.clickSave(schoolname, scenario);
	}

	@Then("^click view on define concession type page$")
	public void click_view_on_define_concession_type_page() throws Throwable {
		DefineConcessionType dct= new DefineConcessionType(dr);
		dct.clickView(schoolname, scenario);
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

	@When("^enter concession name as \"([^\"]*)\" on define concession page$")
	public void enter_concession_name_as_on_define_concession_page(String arg1) throws Throwable {
		DefineConcession dc= new DefineConcession(dr);
		dc.enterConcessionName(arg1);
	}

	@Then("^click save on define concession page$")
	public void click_save_on_define_concession_page() throws Throwable {
		DefineConcession dc= new DefineConcession(dr);
		dc.clickSave(schoolname, scenario);
	}

	@Then("^click view on define concession page$")
	public void click_view_on_define_concession_page() throws Throwable {
		DefineConcession dc= new DefineConcession(dr);
		dc.clickView(schoolname, scenario);
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
	@When("^user open student fee details page$")
	public void user_open_student_fee_details_page() throws Throwable {
		StudentFeeDetails sfd= new StudentFeeDetails(dr);
		sfd.openStudentFeeDetails();
	}

	@Then("^verify assign student fee details page$")
	public void verify_assign_student_fee_details_page() throws Throwable {
		StudentFeeDetails sfd= new StudentFeeDetails(dr);
		sfd.verifyPage(schoolname, scenario);
	}

	@Then("^click view on student fee details page$")
	public void click_view_on_student_fee_details_page() throws Throwable {
		StudentFeeDetails sfd= new StudentFeeDetails(dr);
		sfd.clickView(schoolname, scenario);
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

	@When("^select fee group on late fee setting page$")
	public void select_fee_group_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.selectFeeGroup();
	}

	@When("^select fee type on late fee setting page$")
	public void select_fee_type_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.selectFeeType();
	}

	@When("^select installment on late fee setting page$")
	public void select_installment_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.selectInstallment();
	}

	@When("^select late fee type on late fee setting page$")
	public void select_late_fee_type_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.selectLateFeeType();
	}

	@When("^enter amount \"([^\"]*)\" on late fee setting page$")
	public void enter_amount_on_late_fee_setting_page(String arg1) throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.enterAmount(arg1);
	}

	@Then("^click save on late fee setting page$")
	public void click_save_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.clickSave(schoolname, scenario);
	}

	@Then("^click view on late fee setting page$")
	public void click_view_on_late_fee_setting_page() throws Throwable {
		LateFeeSetting lfs= new LateFeeSetting(dr);
		lfs.clickView(schoolname, scenario);
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

	@When("^select fee group on late fee setting page head wise$")
	public void select_fee_group_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.selectFeeGroup();
	}

	@When("^select fee type on late fee setting page head wise$")
	public void select_fee_type_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.selectFeeType();
	}

	@When("^select installment on late fee setting page head wise$")
	public void select_installment_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.selectInstallment();
	}

	@When("^select head on late fee setting page head wise$")
	public void select_head_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.selectHead();
	}

	@When("^select late fee type on late fee setting page head wise$")
	public void select_late_fee_type_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.selectLateFeeType();
	}

	@When("^enter amount \"([^\"]*)\" on late fee setting page head wise$")
	public void enter_amount_on_late_fee_setting_page_head_wise(String arg1) throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.enterAmount(arg1);
	}

	@Then("^click save on late fee setting page head wise$")
	public void click_save_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.clickSave(schoolname, scenario);
	}

	@Then("^click view on late fee setting page head wise$")
	public void click_view_on_late_fee_setting_page_head_wise() throws Throwable {
		LateFeeSettingHeadWise lfh= new LateFeeSettingHeadWise(dr);
		lfh.clickView(schoolname, scenario);
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

	@When("^enter travel agency name as \"([^\"]*)\" on travel agency master$")
	public void enter_travel_agency_name_as_on_travel_agency_master(String arg1) throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.enterTravelAgencyName(arg1);
	}

	@When("^enter mobile no \"([^\"]*)\" on travel agency master$")
	public void enter_mobile_no_on_travel_agency_master(String arg1) throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.enterMobileNo(arg1);
	}

	@When("^mail id \"([^\"]*)\" on travel agency master$")
	public void mail_id_on_travel_agency_master(String arg1) throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.enterEmailId(arg1);
	}

	@Then("^click save on travel agency master$")
	public void click_save_on_travel_agency_master() throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.clickSave(schoolname, scenario);
	}

	@Then("^click view on travel agency master page$")
	public void click_view_on_travel_agency_master_page() throws Throwable {
		TravelAgencyMaster tam= new TravelAgencyMaster(dr);
		tam.clickView(schoolname, scenario);
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

	@When("^enter vehicle name as \"([^\"]*)\" on define vehicle type$")
	public void enter_vehicle_name_as_on_define_vehicle_type(String arg1) throws Throwable {
		DefineVehicleType dvt= new DefineVehicleType(dr);
		dvt.enterVehicleName(arg1);
	}

	@Then("^click save on define vehicle type$")
	public void click_save_on_define_vehicle_type() throws Throwable {
		DefineVehicleType dvt= new DefineVehicleType(dr);
		dvt.clickSave(schoolname, scenario);
	}

	@Then("^click view on define vehicle type page$")
	public void click_view_on_define_vehicle_type_page() throws Throwable {
		DefineVehicleType dvt= new DefineVehicleType(dr);
		dvt.clickView(schoolname, scenario);
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

	@When("^select vehicle owner as \"([^\"]*)\" on define vehicle details page$")
	public void select_vehicle_owner_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.selectVehicleOwner(arg1);
	}

	@When("^enter vehicle type as \"([^\"]*)\" on define vehicle details page$")
	public void enter_vehicle_type_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.selectVehicleType(arg1);
	}

	@When("^enter vehicle name as \"([^\"]*)\" on define vehicle details page$")
	public void enter_vehicle_name_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.enterVehicleName(arg1);
	}

	@When("^enter vehicle registration no as \"([^\"]*)\" on define vehicle details page$")
	public void enter_vehicle_registration_no_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.enterVehicleRegistrationNo(arg1);
	}

	@When("^enter driver name as \"([^\"]*)\" on define vehicle details page$")
	public void enter_driver_name_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.enterDriverName(arg1);
	}

	@When("^enter driver mobile no as \"([^\"]*)\" on define vehicle details page$")
	public void enter_driver_mobile_no_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.enterDriverMobileNo(arg1);
	}

	@When("^enter GPS no as \"([^\"]*)\" on define vehicle details page$")
	public void enter_GPS_no_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.enterGPSNo(arg1);
	}

	@When("^select vendor as \"([^\"]*)\" on define vehicle details page$")
	public void select_vendor_as_on_define_vehicle_details_page(String arg1) throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.selectVendor(arg1);
	}

	@Then("^click save on define vehicle details$")
	public void click_save_on_define_vehicle_details() throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.clickSave(schoolname, scenario);
	}

	@Then("^click view on define vehicle details page$")
	public void click_view_on_define_vehicle_details_page() throws Throwable {
		DefineVehicleDetails dvd= new DefineVehicleDetails(dr);
		dvd.clickView(schoolname, scenario);
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

	@When("^enter route no as \"([^\"]*)\" on define vehicle route page$")
	public void enter_route_no_as_on_define_vehicle_route_page(String arg1) throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.enterRouteNo(arg1);
	}

	@When("^enter route description \"([^\"]*)\" on define vehicle route page$")
	public void enter_route_description_on_define_vehicle_route_page(String arg1) throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.enterRouteDescription(arg1);
	}

	@When("^enter route incharge name \"([^\"]*)\" on define vehicle route page$")
	public void enter_route_incharge_name_on_define_vehicle_route_page(String arg1) throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.enterRouteInchargeName(arg1);
	}

	@When("^enter route incharge mobile no as \"([^\"]*)\" on define vehicle route page$")
	public void enter_route_incharge_mobile_no_as_on_define_vehicle_route_page(String arg1) throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.enterRouteInchargeMobileNo(arg1);
	}

	@Then("^click save on define vehicle route page$")
	public void click_save_on_define_vehicle_route_page() throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.clickSave(schoolname, scenario);
	}

	@Then("^click view on define vehicle route page$")
	public void click_view_on_define_vehicle_route_page() throws Throwable {
		DefineVehicleRoute dvr= new DefineVehicleRoute(dr);
		dvr.clickView(schoolname, scenario);
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

	@Then("^click view on define vehicle route relation page$")
	public void click_view_on_define_vehicle_route_relation_page() throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.clickView(schoolname, scenario);
	}

	@When("^select vehicle name \"([^\"]*)\" on define vehicle route relation page$")
	public void select_vehicle_name_on_define_vehicle_route_relation_page(String arg1) throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.selectVehicleName(arg1);
	}

	@When("^select route on define vehicle route relation page$")
	public void select_route_on_define_vehicle_route_relation_page() throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.selectRoute();
	}

	@Then("^click save on define vehicle route relation page$")
	public void click_save_on_define_vehicle_route_relation_page() throws Throwable {
		DefineVehicleRouteRelation dvrr= new DefineVehicleRouteRelation(dr);
		dvrr.clickSave(schoolname, scenario);
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

	@When("^enter distance name as \"([^\"]*)\" on define transport group page$")
	public void enter_distance_name_as_on_define_transport_group_page(String arg1) throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.enterDistanceName(arg1);
	}

	@When("^enter distance amount \"([^\"]*)\" on define transport group page$")
	public void enter_distance_amount_on_define_transport_group_page(String arg1) throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.enterDistanceAmount(arg1);
	}

	@When("^enter distance from \"([^\"]*)\" on define transport group page$")
	public void enter_distance_from_on_define_transport_group_page(String arg1) throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.enterDistanceFrom(arg1);
	}

	@When("^enter distance to \"([^\"]*)\" on define transport group page$")
	public void enter_distance_to_on_define_transport_group_page(String arg1) throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.enterDistanceTo(arg1);
	}

	@Then("^click save on define transport group page$")
	public void click_save_on_define_transport_group_page() throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.clickSave(schoolname, scenario);
	}

	@Then("^click view on define transport group page$")
	public void click_view_on_define_transport_group_page() throws Throwable {
		DefineTransportGroup dtg= new DefineTransportGroup(dr);
		dtg.clickView(schoolname, scenario);
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

	@When("^enter transport medium as \"([^\"]*)\" on define transport medium page$")
	public void enter_transport_medium_as_on_define_transport_medium_page(String arg1) throws Throwable {
		DefineTransportMedium dtm= new DefineTransportMedium(dr);
		dtm.enterTransportMedium(arg1);
	}

	@Then("^click save on define transport medium page$")
	public void click_save_on_define_transport_medium_page() throws Throwable {
		DefineTransportMedium dtm= new DefineTransportMedium(dr);
		dtm.clickSave(schoolname, scenario);
	}

	@Then("^click view on define transport medium page$")
	public void click_view_on_define_transport_medium_page() throws Throwable {
		DefineTransportMedium dtm= new DefineTransportMedium(dr);
		dtm.clickView(schoolname, scenario);
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

	@When("^select route no \"([^\"]*)\" on define route stop page$")
	public void select_route_no_on_define_route_stop_page(String arg1) throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.selectRouteNo(arg1);
	}

	@When("^enter stop no \"([^\"]*)\" on define route stop page$")
	public void enter_stop_no_on_define_route_stop_page(String arg1) throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.enterStopNo(arg1);
	}

	@When("^enter stop name \"([^\"]*)\" on define route stop page$")
	public void enter_stop_name_on_define_route_stop_page(String arg1) throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.enterStopName(arg1);
	}

	@When("^select transport group on define route stop page$")
	public void select_transport_group_on_define_route_stop_page() throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.selectTransportGroup();
	}

	@Then("^click save on define route stop page$")
	public void click_save_on_define_route_stop_page() throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.clickSave(schoolname, scenario);
	}

	@Then("^click view on define route stop page$")
	public void click_view_on_define_route_stop_page() throws Throwable {
		DefineRouteStop drs= new DefineRouteStop(dr);
		drs.clickView(schoolname, scenario);
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
