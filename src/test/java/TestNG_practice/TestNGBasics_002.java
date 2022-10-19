package TestNG_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics_002 {


    public void chromeSetUp(String chromeUrl){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(chromeUrl);
    }

    public void firefoxSetUp(String firefoxUrl){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get(firefoxUrl);
    }

    @Parameters("url")
    @Test
    public void signUp(String Url){
        chromeSetUp(Url);
        System.out.println("signup to the application");
    }
    @Parameters("url")
    @Test
    public void login(String Url){
        firefoxSetUp(Url);
        System.out.println("login to the application");
    }
    @Ignore
    @Test
    public void searchItem(){
        System.out.println("search items required");
    }

    @Test
    public void addItemsToTheCart(){
        System.out.println("add items to cart");
    }
    @Test
    public void purchaseItems(){

        System.out.println("Purchase required Items");
    }
    @Test
    public void logOut(){
        System.out.println("logout of the application");
    }
}

