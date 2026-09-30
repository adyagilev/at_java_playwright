package core.actions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;

import com.microsoft.playwright.*;
import core.config.PropertiesConfig;
import org.aeonbits.owner.ConfigFactory;

public class BrowserActions {
    private static final PropertiesConfig config = ConfigFactory.create(PropertiesConfig.class, System.getProperties());

    private Page page;

    public BrowserActions() {
        System.out.println("Initialize Playwright Browser");
        Browser browser;
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch();
        this.page = browser.newPage();
    }

    public void open(String url) {
        System.out.println("Open the '" + url + "' URL using Playwright");
        this.page.navigate(url);
    }

    public void takeScreenshot() {
        System.out.println("Take screenshot using Playwright");
        this.page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(
                "allure-results","screenshots", "screenshot-" + Instant.now().toEpochMilli() + ".png"
        )));
    }
}
