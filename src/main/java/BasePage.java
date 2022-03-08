import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    ChromeDriver driver = null;

    @FindBy (xpath = "//div[2]/a[@class='bb-btn-gray login text-uppercase']")
    WebElement loginHeaderButton;

    @FindBy (xpath = "//nav[@id='nav-desktop']/div/ul/li[5]")
    WebElement kazinoMenuButton;

    public  BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoginPage clickOnLoginHeaderButton() {
        print("Clicking on header Login button");
        loginHeaderButton.click();
        return new LoginPage(driver);
    }

    public void clickOnKazinoHeaderButton() {
        print("Clicking on Kazino menu button");
        kazinoMenuButton.click();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void waitByXpath (ChromeDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
