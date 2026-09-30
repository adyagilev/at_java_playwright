package core.config;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/main/resources/config.properties")
public interface PropertiesConfig extends Config {

    @DefaultValue("https://example.com")
    @Key("site_url")
    String getSiteUrl();
}
