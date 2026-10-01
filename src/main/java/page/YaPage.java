package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.Getter;

@Getter
public class YaPage extends AbstractPage {
    private final Locator geo;
    private final Locator weather;
    private final Locator pollen;

    public YaPage(Page page) {
        super(page);
        this.geo = page.getByTestId("informers.geo");
        this.weather = page.getByTestId("informers.weather");
        this.pollen = page.getByTestId("informers.pollen");
    }
}
