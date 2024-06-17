package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTemplate {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "webdriver\\geckodriver.exe";
    public WebDriver driver;

    @Test
    public void verifyHomepageTitle(){
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle;

        System.setProperty("webdriver.gecko.driver",driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
