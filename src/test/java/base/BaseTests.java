package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        goHome();

        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){driver.get("https://demoqa.com/");}

    @AfterClass
    public void tearDown(){driver.quit();}

}
