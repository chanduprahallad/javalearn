import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {
    static WebDriver driver;
    public static void openBrowser(String Url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static void clickOnTheFirstFrame(WebElement firstFrameElement){
        WebDriver firstFrame = driver.switchTo().frame(1);
        firstFrame.switchTo().frame(1);
        firstFrameElement.click();
        driver.navigate().back();

    }

    public static void main(String[] args) {
        openBrowser("http://testleaf.herokuapp.com/pages/frame.html");
        clickOnTheFirstFrame(driver.findElement(By.xpath("//button[@id='Click']")));

    }
}
