package StepdefinationPackage;

import PageObjectPackage.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SepDefAcc {
    LoginPage loginPage=new LoginPage();
    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    loginPage.baseurl();
    }

    @When("^User go to login page and click on new registration$")
    public void user_go_to_login_page_and_click_on_new_registration() throws Throwable {
    loginPage.Login();
    }

    @Then("^User can fill all his detail$")
    public void user_can_fill_all_his_detail() throws Throwable {

    }

    @Then("^User able to registar himself\\.$")
    public void user_able_to_registar_himself() throws Throwable {

    }

}
