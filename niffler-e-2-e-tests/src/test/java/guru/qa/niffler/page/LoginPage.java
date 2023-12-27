package guru.qa.niffler.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class LoginPage {

    private final SelenideElement usernameInput = $("input[name='username']");
    private final SelenideElement passwordInput = $("input[name='password']");
    private final SelenideElement signInButton = $("button[type='submit']");

    public LoginPage fillUserName(String username) {
        step("Заполняем поле Username", () ->
                usernameInput.setValue(username));
        return this;
    }

    public LoginPage fillPassword(String password) {
        step("Заполняем поле Password.", () ->
                passwordInput.setValue(password));
        return this;
    }

    public LoginPage clickSignInButton() {
        step("Кликаем на 'Sign in'.", () ->
                signInButton.click());
        return this;
    }
}