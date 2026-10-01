package testui;

import core.browser.BrowserActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseUiTest {
    private static final Logger logger = LoggerFactory.getLogger(BaseUiTest.class);
    protected static BrowserActions browser;

    @BeforeAll
    public static void beforeAll() {
        logger.info("Initialize Playwright browser");
        browser = new BrowserActions();
        browser.initBrowser();
    }

    @AfterAll
    public static void afterAll() {
        logger.info("Stop Playwright browser");
        browser.stop();
    }
}
