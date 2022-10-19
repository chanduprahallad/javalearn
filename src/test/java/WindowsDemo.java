import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Window.html");
//        driver.get("http://testleaf.herokuapp.com/home.html");

        String parentwindow= driver.getWindowHandle();
        System.out.println("Address of parent window:" +parentwindow);

        By byhome = (By.xpath("//button[@id='home']"));
        By bymultiplebtn = By.xpath("//*[text()='Open Multiple Windows']");
        By bywaitbtn = By.xpath(("//button[@style='background-color:lightblue']"));




        WebElement homepage = driver.findElement(byhome);
        homepage.click();
//        Thread.sleep(2000);
        Set<String> windows = driver.getWindowHandles();
        for(String childwindow : windows) {
            if (!childwindow.equalsIgnoreCase(parentwindow)) {
                driver.switchTo().window(childwindow);
            }
        }
        By bymulitplewindow = (By.xpath("//*[@class='wp-categories-list']/li[2]"));
        WebElement multiplewindow = driver.findElement(bymulitplewindow);
        multiplewindow.click();
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(parentwindow);
        Thread.sleep(2000);
//        driver.quit();

        WebElement multiplebtn = driver.findElement(bymultiplebtn);
        multiplebtn.click();
        Set<String> secondWindow = driver.getWindowHandles();
        System.out.println(secondWindow.size());
//        Thread.sleep(5000);

        for(String cwindow:secondWindow)
        {
            if(!cwindow.equalsIgnoreCase(parentwindow))
            {
                driver.switchTo().window(cwindow);
                driver.close();
            }
        }
//        Thread.sleep(5000);

        WebElement waitbtn = driver.findElement(bywaitbtn);
        waitbtn.click();
        Thread.sleep(5000);
        Set<String> thirdWindow = driver.getWindowHandles();
        for(String cdwindows:thirdWindow){
            if(!cdwindows.equalsIgnoreCase(parentwindow))
            {
                driver.switchTo().window(cdwindows);
//                Thread.sleep(5000);
//                driver.close();
            }
        }
//        Thread.sleep(5000);
        driver.quit();
    }
}
