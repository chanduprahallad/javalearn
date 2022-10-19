import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditboxEX {
        public static void main(String[] args) throws InterruptedException {

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
                WebElement commonElement = driver.findElement(By.xpath("//section[@class='innerblock']/div[2]//input"));
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandu.kamini89@gmail.com");
                commonElement.sendKeys("chandu");
                Thread.sleep(5000);
                commonElement.clear();
                commonElement.sendKeys("chandu");
                String getvalue = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
                System.out.println(getvalue);
                driver.findElement(By.xpath("//div[@id='contentblock']//div[4]//input")).clear();
                boolean getboolean = driver.findElement(By.xpath("//div[@id='contentblock']//div[5]//input")).isEnabled();
                System.out.println(getboolean);
                driver.quit();

//                driver.findElement()
        }
}
