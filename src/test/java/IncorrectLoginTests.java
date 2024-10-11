import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.IncorrectLoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IncorrectLoginTests {
    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){ driver = new SHAFT.GUI.WebDriver();}

    @Test(description = "Validate user incorrect login")
    private void validateLogin(){
        new IncorrectLoginPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnSignupButton().ValidateLoginField().fillEmailTextField("Sam@yahoo.com")
                .fillPasswordTextField("123456789").clickOnLoginButton().ValidateErrorMessage();

    }
}