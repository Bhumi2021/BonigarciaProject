package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends  BasePage {
    LoadProperty loadProperty=new LoadProperty();
    //declare variable
    String browserName=loadProperty.getProperty("browserName");
    public void openBrowser(){
        //Using switch
        switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "fireFox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("in correct browser name of empty"+browserName);
        }

    }

}
