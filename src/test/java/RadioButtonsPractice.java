import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsPractice {
   static WebDriver driver;
    static String url = "http://testleaf.herokuapp.com/pages/radio.html";
    public static void openUrl(String Url){
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
        driver.get(Url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static void areTheClassesEnjoyable(WebElement yesRadioBtnElement ){
//        openUrl(url);
     yesRadioBtnElement.click();
     closeBrowser();
    }
    public static boolean defaultRadioButton(WebElement defaultElement){
//        openUrl(url);
        boolean isSelected =(defaultElement.isSelected());
        System.out.println(isSelected);
        closeBrowser();
        return isSelected;
    }
    public static void selectAgeGroup(WebElement ageGroupElement){
//        openUrl(url);
        if(ageGroupElement.isSelected())
            System.out.println("age group is already selected");
        closeBrowser();

    }

    public static void main(String[] args) {
        openUrl(url);
        areTheClassesEnjoyable(driver.findElement(By.id("yes")));
        openUrl(url);
        defaultRadioButton(driver.findElement(By.xpath("//label[contains(text(),'Find default selected radio button')]/following-sibling::input[2]")));
        openUrl(url);
        selectAgeGroup(driver.findElement(By.xpath("//div[@class='row']/div/input[2]")));
    }
}
