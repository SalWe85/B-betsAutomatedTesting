import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy (id = "deposit-modal-close-x")
    WebElement closeDepositModalButton;

    public ProfilePage (ChromeDriver driver) {super(driver);}

    public void closeDepositModal () {
        waitByXpath(driver, "//button[@id='deposit-modal-close-x']");
        closeDepositModalButton.click();
    }


}
