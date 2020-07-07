package Tests;

import org.junit.Test;

public class ToRegisterTest extends SampleTest{

    @Test
    public void toRegisterTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnToRegisterButton();
        user.mainPage.fillInNameField("test");
        user.mainPage.clickOnUseEmailInstead();
        user.mainPage.fillInEmailField("automationstep@gmail.com");
        user.mainPage.chooseMonth("May");
        user.mainPage.chooseDay(3);
        user.mainPage.chooseYear(2000);
        user.mainPage.twoClickOnNextButton();
        user.mainPage.checkName("test");
        user.mainPage.checkEmail("automationstep@gmail.com");
        user.mainPage.checkBirthday("May", 3, 2000);
    }
}
