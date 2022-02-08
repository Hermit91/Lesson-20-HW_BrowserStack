package gmail.salokin1991.tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {

    @Test
    void searchTest() {

        step("Tap header menu", () -> {
        $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Tap settings", () -> {
        $(MobileBy.id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        });
        step("Tap Wikipedia Language", () -> {
        $(MobileBy.id("android:id/summary")).click();
        });
        step("Select input field? than type 'English'", () -> {
        $(MobileBy.id("org.wikipedia.alpha:id/preference_languages_filter")).sendKeys("English");
        });
        step("Check language selection field visibility", () -> {
        $(MobileBy.id("org.wikipedia.alpha:id/preference_languages_list")).shouldBe(visible);
        });

    }
}
