package ua.pb.youtube.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class SearchResultsPage {
    public ElementsCollection getPreviews() {
        return $$("ytd-two-column-search-results-renderer ytd-video-renderer");
    }

    public SelenideElement getPreview(int index) {
        return $("ytd-two-column-search-results-renderer ytd-video-renderer", index);
    }
}
