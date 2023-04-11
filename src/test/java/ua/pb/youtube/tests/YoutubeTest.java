package ua.pb.youtube.tests;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codeborne.selenide.Condition;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;
import ua.pb.youtube.pages.ChanelPage;
import ua.pb.youtube.pages.MainPage;
import ua.pb.youtube.pages.SearchResultsPage;
import ua.pb.youtube.pages.VideoPage;
import ua.pb.youtube.utils.TestUtils;

public class YoutubeTest {
    private final MainPage mainPage = new MainPage();
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();
    private final VideoPage videoPage = new VideoPage();
    private final ChanelPage chanelPage = new ChanelPage();

    @Test
    public void testScenario() {
        open("");

        assertEquals("YouTube", title());

        int randomNum = ThreadLocalRandom.current().nextInt(10, 10000);
        mainPage.search(String.valueOf(randomNum));
        searchResultsPage.getPreviews().shouldHave(sizeGreaterThan(1));

        TestUtils.maximize();

        searchResultsPage.getPreview(3).click();
        videoPage.getAvatar().shouldBe(visible).click();
        chanelPage.getSubscribeBtn().shouldBe(Condition.visible).hover().click();
        chanelPage.getSignInButton().shouldBe(visible);
    }
}
