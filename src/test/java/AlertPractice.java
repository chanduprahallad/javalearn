import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
    static WebDriver driver;
    public static void openBrowser(String Url){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(Url);
    }
    public static  void closeBrowser(){
        driver.quit();
    }
    public static void clickOnTheButtonToDisplayAlert(WebElement displayAlertElement) throws InterruptedException {
         if(displayAlertElement!=null){
             displayAlertElement.click();
             Alert alertBox = driver.switchTo().alert();
             alertBox.accept();
             Thread.sleep(2000);
         }
         closeBrowser();
    }
    public static void clickOnTheConfirmBox(WebElement confirmBoxElement) throws InterruptedException {
        if(confirmBoxElement!=null){
            confirmBoxElement.click();
            Alert confirmAlert = driver.switchTo().alert();
            confirmAlert.accept();
            Thread.sleep(2000);
        }
        closeBrowser();

    }
    private static void clickOnThePromptBox(WebElement promptBoxElement) throws InterruptedException {
        if(promptBoxElement!=null){
            promptBoxElement.click();
            Alert promptBoxAlert = driver.switchTo().alert();
            promptBoxAlert.sendKeys("selenium");
            Thread.sleep(2000);
            promptBoxAlert.accept();
            Thread.sleep(2000);
        }
        closeBrowser();
    }
    private static void clickOnTheButtonToFindLineBreaks(WebElement LineBreakElement) {
        if(LineBreakElement!=null){
            LineBreakElement.click();
            Alert LineBreakAlert = driver.switchTo().alert();
            String lineBreakString=LineBreakAlert.getText();
            System.out.println(lineBreakString.contains("\n"));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        openBrowser("http://testleaf.herokuapp.com/pages/Alert.html");
        clickOnTheButtonToDisplayAlert(driver.findElement(By.xpath("//label[contains(.,'Click the button to display a alert box.')]/following-sibling::button")));
        openBrowser("http://testleaf.herokuapp.com/pages/Alert.html");
        clickOnTheConfirmBox(driver.findElement(By.xpath("//label[contains(.,'Click the button to display a confirm box.')]/following-sibling::button")));
        openBrowser("http://testleaf.herokuapp.com/pages/Alert.html");
        clickOnThePromptBox(driver.findElement(By.xpath("//label[contains(.,'Click the button to display a prompt box.')]/following-sibling::button")));
        openBrowser("http://testleaf.herokuapp.com/pages/Alert.html");
        clickOnTheButtonToFindLineBreaks(driver.findElement(By.xpath("//label[contains(.,'Click the button to learn line-breaks in an alert.')]/following-sibling::button")));
    }




}
