import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ImagesPractice {
    static WebDriver driver;
    public static void openBrowser(String Url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static void clickOnTheImageToNavigateToHomePage(WebElement homePageImageElement){
            homePageImageElement.click();
            driver.navigate().back();
            driver.close();
    }
    public static void isImageBroken(WebElement isImageBrokenElement){
        String imgString = isImageBrokenElement.getAttribute("src");
        try {
            URL url = new URL(imgString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode()==200)
                System.out.println( httpURLConnection.getResponseCode());
            else
                System.out.println( httpURLConnection.getResponseCode());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        closeBrowser();


    }
    public static void clickUsingMouseOrKeyboard(WebElement keyboardOrMouseElement){
        keyboardOrMouseElement.click();
        closeBrowser();

    }

    public static void main(String[] args) {
        openBrowser("http://testleaf.herokuapp.com/pages/Image.html");
        clickOnTheImageToNavigateToHomePage(driver.findElement(By.xpath("//label[contains(.,'Click on this image to go home page')]/following-sibling::img")));
        openBrowser("http://testleaf.herokuapp.com/pages/Image.html");
        isImageBroken(driver.findElement(By.xpath("//label[contains(.,'Image?')]/following-sibling::img")));
        openBrowser("http://testleaf.herokuapp.com/pages/Image.html");
        clickUsingMouseOrKeyboard(driver.findElement(By.xpath("//label[contains(.,'Keyboard or Mouse')]/following-sibling::img")));
    }
}
