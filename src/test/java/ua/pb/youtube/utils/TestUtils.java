package ua.pb.youtube.utils;

import com.codeborne.selenide.Selenide;

public class TestUtils {
    public static String getCurrentPageTitle() {
        return Selenide.title();
    }

    public static void maximize() {
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
    }
}
