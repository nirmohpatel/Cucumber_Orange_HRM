package org.example;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util
{
    Browser_Manager browser_manager = new Browser_Manager();

    @Before
    public void openBrowser()
    {
        browser_manager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        browser_manager.closeBrowser();
    }

}
