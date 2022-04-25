package tests;

import base.BaseTest;
import javafx.scene.control.RadioButton;
import model.Login;
import model.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.*;

public class Tests extends BaseTest {

//    private LoginPage loginPage;
//    private SignupPage signupPage;
    private SignUp newUser = new SignUp();
    private Login currentUser = new Login(newUser.getEmail(), newUser.getPassword());

    @Test
    public void goToSignUpPage(){
        goToLogin();
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.clickNewAccount();
        SignupPage signupPage = new SignupPage(getWebDriver());

        signupPage.fillSignup(newUser);
        LoginPage loginPage2 = new LoginPage(getWebDriver());
        loginPage2.fillLogin(currentUser);

        WebElement learnMoreButton = new WebDriverWait(getWebDriver(),4)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"banner\"]/ul/li/a")));

        Assert.assertTrue(learnMoreButton.isDisplayed());
    }

    @Test
    public void RadioButtonsTest(){
        goToLogin();
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.fillLogin(currentUser);

        HomePage homePage= new HomePage(getWebDriver());
        homePage.clickOnChat();

        RadioButtonsPage radioButtonsPage= new RadioButtonsPage(getWebDriver());
        radioButtonsPage.getRadioButtons().get(0).click();
        WebElement infoMessage = getWebDriver().findElement(By.linkText(radioButtonsPage.getRadioButtons().get(0).getText()));

        Assert.assertTrue(infoMessage.isDisplayed());
    }

    @Test
    public void TableTest(){
        goToLogin();
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.fillLogin(currentUser);

        HomePage homePage= new HomePage(getWebDriver());
        homePage.clickOnClock();

        TablePage tablePage = new TablePage(getWebDriver());
        int calculatedSum = tablePage.calcSumaTotala();
        int actualSum = tablePage.getTotalSum();
        Assert.assertEquals(calculatedSum,actualSum);

    }

    @Test
    public void SelectTest(){
        goToLogin();
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.fillLogin(currentUser);

        HomePage homePage= new HomePage(getWebDriver());
        homePage.clickOnHuman();

        getWebDriver().get("http://school-for-automation.tech/select.html");

        SelectPage selectPage = new SelectPage(getWebDriver());
        selectPage.getSelectList().selectByIndex(0);
        String selectedText = selectPage.getSelectList().getFirstSelectedOption().getText();
        WebElement infoSelected = getWebDriver().findElement(By.id("selected-value"));
        Assert.assertEquals(selectedText, infoSelected.getText());

    }

}
