package codescreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditCardSelectionPage {

    private WebDriver driver;

    public CreditCardSelectionPage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(By.xpath("//p[contains(text(), 'Credit Cards')]")).click();
    }

    public SecuredCreditCardApplication selectSecuredCreditCard() {
        return new SecuredCreditCardApplication(driver);
    }

    //TODO: the rest of the credit card types would go here.        
}
