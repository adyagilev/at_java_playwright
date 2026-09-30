package testui;

import core.actions.BrowserActions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstUiTest extends BaseUiTest {
    private final Logger logger = LoggerFactory.getLogger(MyFirstUiTest.class);
    private final String myString = "qweqwe";

    @Test
    public void testOpenSite() {
        logger.info("Start OpenSite test");
        String url = "https://ya.ru";
        BrowserActions playwright = new BrowserActions();
        playwright.open(url);
        playwright.takeScreenshot();
        logger.info("Finish OpenSite test");
    }

    //@Test
    public void test2pass() {
        assertThat(myString).isEqualTo("qweqwe");
    }

    //@Test
    public void test2fail() {
        assertThat(myString).isEqualTo("hello");
    }
}
