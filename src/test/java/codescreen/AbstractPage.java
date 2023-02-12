package codescreen;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractPage {
    private Logger logger;

    public AbstractPage(final WebDriver driver, final String url) {
        logger = LoggerFactory.getLogger(AbstractPage.class);
		driver.get(url);
    }
}
