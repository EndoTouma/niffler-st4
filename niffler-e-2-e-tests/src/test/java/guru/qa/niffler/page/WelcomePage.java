package guru.qa.niffler.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WelcomePage {

    private final SelenideElement loginButton = $("a[href*='redirect']");

    public WelcomePage clickLoginButton() {
        step("Кликаем на 'Login'.", () ->
                loginButton.click());
        return this;
    }
}