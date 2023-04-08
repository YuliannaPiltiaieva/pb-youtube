package ua.pb.youtube.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class ChanelPage {
    private final SelenideElement subscribeBtn = $("#channel-header #subscribe-button");
    private final SelenideElement signInBtn =
            $("ytd-modal-with-title-and-button-renderer ytd-button-renderer");

    public SelenideElement getSubscribeBtn() {
        return subscribeBtn;
    }

    public SelenideElement getSignInButton() {
        return signInBtn;
    }
}
