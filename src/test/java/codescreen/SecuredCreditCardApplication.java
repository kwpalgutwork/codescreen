package codescreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecuredCreditCardApplication {

    private WebDriver driver;

    // It appears that each credit card gets its own code. Without knowing the inner workings of discover, this is an assumption
    // that would need to be verified with the dev team that it is valid and also unchanging to prevent rework in the future.
    private String securedCreditCardCode = "KXPA";

    SecuredCreditCardApplication(WebDriver driver) {
        this.driver = driver;
        driver.findElement(By.xpath("//a[contains(@href,'" + securedCreditCardCode + "')]/span[contains(text(), 'Apply Now')]")).click();
    }

    public void skipApplicationPrefill() {
        driver.findElement(By.xpath("//a[contains(text(), 'Skip This Step')]")).click();
    }

    public double getSecuredCreditCardCashAdvanceAPRRate() {
        String aprStringWithPercent = driver.findElement(By.xpath("//b[contains(@class, 'cash-rate')]")).getText();
        return Double.parseDouble(aprStringWithPercent.substring(0, aprStringWithPercent.length()-1));
    }        
}
