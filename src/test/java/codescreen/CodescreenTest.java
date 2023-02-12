package codescreen;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodescreenTest {
	private static Logger logger;
	WebDriver driver;

	@BeforeAll
	static void setupClass() {
		logger = LoggerFactory.getLogger(CodescreenTest.class);
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setupTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@AfterEach
	void teardown() {
		driver.quit();
	}

	@Test
	void testThatAPRForCashAdvancesOnSecuredCreditCardsIsGreaterThan20Percent() {
		HomePage homePage = new HomePage(driver);
		CreditCardSelectionPage ccSelectionPage = homePage.navigateToCreditCards();
		SecuredCreditCardApplication securedCCApplication = ccSelectionPage.selectSecuredCreditCard();
		securedCCApplication.skipApplicationPrefill();
		
		assertTrue(securedCCApplication.getSecuredCreditCardCashAdvanceAPRRate() > 20);
	}
}
