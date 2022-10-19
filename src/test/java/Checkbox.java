import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
        WebElement checkbox1 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[2]"));
        checkbox1.click();
        WebElement checkbox11 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[4]"));
        checkbox11.click();

        System.out.println(checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.xpath("//section[@class='innerblock']/div[2]//input"));
        System.out.println(checkbox2.isSelected());

        List<WebElement> scb = driver.findElements(By.xpath("//section[@class='innerblock']/div[3]//input"));
        for(WebElement element :scb)
        {
            if(element.isSelected())
                element.click();
        }

        for(int i =1;i<=6;i++) {
            driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[" + i + "]")).click();
            Thread.sleep(2000);
        }
        driver.quit();

    }
}
