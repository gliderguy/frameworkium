package com.github.pages.web;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import com.github.pages.web.components.HeaderComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class HomePage extends BasePage<HomePage> {

    @Visible
    @Name("Header")
    private HeaderComponent header;

    @Visible
    @Name("Marketing Sign-Up Banner")
    @FindBy(css = ".jumbotron-home h1")
    private WebElement homepageHeroIntro;

    @Step("Navigate to the Github homepage")
    public static HomePage open() {
        return PageFactory.newInstance(HomePage.class, "https://github.com");
    }

    public HeaderComponent theHeader() {
        return header;
    }
}
