import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
    static  WebDriver driver;
    static String Url = "http://testleaf.herokuapp.com/pages/checkbox.html";
    public static void openUrl(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static  void closeBrowser(){
        driver.quit();
    }
    public static  void selectingKnownLanguages(){
        openUrl(Url);
        for(int i=1;i<=5;i++) { //java : 0, xpath: 1
            By by = By.xpath(
                    "//label[contains(.,'languages')]/following-sibling::input[" + i + "]");
            WebElement elements = driver.findElement(by);
            if(i==2||i==5)
                continue;
            elements.click();
        }
        closeBrowser();
    }
    public static boolean isSeleniumCheckBoxChecked(){
        openUrl(Url);
        By by = By.xpath("//label[contains(text(),'Confirm Selenium is checked')]/following-sibling::input");
        WebElement seleniumCheckBoxElement= driver.findElement(by);
        //System.out.println(seleniumCheckBoxElement.isSelected());
        boolean b =seleniumCheckBoxElement.isSelected();
        closeBrowser();
        return b;
    }
    public static boolean deSelectingTheSelectedCheckBox(){
        openUrl(Url);
        for(int i=1;i<3;i++){
            By by = By.xpath("//label[contains(text(),'DeSelect only checked')]/following-sibling::input["+i+"]");
            WebElement toDeselectCheckBoxElements = driver.findElement(by);
            if(toDeselectCheckBoxElements.isSelected()){
               toDeselectCheckBoxElements.click();
                System.out.println(toDeselectCheckBoxElements.isSelected());
                closeBrowser();
                return true;
            }
        }
        return false;
    }
    public static void selectingAllOptions() throws InterruptedException {
        openUrl(Url);
        for(int i=1;i<=6;i++) {
            By by = By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[" + i + "]");
            WebElement selectingOptionsElements = driver.findElement(by);
            selectingOptionsElements.click();
            System.out.println("Did Option  [" + i + "] got selected : " + selectingOptionsElements.isSelected());
        }
        closeBrowser();
    }
   public static void main(String[] args) throws InterruptedException {
//        openUrl("http://testleaf.herokuapp.com/pages/checkbox.html");
        selectingKnownLanguages();
        isSeleniumCheckBoxChecked();
        deSelectingTheSelectedCheckBox();
        selectingAllOptions();
//        Thread.sleep(1000);
//        driver.quit();

    }
}
