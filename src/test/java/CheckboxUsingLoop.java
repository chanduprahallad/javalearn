import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxUsingLoop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
        for (int i = 1; i <= 4; i++) {
            int len = driver.findElements(By.xpath("//section[@class='innerblock']/div[" + i + "]/input")).size();
            for (int j = 1; j < len; j++) {
                driver.findElement(By.xpath("//section[@class='innerblock']/div[" + i + "]/input[" + j + "]"));
//                checkingButton(wel);
            }

        }
    }

}
