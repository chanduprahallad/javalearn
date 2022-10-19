import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class LinkTextPractice {
    static WebDriver driver;
    public static void openBrowser(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static void clickOnHomePageLink(WebElement clickOnHomePageElement){
        if(clickOnHomePageElement.isEnabled())
            clickOnHomePageElement.click();
        driver.navigate().back();
        closeBrowser();

    }
    public static void findDestinationOfLinkWithoutClicking(WebElement destinationOfLinkElement){

        String hrefValue = destinationOfLinkElement.getAttribute("href");
        System.out.println(hrefValue);
        closeBrowser();

    }
    public static void isLinkBroken(WebElement isLinkBrokenElement)  {
        String brokenLink = isLinkBrokenElement.getAttribute("href");
        try {
            URL url = new URL(brokenLink);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode()==200)
                System.out.println(brokenLink +" : "+httpURLConnection.getResponseCode());
            else
                System.out.println(brokenLink +" : "+httpURLConnection.getResponseCode());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        closeBrowser();

    }
    public static void findingNumberOfLinksInThePage(){
        List<WebElement> webElementList = driver.findElements(By.tagName("a"));
        System.out.println(webElementList.size());
        closeBrowser();

    }
    public static void clickOnHomePageSecondLink(WebElement secondHomePageLinkElement){
        secondHomePageLinkElement.click();
        closeBrowser();
    }

    public static void main(String[] args) {
        openBrowser("http://testleaf.herokuapp.com/pages/Link.html");
        clickOnHomePageLink(driver.findElement(By.linkText("Go to Home Page")));
        openBrowser("http://testleaf.herokuapp.com/pages/Link.html");
        findDestinationOfLinkWithoutClicking(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")));
        openBrowser("http://testleaf.herokuapp.com/pages/Link.html");
        isLinkBroken(driver.findElement(By.partialLinkText(" broken?")));
        openBrowser("http://testleaf.herokuapp.com/pages/Link.html");
        findingNumberOfLinksInThePage();
        openBrowser("http://testleaf.herokuapp.com/pages/Link.html");
        clickOnHomePageSecondLink(driver.findElement(By.xpath("//div[4]//div[1]//div[1]//a[1]")));

    }
}
