package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class My_Step_Defs
{

    Login_Panel_Page login_panel_page = new Login_Panel_Page();
    Home_Page home_page = new Home_Page();



    @Given("^user is on login page$")
    public void user_is_on_login_page()
    {
        login_panel_page.toVerifyUserIsOnLoginPage();
    }

    @When("^User enter enter valid credentials$")
    public void userEnterUserEnterValidCredentials()
    {
        login_panel_page.userEnterValidCredentials();
    }

    @Then("^User should be Login successfully$")
    public void user_should_be_Login_successfully()
    {
        home_page.toVerifyUserIsLoginSuccessfully();
    }


    @Given("^User is on Login Page$")

    public void userIsOnLoginPage()
    {
            login_panel_page.toVerifyUserIsOnLoginPage();
    }


    @Then("^Use should not be able to login successfully with \"([^\"]*)\"$")

    public void useShouldNotBeAbleToLoginSuccessfullyWith(String receiveMassage)
    {
        login_panel_page.emptyUserNameAndPasswordErrorMassage(receiveMassage);

    }

    @And("^User click on login Button$")
    public void userClickOnLoginButton()
    {
        login_panel_page.clickOnLoginButton();
    }

    @When("^User enter invalid userName \"([^\"]*)\"$")
    public void userEnterInvalidUserName(String UserName)
    {
            login_panel_page.enterUserName(UserName);
    }

    @And("^User enter invalid password \"([^\"]*)\"$")
    public void userEnterInvalidPassword(String Password)
    {
       login_panel_page.enterPassword(Password);
    }
}
