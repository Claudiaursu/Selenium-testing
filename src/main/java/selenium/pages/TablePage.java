package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class TablePage extends BasePage {
    public TablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tbody/tr[1]/td[3]")
    private WebElement item1Price;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tbody/tr[2]/td[3]")
    private WebElement item2Price;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tbody/tr[3]/td[3]")
    private WebElement item3Price;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tbody/tr[4]/td[3]")
    private WebElement item4Price;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tbody/tr[5]/td[3]")
    private WebElement item5Price;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/table/tfoot/tr/td[2]")
    private WebElement tableSum;

    public int calcSumaTotala(){
        int price1 = Integer.parseInt(item1Price.getText());
        int price2 = Integer.parseInt(item2Price.getText());
        int price3 = Integer.parseInt(item3Price.getText());
        int price4 = Integer.parseInt(item4Price.getText());
        int price5 = Integer.parseInt(item5Price.getText());
        return price1+price2+price3+price4+price5;
    }

    public int getTotalSum(){
        return Integer.parseInt(tableSum.getText());
    }
}
