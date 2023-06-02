package ru.maruspim.tests;

import com.codeborne.selenide.Configuration;
import ru.maruspim.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setConfigurationParameters() {

        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        if (config.isRemoteWebDriver()) {
            Configuration.remote = config.getRemoteURL();
        }
    }

}
