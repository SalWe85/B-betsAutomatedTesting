import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KazinoTest extends BaseTest{


    /**
     * Start third blackjack game after logging in
     * 1.Navigate to b-bets website
     * 2. Log in
     * 3. Go to Kazino page
     * 4. Collect all blackjack games in a list and open thir one
     *
     * Expected results:
     * 1. Verify that you are on Kazino page
     * 2. Verify that Atlantic city multihand game is opened.
     */
    @Test
    public void startThirdKazinoGameAfterLogingIn(){
        ChromeDriver driver = openChromeDriver();

        BasePage basePage = new BasePage(driver);

        basePage.clickOnLoginHeaderButton().loginWithValidCredentials().closeDepositModal();
        basePage.clickOnKazinoHeaderButton();

        assert driver.getCurrentUrl().contains(Strings.CASINO_PAGE_URL) : "Error. Expected url: " + Strings.CASINO_PAGE_URL
                + ", Actual: " + driver.getCurrentUrl();
        print("Assertation passed. Casino page opened.");

        KazinoPage kazinoPage = new KazinoPage(driver);
        kazinoPage.clickOnThirdBlackjackGame();

        assert driver.getCurrentUrl().contains(Strings.BLACKJACK_ATLANTIC_CITY_MULTI_HAND) : "Error. Expected url: " + Strings.BLACKJACK_ATLANTIC_CITY_MULTI_HAND
                + ", Actual: " + driver.getCurrentUrl();
        print("Assertation passed. Third blackjack game opened.");

    }

}
