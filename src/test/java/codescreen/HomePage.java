package codescreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AbstractPage {

    private WebDriver driver;
    private static String url = "https://discover.com";

    public HomePage(WebDriver driver) {
        super(driver, url);
        this.driver = driver;
    }

    public CreditCardSelectionPage navigateToCreditCards() {
        return new CreditCardSelectionPage(this.driver);
    }

    //TODO: the rest of the pages you can get to from the home page would go here.
    
}
