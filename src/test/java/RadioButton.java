import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/radio.html");
        WebElement below20rb = driver.findElement(By.xpath("//input[@name='age'][1]"));
        WebElement below40rb = driver.findElement(By.xpath("//input[@name='age'][2]"));
        WebElement below60rb = driver.findElement(By.xpath("//input[@name='age'][3]"));
        int age = 20;
        if (age <= 20) {
            System.out.println("unchecked radio button :" + below20rb.isSelected());
            below20rb.click();
            System.out.println("checked radio button :" + below20rb.isSelected());
        } else if (age <= 40) {
            System.out.println("unchecked radio button :" + below40rb.isSelected());
            below40rb.click();
            System.out.println("checked radio button :" + below40rb.isSelected());
        } else {
            System.out.println("unchecked radio button :" + below60rb.isSelected());
            below60rb.click();
            System.out.println("checked radio button :" + below60rb.isSelected());
        }
        WebElement defaultButton = driver.findElement(By.xpath("//input[@name='news'][1]"));
        WebElement defaultButton1 = driver.findElement(By.xpath("//input[@name='news'][2]"));
        System.out.println("unchecked radio button :" + defaultButton.isSelected());
        defaultButton.click();
        System.out.println("checked radio button :" + defaultButton.isSelected());
        Thread.sleep(2000);
        driver.quit();
    }

}
