package codescreen;

import org.openqa.selenium.WebDriver;

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
