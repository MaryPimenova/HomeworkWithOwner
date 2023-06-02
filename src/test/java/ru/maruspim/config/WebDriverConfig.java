package ru.maruspim.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://maven.apache.org")
    String getBaseUrl();

    @Key("isRemoteWebDriver")
    @DefaultValue("false")
    Boolean isRemoteWebDriver();

    @Key("remoteURL")
    String getRemoteURL();

}
