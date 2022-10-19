import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FrameDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/frame.html");

        driver.switchTo().frame(0);
        By bybutton = (By.xpath("//button[@id='Click']"));
        WebElement firstbutton = driver.findElement(bybutton);
        firstbutton.click();
        Thread.sleep(2000);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        By bybutton1 = (By.xpath("//button[@id='Click1']"));
        WebElement secondbutton = driver.findElement(bybutton1);
        secondbutton.click();
        Thread.sleep(2000);





//        driver.switchTo().frame("Find total number of frames.");
        List<WebElement> framelist = driver.findElements(By.tagName("iframe"));
        System.out.println(framelist.size());
        Thread.sleep(2000);


        driver.quit();

    }
}
