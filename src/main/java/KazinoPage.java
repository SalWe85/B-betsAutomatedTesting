import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class KazinoPage extends BasePage{


    public KazinoPage(ChromeDriver driver) {super(driver);}

    public void clickOnThirdBlackjackGame() {
        print("Opening third blackjack game.");
        waitByXpath(driver, "//div[@class='pad']");
        List<WebElement> blackjackGameList = driver.findElements(By.className("pad"));
        blackjackGameList.get(2).click();
    }

}
