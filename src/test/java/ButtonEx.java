import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEx {
    public static  void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Button.html");
        Point position = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
        System.out.println("X :" +position.getX() + "Y : "+ position.getY());
        String color = driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getCssValue("background-color");
        System.out.println(color);
        Dimension dimen = driver.findElement(By.xpath("//button[@id='size']")).getSize();
        System.out.println("Height : "+dimen.getHeight() +" ," +"Width : "+ dimen.getWidth());
        driver.findElement(By.xpath("//button[@id='home']")).click();
        Thread.sleep(5000);
        driver.quit();



    }
}
