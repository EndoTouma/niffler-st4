package guru.qa.niffler.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainPage {

    private final SelenideElement spendingsTable = $(".spendings-table tbody");
    private final SelenideElement deleteSelectedButton = $(byText("Delete selected"));

    public MainPage selectSpendingByDescription(String description) {
        step("Выбираем трату", () ->
                spendingsTable
                        .$$("tr")
                        .find(text(description))
                        .$$("td")
                        .first()
                        .scrollIntoView(true)
                        .click());
        return this;
    }

    public MainPage clickDeleteSelectedButton() {
        step("Удаляем выбранную трату.", () ->
                deleteSelectedButton.click());
        return this;
    }

    public void checkSpendingsTableIsEmpty() {
        step("Проверяем, что таблица с тратами пуста.", () ->
                spendingsTable
                        .$$("tr")
                        .shouldHave(size(0)));
    }
}