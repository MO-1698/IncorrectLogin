package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class IncorrectLoginPage {
    private SHAFT.GUI.WebDriver driver;

    public IncorrectLoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By SignupPageButton = By.xpath("//a[@href=\"/login\"]//i[@class=\"fa fa-lock\"]");
    private By LoginField = By.xpath("//div[@class=\"login-form\"]");
    private By EmailTextField = By.xpath("//input[@data-qa=\"login-email\"]");
    private By PasswordTextField = By.xpath("//input[@data-qa=\"login-password\"]");
    private By LoginButton = By.xpath("//button[@data-qa=\"login-button\"]");
    private By ErrorMessage = By.xpath("//p[@style=\"color: red;\"]");


    public IncorrectLoginPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public IncorrectLoginPage clickOnSignupButton() {
        driver.element().click(SignupPageButton);
        return this;

    }

    public IncorrectLoginPage fillEmailTextField(String email) {
        driver.element().type(EmailTextField, email);
        return this;
    }

    public IncorrectLoginPage fillPasswordTextField(String password) {
        driver.element().type(PasswordTextField, password);
        return this;
    }

    public IncorrectLoginPage clickOnLoginButton() {
        driver.element().click(LoginButton);
        return this;
    }


    @Step("Validate that the user is on Home Page")
    public IncorrectLoginPage ValidateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that 'Login to your account' is visible")
    public IncorrectLoginPage ValidateLoginField() {
        driver.element().verifyThat(LoginField).text().contains("Login to your account");
        return this;
    }

    @Step("Validate that 'Your email or password is incorrect!' is visible")
    public IncorrectLoginPage ValidateErrorMessage() {
        driver.element().verifyThat(ErrorMessage).text().contains("Your email or password is incorrect!");
        return this;
    }

}