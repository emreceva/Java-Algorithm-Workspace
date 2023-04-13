import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicChromeSetup {


    WebDriver driver;

    @BeforeTest
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void runTest(){
        driver.get("https://www.google.com");

    }
    @AfterTest
    void teardown(){
        driver.quit();
    }


}
