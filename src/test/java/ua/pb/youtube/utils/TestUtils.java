package ua.pb.youtube.utils;

import com.codeborne.selenide.Selenide;

public class TestUtils {

    public static void maximize() {
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
    }
}
