package testui;

import core.browser.UserSession;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import page.YaPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstUiTest extends BaseUiTest {
    private final Logger logger = LoggerFactory.getLogger(MyFirstUiTest.class);
    private final String myString = "qweqwe";

    @Test
    public void testOpenSite() {
        logger.info("Start OpenSite test");
        String url = "https://ya.ru";
        UserSession session = browser.newSession();
        session.navigate(url);
        YaPage yaPage = new YaPage(session.getPage());
        yaPage.takeScreenshot();
        assertThat(yaPage.getGeo().isVisible()).isTrue();
        assertThat(yaPage.getWeather().isVisible()).isTrue();
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
