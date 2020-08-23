package StepdefinationPackage;

import PageObjectPackage.InsurancePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefInsurance {
InsurancePage insurancePage=new InsurancePage();
    @When("^User navigate to personal insurance page$")
    public void user_navigate_to_personal_insurance_page() throws Throwable {
    insurancePage.products();
    }

    @Then("^U should find and select the right insurance$")
    public void u_should_find_and_select_the_right_insurance() throws Throwable {

    }
}
