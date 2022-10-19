import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class HyperLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://platform.boomi.com/AtomSphere.html#build;accountId=trainingcharanjetty-C793KC;components=d93298e2-d1e6-4fa9-8806-b3498be33a74,c7750076-82fa-4c35-b584-528886756523,058c6085-b6e1-4e24-8073-1025c971b4cb,074cbbd4-3c5c-4204-b733-a6c603f025b7,1b187ea0-11f2-412a-8247-bc8725135c4a,19ca9a39-9056-4109-afb4-8466b91a7d41,c8bb9661-3fbf-4b0a-bad4-2613721df455,a7a92d3d-7a42-4430-9138-5ed1e6af6b1a,4ae76132-a845-47c7-b88d-138f42a70883,64fb056f-5b52-4211-b7c8-e56bd41895b4,f56c0606-eea5-4734-b94f-ce8b55afd90d,499d2a22-2435-4700-925f-6a16ceb0f811,248c06bc-6140-4a4e-9e87-95a7211db06e,961c9d2c-11a3-4c93-b94e-71dc7a582930,49a9ebc3-8da5-4ff6-8c6b-f6c234cdc2e1,e9035391-79ed-4f35-9b0d-2fbfed4fd535,b2963629-80f6-4b02-bf3c-865848a89de3,89aec27e-61e6-4821-91ab-ddb868d89e13,d62f6fd5-bfb1-48c8-afea-248a05275896;componentIdOnFocus=49a9ebc3-8da5-4ff6-8c6b-f6c234cdc2e1");
//        driver.navigate().to("https://platform.boomi.com/AtomSphere.html#build;accountId=trainingcharanjetty-C793KC;components=d93298e2-d1e6-4fa9-8806-b3498be33a74,c7750076-82fa-4c35-b584-528886756523,058c6085-b6e1-4e24-8073-1025c971b4cb,074cbbd4-3c5c-4204-b733-a6c603f025b7,1b187ea0-11f2-412a-8247-bc8725135c4a,19ca9a39-9056-4109-afb4-8466b91a7d41,c8bb9661-3fbf-4b0a-bad4-2613721df455,a7a92d3d-7a42-4430-9138-5ed1e6af6b1a,4ae76132-a845-47c7-b88d-138f42a70883,64fb056f-5b52-4211-b7c8-e56bd41895b4,f56c0606-eea5-4734-b94f-ce8b55afd90d,499d2a22-2435-4700-925f-6a16ceb0f811,248c06bc-6140-4a4e-9e87-95a7211db06e,961c9d2c-11a3-4c93-b94e-71dc7a582930,49a9ebc3-8da5-4ff6-8c6b-f6c234cdc2e1,e9035391-79ed-4f35-9b0d-2fbfed4fd535,b2963629-80f6-4b02-bf3c-865848a89de3,89aec27e-61e6-4821-91ab-ddb868d89e13,d62f6fd5-bfb1-48c8-afea-248a05275896;componentIdOnFocus=49a9ebc3-8da5-4ff6-8c6b-f6c234cdc2e1");
        driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
        driver.findElement(By.linkText("Go to Home Page")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement link2 = driver.findElement(By.partialLinkText("without"));
       // link2.click();
        String s1 = (link2.getAttribute("href"));
        System.out.println(s1);
        Thread.sleep(3000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("No of links in the  page : "+allLinks.size());
//        driver.findElement(By.xpath(""));
        WebElement checkLink = driver.findElement(By.partialLinkText("broken"));
        String brokenLink = checkLink.getAttribute("href");
        try {
            URL url = new URL(brokenLink);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(4000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode() == 200)
            {
                System.out.println(brokenLink +" :"+ httpURLConnection.getResponseCode());
            }
            else{
                System.out.println(brokenLink +": "+ httpURLConnection.getResponseCode());
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
