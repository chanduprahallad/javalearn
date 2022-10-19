package TestNG_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGBasics001 {
    WebDriver driver;
    @BeforeClass
    public void openingBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://sso.teachable.com/secure/9521/identity/sign_up/email");
    }
    @Test
    public void enteringUserDetails(){
        By by = By.id("user_name");
        WebElement userNameElement =driver.findElement(by);
        userNameElement.sendKeys("rahulshettyacademy");
    }
    @Test
    public void enterPassword(){
        By by = By.id("password");
        WebElement passwordElement = driver.findElement(by);
        passwordElement.sendKeys("chandu");
    }
    @AfterClass
    public void quitBrowser(){
        driver.quit();
    }
    @AfterMethod
    public void makeMethodWait() throws InterruptedException {
        Thread.sleep(1000);
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite got execeuted");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite got execeuted");
    }
//    @BeforeClass
//    public void openingPageTitle(){
//        By by = By.cssSelector("body main div h3");
//        WebElement signUpElement = driver.findElement(by);
//        String signUpString = "Sign Up";
//        Assert.
//    }
}
