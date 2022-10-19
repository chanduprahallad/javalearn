import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
        WebElement box1 = driver.findElement(By.id("dropdown1"));
//        box1.click();
        Select sItem = new Select(box1);
        sItem.selectByIndex(2);

        WebElement box2 = driver.findElement(By.name("dropdown2"));
//        box2.click();
        Select sItem2 = new Select(box2);
        sItem2.selectByVisibleText("Selenium");
//        System.out.println(box2.getText());
        WebElement box3 = driver.findElement(By.id("dropdown3"));
        Select sItem3 = new Select(box3);
        sItem3.selectByValue("3");
        driver.findElement(By.xpath("//*[@class='innerblock']/div[5]//select")).sendKeys("Loadrunner");
        Thread.sleep(3000);
        WebElement box5 = driver.findElement(By.xpath("//*[@class='innerblock']/div[6]//select"));
        Select sItem4 = new Select(box5);
        sItem4.selectByIndex(0);
        sItem4.selectByIndex(1);
        sItem4.selectByIndex(2);
        sItem4.selectByIndex(3);
        Thread.sleep(2000);
        WebElement box6 = driver.findElement((By.xpath("//*[@class='innerblock']/div[4]//select")));
        Select sItem5 = new Select(box6);
        List<WebElement> listed = sItem5.getOptions();
        System.out.println(listed.size());
        Thread.sleep(2000);


        driver.quit();
    }
}
