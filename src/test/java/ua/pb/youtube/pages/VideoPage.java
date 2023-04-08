package ua.pb.youtube.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class VideoPage {
    private final SelenideElement avatar = $("ytd-video-owner-renderer #avatar");

    public SelenideElement getAvatar() {
        return avatar;
    }
}
