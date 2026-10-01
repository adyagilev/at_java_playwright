package core.browser;

import com.microsoft.playwright.*;

public class BrowserActions {
    private static Browser browser;
    private Playwright playwright;

    public void initBrowser() {
        if (browser == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(true)
            );
        }
    }

    public UserSession newSession() {
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        return new UserSession(context, page);
    }

    public void stop() {
        if (playwright != null) {
            playwright.close();
        }
    }
}
