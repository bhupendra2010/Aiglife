import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\bhupe\\AIGLIFE.co.uk\\src\\test\\Resources\\insurance.feature",
        plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber-json-report.json",
        "junit:target/cucumber-xml-report.xml",
        "pretty:target/cucumber-pretty-report.txt"})

public class Runner {
}
