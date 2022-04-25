package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@Getter
@Setter
public class SelectPage extends BasePage {
    public SelectPage(WebDriver webDriver) {
        super(webDriver);
    }

    private Select selectList = new Select(getWebDriver().findElement(By.id("category")));
}
