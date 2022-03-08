import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy (id = "username")
    WebElement usernameInputField;

    @FindBy (id = "password")
    WebElement passwordInputField;

    @FindBy (id = "login")
    WebElement loginButton;

    public LoginPage (ChromeDriver driver) {super(driver);}


    public ProfilePage loginWithValidCredentials() {
        print("Entering valid username and password and logging in.");
        usernameInputField.sendKeys(Strings.USERNAME_VALID);
        passwordInputField.sendKeys(Strings.PASSWORD_VALID);
        loginButton.click();
        return new ProfilePage(driver);
    }

}
