import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
   static WebDriver driver;
    public static void openBrowser(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static void closeBrowser() {
        driver.quit();
    }
    public static void clickOnHomePage(WebElement homePageElement){
        homePageElement.click();
//        WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(5));
//        driverWait.until(ExpectedConditions.titleIs("Locators and Selenium Interactions"));
        driver.navigate().back();
        closeBrowser();

    }
    public static void getPositionOfButton(WebElement getPositionElement){
        Point p =getPositionElement.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());
        closeBrowser();

    }
    public static void getColorOfButton(WebElement getColorOfButtonElement){
       String colorOfButton= getColorOfButtonElement.getCssValue("background-color");
        System.out.println(colorOfButton);
        closeBrowser();

    }public static void getSizeOfButton(WebElement sizeOfButtonElement){
        Dimension dimension = sizeOfButtonElement.getSize();
        System.out.println("Height  : "+dimension.getHeight());
        System.out.println("width : "+dimension.getWidth());
        closeBrowser();
    }


    public static void main(String[] args) {
        openBrowser("http://testleaf.herokuapp.com/pages/Button.html");
        clickOnHomePage(driver.findElement(By.id("home")));
        openBrowser("http://testleaf.herokuapp.com/pages/Button.html");
        getPositionOfButton(driver.findElement(By.id("position")));
        openBrowser("http://testleaf.herokuapp.com/pages/Button.html");
        getColorOfButton(driver.findElement(By.id("color")));
        openBrowser("http://testleaf.herokuapp.com/pages/Button.html");
        getSizeOfButton(driver.findElement(By.id("size")));


    }

}
