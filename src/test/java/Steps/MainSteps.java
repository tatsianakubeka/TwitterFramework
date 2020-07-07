package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainSteps extends ScenarioSteps {

    private MainPage onPage;

    @Step
    public void openMainPage () {
        onPage.openMainPage();
    }

    @Step
    public void clickOnToRegisterButton () {
        onPage.clickOnToRegisterButton();
    }

    @Step
    public void fillInNameField (String name) {
        onPage.fillInNameField(name);
    }

    @Step
    public void clickOnUseEmailInstead () {
        onPage.clickOnUseEmailInstead();
    }

    @Step
    public void fillInEmailField (String email) {
        onPage.fillInEmailField(email);
    }

    @Step
    public void chooseMonth(String month) {
        onPage.chooseMonth(month);
    }

    @Step
    public void chooseDay (int day) {
        onPage.chooseDay(day);
    }

    @Step
    public void chooseYear (int year) {
        onPage.chooseYear(year);
    }

    @Step
    public void twoClickOnNextButton () {
        onPage.twoClickOnNextButton();
    }

    @Step
    public void checkName(String name) {
        onPage.checkName(name);
    }

    @Step
    public void checkEmail(String email) {
        onPage.checkEmail(email);
    }

    @Step
    public void checkBirthday(String month, int day, int year) {
        onPage.checkBirthday(month, day, year);
    }


}
