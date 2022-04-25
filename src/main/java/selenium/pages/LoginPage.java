package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import model.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }
    @FindBy(id = "email")
    private WebElement insertEmail;

    @FindBy(id = "password")
    private WebElement insertPassword;

    @FindBy(xpath= "//*[@id=\"login-form\"]/input[3]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"banner\"]/div[2]/a")
    private WebElement newAccountButton;

    public void insertEmail(String email){
        insertEmail.sendKeys(email);
    }

    public void insertPassword(String password){
        insertEmail.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }

    public void fillLogin(Login login){
        insertEmail(login.getEmail());
        insertPassword(login.getPassword());
        clickLogin();
    }

    public void clickNewAccount(){
        newAccountButton.click();
    }

}
