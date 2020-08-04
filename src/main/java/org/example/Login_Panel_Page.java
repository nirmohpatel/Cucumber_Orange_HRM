package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Login_Panel_Page extends Util
{   Load_Prop load_prop = new Load_Prop();
    private String expectedURL = "https://opensource-demo.orangehrmlive.com/";
    private String actualURL = driver.getCurrentUrl();

    private By _userName = By.xpath("//input[@id=\"txtUsername\"]");
    private By _password = By. xpath("//input[@id=\"txtPassword\"]");
    private By _actualUserNameCanNotEmptyMassage = By.xpath("//span[text()=\"Username cannot be empty\"]");
    private By _actualPasswordCanNotEmptyMassage = By.xpath("//span[text()=\"Password cannot be empty\"]");
    private By _actualInvalidCredentialsMassage =By.xpath("//span[text()=\"Invalid credentials\"]");
    private By _loginButton = By. xpath("//input[@value=\"LOGIN\"]");
    private By _expectedErrorMassage = By.xpath("//span[@id=\"spanMessage\"]");




    public void toVerifyUserIsOnLoginPage()
    {
        Assert.assertEquals(actualURL,expectedURL);
    }
    public void userEnterValidCredentials()
    {
        typeText(_userName,load_prop.getProperty("UserName"));
        typeText(_password,load_prop.getProperty("Password"));
        clickOnElement(_loginButton);
    }
    public void enterUserName(String UserName)
    {
        typeText(_userName,UserName);
    }
    public void enterPassword(String Password)
    {
        typeText(_password,Password);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(_loginButton);
    }



    public void emptyUserNameAndPasswordErrorMassage(String receiveMassage)
    {
        Assert.assertEquals(getTextFromElement(_expectedErrorMassage),receiveMassage);

    }


}
