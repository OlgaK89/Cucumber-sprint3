package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmplAndIncPage;
import pages.LoginPage;
import utilities.PropertyReader;

public class Login {

    @When("I insert login information")
    public void i_insert_login_information() {


        LoginPage loginPage = new LoginPage();
        loginPage.loginName.sendKeys(PropertyReader.getProperty("email"));;
        loginPage.loginPass.sendKeys(PropertyReader.getProperty("pass"));
        loginPage.loginButton.click();



    }
    @Then("I should move to next page")
    public void i_should_move_to_next_page() {

        EmplAndIncPage emplAndIncPage = new EmplAndIncPage();
        emplAndIncPage.DuoBankPage.isDisplayed();

    }
}
