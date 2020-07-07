package Pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@DefaultUrl("https://twitter.com/explore")
public class MainPage extends BasePage{

    @FindBy (css = "a[href='/i/flow/signup']")
    private WebElement toRegister;

    @FindBy (name = "name")
    private WebElement nameField;

    @FindBy (xpath = "//*[@class='css-1dbjc4n r-xx1rs6']/div[4]/span")
    private WebElement useEmailInstead;

    @FindBy (name = "email")
    private WebElement emailField;

    @FindBy (xpath = "//*[contains(@class,'r-18qmn74')]/div")
    private  WebElement nextButton;

    @FindBy (name = "birthday")
    private WebElement birthdayField;


    public MainPage (WebDriver driver) {
        super(driver);
    }

    public void openMainPage () {
        open();
    }

    public void clickOnToRegisterButton () {
        element(toRegister).click();
    }

    public void fillInNameField (String name) {
        element(nameField).sendKeys(name);
    }

    public void clickOnUseEmailInstead () {
        element(useEmailInstead).click();
    }

    public void fillInEmailField (String email) {
        element(emailField).sendKeys(email);
    }

    public void chooseMonth (String month) {
        Select dropdown = new Select(getDriver().findElement(By.cssSelector("select[aria-label='Month'")));
        dropdown.selectByVisibleText(month);
    }

    public void chooseDay (int day) {
        Select dropdown = new Select(getDriver().findElement(By.cssSelector("select[aria-label='Day'")));
        dropdown.selectByVisibleText(Integer.toString(day));
    }

    public void chooseYear (int year) {
        Select dropdown = new Select(getDriver().findElement(By.cssSelector("select[aria-label='Year'")));
        dropdown.selectByVisibleText(Integer.toString(year));
    }

    public void twoClickOnNextButton () {
        for (int i = 0; i < 2; i++) {
            element(nextButton).click();
        }
    }

    public void checkName (String name) {
        Assert.assertEquals(name, getDriver().findElement(By.name("name")).getAttribute("value"));
    }

    public void checkEmail (String email) {
        Assert.assertEquals(email, getDriver().findElement(By.name("email")).getAttribute("value"));
    }

    public void checkBirthday (String month, int day, int year) {
        String shotBirtday = month.substring(0,3)+ " " + day + "," + " " + year;
        Assert.assertEquals(shotBirtday, getDriver().findElement(By.name("birthday")).getAttribute("value"));
    }


}
