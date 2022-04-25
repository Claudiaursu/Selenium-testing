package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//*[@id=\"banner\"]/ul/li/a")
    private WebElement learnMoreButton;

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[1]/a/i")
    private WebElement clockIcon;

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[2]/a/i")
    private WebElement chatIcon;

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[3]/a/i")
    private WebElement humanIcon;

    public void clickOnClock(){
        clockIcon.click();
    }

    public void clickOnChat(){
        chatIcon.click();
    }

    public void clickOnHuman(){
        chatIcon.click();
    }
}
