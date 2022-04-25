package base;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Getter
@Setter
public class BaseTest {

    public WebDriver webDriver;

    @BeforeTest
    public void init(){
        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public void goToLogin(){
        webDriver.get("http://school-for-automation.tech/index.html");
    }

    @AfterTest
    public void tearDown(){
        webDriver.close();
    }
}
