package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Home_Page extends Util
{

    private String expectedLoginMassage= "Welcome Admin";
    private By _welComeAdminMassage = By. xpath("//a[text()=\"Welcome Admin\"]");

    public void toVerifyUserIsLoginSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_welComeAdminMassage),expectedLoginMassage);
    }

}
