package core.browser;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import lombok.Getter;

@Getter
public class UserSession {
    private final BrowserContext context;
    private final Page page;

    public UserSession(BrowserContext context, Page page) {
        this.context = context;
        this.page = page;
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public void close() {
        context.close();
    }
}
