package ua.pb.youtube.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MainPage {
    private final SelenideElement searchQueryInput = $(By.name("search_query"));
    private final SelenideElement searchBtn = $("#search-icon-legacy");

    public void search(String query) {
        searchQueryInput.setValue(query);
        searchBtn.hover().click();
    }
}
