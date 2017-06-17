package verifyPageRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"FeatureVerifyPage/VerifySaveView.feature"}
        ,glue= {"stepDefs"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        ,tags= {"@scenario97"}
)
public class VerifySaveViewRunner {
}
