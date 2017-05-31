package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"Feature/DailyFeeCollectionDateWise.feature",
		           "Feature/DailyFeeCollectionAccountWise.feature",
		           "Feature/DailyFeeCollection.feature",
		           "Feature/DailyFeeCollectionDateFeeGroupWise.feature",
		           "Feature/EstimatedCollectionReport.feature",
		           "Feature/DayWiseTotalCollection.feature",
		           "Feature/FeeHeadWiseCollectionClassRange.feature",
		           "Feature/ReceiptWiseDailyCollection.feature",
		           "Feature/ReceiptWiseFeeTypeCollection.feature",
		           "Feature/MonthWiseCollectionReport.feature",
		           "Feature/MonthlyConsolidatedReport.feature",
		           "Feature/StudentWiseCollectionReport.feature",
		           "Feature/TotalCollectionReport.feature",
		           "Feature/FeeCollectionWithEntryTimeConcession.feature",
		           "Feature/AdvancePaymentReport.feature",
		           "Feature/FeeDefaulterReportWithReceiving.feature",
		           "Feature/FeeDefaulterInstallmentWise.feature",
		           "Feature/FeeDefaulterList.feature",
		           "Feature/FeeDefaulterReportConsolidated.feature",
		           "Feature/FeesDefaulterSlip.feature",
		           "Feature/DefaulterListFeeTypeWise.feature"
		}
		,glue= {"step_Def"}
		,monochrome=true
	    ,plugin= {"pretty","html:target/cucumber_html_report",
	    		  "json:target/cucumber.json",
	    	      "junit:target/cucumber.xml"}		
		//,tags= {"@scenario25"}
	)
public class TransactionReportsRunner {

}
