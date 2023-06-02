package ru.maruspim.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class WebDriverTest extends TestBase {
    SelenideElement mavenHeaderText = $("#bodyColumn"),
            aboutMavenRef = $("a[href*='what-is-maven.html']"),
            introductionHeaderText = $("#introduction");

    @Test
    void mavenTest() {

        open("/");
        mavenHeaderText.shouldHave(text("Welcome to Apache Maven"));
        aboutMavenRef.click();
        introductionHeaderText.shouldHave(text("Introduction"));
    }

}