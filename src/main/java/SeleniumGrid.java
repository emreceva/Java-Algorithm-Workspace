import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGrid {
    WebDriver driver;
    String username = "";
    String password = "";
    String accessKey = "";
    String gridUrl = "@hub....";

    @BeforeTest
    void setup(){
        ChromeOptions options = new ChromeOptions();

        options.setCapability("browserVersion", "latest-1");
        options.setCapability("platformName", "Macos Catalina");
        options.setCapability("project" ,"WebDriverManager");
        options.setCapability("build", "Demonstration: WebDriverManager on LambdaTest");

        WebDriverManager wdm = WebDriverManager.chromedriver().capabilities(options);
        wdm.setup();
        driver = wdm.remoteAddress("https://" + username + ":" + accessKey + gridUrl).create();
    }

    @Test
    void run(){
        driver.get("https://www.amazon.com");

    }
    @AfterTest
    void teardown(){
        driver.quit();
    }

}
