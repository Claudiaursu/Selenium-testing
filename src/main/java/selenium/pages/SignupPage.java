package selenium.pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class SignupPage extends BasePage {

    public SignupPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"signup-form\"]/input[7]")
    private WebElement submitButton;

    public void fillSignup(SignUp signUp){
        firstNameInput.sendKeys(signUp.getFirstName());
        lastNameInput.sendKeys(signUp.getLastName());
        passwordInput.sendKeys(signUp.getPassword());
        emailInput.sendKeys(signUp.getEmail());
        phoneInput.sendKeys(signUp.getPhone());
        addressInput.sendKeys(signUp.getAddress());
        submitButton.click();
    }

}
