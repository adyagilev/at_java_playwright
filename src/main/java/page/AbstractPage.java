package page;

import com.microsoft.playwright.Page;

public class AbstractPage {
    protected Page page;

    public AbstractPage(Page page) {
        this.page = page;
    }

    @io.qameta.allure.Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        return page.screenshot();
    }
}
