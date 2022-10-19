import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckboxWithArrayList {
    static WebDriver driver;
    static String Url = "http://testleaf.herokuapp.com/pages/checkbox.html";
    public static void openUrl(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static  void closeBrowser(){
        driver.quit();
    }
    public static  void selectingKnownLanguages(){
        openUrl(Url);
        List<WebElement> webElementArrayList = new ArrayList<>(10);
        for(int i=1;i<=5;i++) {
            By by = By.xpath("//label[contains(text(),'Select the languages that you know?')]/following-sibling::input[" + i + "]");
            List<WebElement> webElementList = driver.findElements(by);
            for(WebElement we:webElementList) {
                if (i == 2)
                    continue;
                we.click();
            }
        }
        closeBrowser();
    }

    public static void main(String[] args) {
     selectingKnownLanguages();
    }
}
