import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPractice {
    static WebDriver driver;
    static String url = "http://testleaf.herokuapp.com/pages/Dropdown.html";
    public static void openUrl(String Url){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(Url);
    }
    public static void closeBrowser() {
        driver.quit();
    }
    public static void selectByIndex(WebElement selectByIndexElement,int index){
//        openUrl(url);
        Select select = new Select(selectByIndexElement);
        select.selectByIndex(index);
        closeBrowser();

    }
    public static void selectByVisibleText(WebElement selectByVisibleTextElement,String element){
//        openUrl(url);
        Select select1 = new Select(selectByVisibleTextElement);
        select1.selectByVisibleText(element);
        closeBrowser();

    }
    public static void selectByValue(WebElement selectByValueElement,String value){
        Select selectValueElement = new Select(selectByValueElement);
        selectValueElement.selectByValue(value);
        closeBrowser();
    }
    public static void getNumberOfOptionsInDropdown(WebElement element){
        Select select3 = new Select(element);
        List<WebElement> webElementList = select3.getOptions();
        for(WebElement singleElement :webElementList)
        {
            System.out.println(singleElement.getText());
        }
        System.out.println(webElementList.size());
        closeBrowser();

    }
    public static void selectOptionByUsingSendKeys(WebElement element,String optionTobeSelected){
      element.sendKeys(optionTobeSelected);
        closeBrowser();
    }


    public static void main(String[] args) throws InterruptedException {
        openUrl(url);
        selectByIndex(driver.findElement(By.id("dropdown1")),2);
        openUrl(url);
        selectByVisibleText(driver.findElement(By.cssSelector("select[name='dropdown2']")),"Appium");
        openUrl(url);
        selectByValue(driver.findElement(By.cssSelector("#dropdown3")),"3");
        openUrl(url);
        getNumberOfOptionsInDropdown(driver.findElement(By.xpath("//select[@class='dropdown']")));
        openUrl(url);
        selectOptionByUsingSendKeys(driver.findElement(By.xpath("//*[@class='innerblock']/div[5]//select")),"Selenium");
        Thread.sleep(1000);
    }
}
