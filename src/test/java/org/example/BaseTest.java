package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {
    BrowserSelector browserSelector=new BrowserSelector();


    @BeforeMethod
    public void openBrowser() {
        //open the browser
        browserSelector.openBrowser();
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void closeBrowser() {
        //close browser
        driver.close();
    }
}

