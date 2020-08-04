package org.example;

import org.openqa.selenium.By;


public class Util extends Base_Page
{

    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // click able method for clicking action

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    // By using inBuild return type method, store text value in String

    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    // type text method for enter text


}
