package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@Setter
public class RadioButtonsPage  extends BasePage{
    public RadioButtonsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name = "radio-container")
    public List<WebElement> radioButtons;

}
