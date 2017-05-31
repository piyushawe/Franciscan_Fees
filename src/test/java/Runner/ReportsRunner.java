package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= { "ReportsFeature/ActiveInactiveStudentsDetailReport.feature",
				    "ReportsFeature/AdvancePaymentReport.feature",
				    "ReportsFeature/AmountWithoutStructureReport.feature",
				    "ReportsFeature/AnnualStudentLedger1.feature",
				    "ReportsFeature/AnnualStudentLedger2.feature",
				    "ReportsFeature/AnnualStudentLedger3.feature",
				    "ReportsFeature/AnnualStudentLedgerReport.feature",
				    "ReportsFeature/AssignedTransportReport.feature",
				    "ReportsFeature/BadDebtsReport.feature",
				    "ReportsFeature/CancelledFeesReceiptReport.feature",
				    "ReportsFeature/CategoryGenderWiseStudentStrength.feature",
				    "ReportsFeature/CategoryWiseStudentReport.feature",
				    "ReportsFeature/ChequeClearingStatusReport.feature",
				    "ReportsFeature/ClassSectionTransferReport.feature",
				    "ReportsFeature/ClassWiseMarkList.feature",
				    "ReportsFeature/ClassWiseSiblingReport.feature",
				    "ReportsFeature/ClassWiseStudentDetails.feature",
				    "ReportsFeature/ClassWiseStudentStrength.feature",
				    "ReportsFeature/DailyFeeCollection.feature",
				    "ReportsFeature/DailyFeeCollectionAccountWise.feature",
				    "ReportsFeature/DailyFeeCollectionDateClassWise.feature",
				    "ReportsFeature/DailyFeeCollectionDateFeeGroupWise.feature",
				    "ReportsFeature/DailyFeeCollectionDateWise.feature",
				    "ReportsFeature/DateWiseAdmissionReport.feature",
				    "ReportsFeature/DayWiseTotalCollection.feature",
				    "ReportsFeature/DefaulterListFeeTypeWise.feature",
				    "ReportsFeature/EstimatedCollectionReport.feature",
				    "ReportsFeature/EstimatedTransportDetails.feature",
				    "ReportsFeature/FeeChequeBounceReport.feature",
				    "ReportsFeature/FeeCollectionWithEntryTimeConcession.feature",
				    "ReportsFeature/FeeDefaulterInstallmentWise.feature",
				    "ReportsFeature/FeeDefaulterList.feature",  
				    "ReportsFeature/FeeDefaulterReportConsolidated.feature",  
				    "ReportsFeature/FeeDefaulterReportWithReceiving.feature", 
				    "ReportsFeature/FeeHeadWiseCollectionClassRange.feature",
				    "ReportsFeature/FeesConcession.feature",
				    "ReportsFeature/FeesConcessionInstallHeadWise.feature",
				    "ReportsFeature/FeesDefaulterSlip.feature",
				    "ReportsFeature/FeesStudentLedger.feature",
				    "ReportsFeature/GenderReligionWiseStudentReport.feature",
				    "ReportsFeature/OnlinePaymentStatusReport.feature",
				    "ReportsFeature/GroupWiseStudentDetails.feature",
				    "ReportsFeature/OpeningDuesReport.feature",
				    "ReportsFeature/MonthlyConsolidatedReport.feature",
				    "ReportsFeature/MonthWiseCollectionReport.feature",
				    "ReportsFeature/ReconcileInstallmentClassWise.feature",
				    "ReportsFeature/ReconcileReport.feature",
				    "ReportsFeature/RefundAmount.feature",
				    "ReportsFeature/ReligionGenderWiseStudentStrength.feature",
				    "ReportsFeature/RouteWiseStudentStrength.feature",
				    "ReportsFeature/SelfTransportReport.feature",
				    "ReportsFeature/PrintTransportIDCard.feature",
				    "ReportsFeature/PaidTransport.feature",
				    "ReportsFeature/ReceiptWiseDailyCollection.feature",
				    "ReportsFeature/ReceiptWiseFeeTypeCollection.feature",
				    "ReportsFeature/SMSReport.feature",
				    "ReportsFeature/StaffWardListReport.feature",
				    "ReportsFeature/StudentHealthEntryReport.feature",
				    "ReportsFeature/StudentHouseWiseReport.feature",
				    "ReportsFeature/StudentLedgerClassWise.feature",
				    "ReportsFeature/StudentRegisterDateWiseReport.feature",
				    "ReportsFeature/StudentStrengthRatioWiseReport.feature",
				    "ReportsFeature/StudentWiseCollectionReport.feature",
				    "ReportsFeature/StudentWiseReceiptReport.feature",
				    "ReportsFeature/SurnameWiseStudentDetails.feature",
				    "ReportsFeature/TCReport.feature",
				    "ReportsFeature/TotalCollectionReport.feature",
				    "ReportsFeature/TransportDetail.feature",
				    "ReportsFeature/TransportReportClassWise.feature",
				    "ReportsFeature/TransportStudentStrengthReport.feature",
				    "ReportsFeature/YearlyCollectionReport.feature",
				    "ReportsFeature/StudentDetails.feature"
		}
		,glue= {"step_Def"}
		,monochrome=true
	    ,plugin= {"pretty","html:target/cucumber_html_report",
	    		  "json:target/cucumber.json",
	    	      "junit:target/cucumber.xml"}	
	)	
public class ReportsRunner {

}
