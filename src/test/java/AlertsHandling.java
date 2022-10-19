import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Alert.html");



        By byalert = By.xpath("//*[contains(text(),'button to display a alert box')]/following-sibling::button");
        By byconfirm = By.xpath("//*[contains(text(),'button to display a confirm box')]/following-sibling::button");
        By byprompt = By.xpath("//*[contains(text(),'button to display a prompt box')]/following-sibling::button");
        By bylinebreaks = By.xpath("//*[contains(text(),'button to learn line-breaks in an alert')]/following-sibling::button");


        WebElement alertbox = driver.findElement(byalert);
        alertbox.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
//        driver.quit();

        WebElement confirmbox = driver.findElement(byconfirm);
        confirmbox.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.dismiss();
        Thread.sleep(5000);
//        driver.quit();

        WebElement promptbox = driver.findElement(byprompt);
        promptbox.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("selenium-java");
        alert2.accept();
        Thread.sleep(5000);
//        driver.quit();

        WebElement linebreaks = driver.findElement(bylinebreaks);
        linebreaks.click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        String str = alert3.getText();
        System.out.println(str.contains("\n"));
        System.out.println(str);
        Thread.sleep(2000);
        alert3.dismiss();
        driver.quit();
    }
}
