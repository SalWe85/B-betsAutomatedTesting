import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    /**
     * Log in with valid credentials
     *
     * 1. Go to https://sports.b-bets.com/
     * 2. Click on login button
     * 3. Enter valid credentials and login
     *
     * Expected results
     * 1. Verify that you are logged in on profile page
     */
    @Test
    public void logingWithValidCredentials() {

        ChromeDriver driver = openChromeDriver();

        try {
            BasePage basePage = new BasePage(driver);

            basePage.clickOnLoginHeaderButton().loginWithValidCredentials().closeDepositModal();

            assert driver.getCurrentUrl().contains(Strings.PROFILE_PAGE_URL) : "Error. Expected url: " + Strings.PROFILE_PAGE_URL
                    + ", Actual: " + driver.getCurrentUrl();
            print("Assertation passed. You are logged in on profile page");


        } finally {
          //  driver.quit();
        }

    }

}
