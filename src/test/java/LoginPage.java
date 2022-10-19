import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
    private String username;
    private String password;

    public static void main(String[] args) throws InterruptedException {
//        @Test
//        public static void test()
//        {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
        By byusername = (By.xpath("//div[@class='oxd-form-row'][1]//input"));
        By bypassword = (By.xpath("//div[@class='oxd-form-row'][2]//input"));

        WebElement username = driver.findElement(byusername);
        WebElement password = driver.findElement(bypassword);

//        LoginPage lp = new LoginPage();
//        lp.loginPageTest(username.sendKeys("Admin"), password.sendKeys("admin123"));

//        username.sendKeys("Admin");
//        password.sendKeys("admin123");

    }
    public void loginPageTest(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

}
