package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase {

    public MainPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//button[@id='register']")
    WebElement registerButtonElement;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstnameInputElement;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastnameInputElement;

    @FindBy(xpath = "//input[@id='personalId']")
    WebElement personalIdInputElement;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneInputElement;

    @FindBy(xpath = "//input[@id='dateOfBirth']")
    WebElement dateOfBirthInputElement;

    @FindBy(css = ".gender.male.h5.col-4.py-2.px-0.box-select")
    WebElement genderMaleElement;

    @FindBy(xpath = "//input[@id='agreeTerms']")
    WebElement agreeTermsElement;

    @FindBy(css = ".button-big.button-active")
    WebElement buttonActiveElement;


    public WebElement getRegisterButtonElement() {
        return registerButtonElement;
    }

    public WebElement getFirstnameInputElement() {
        return firstnameInputElement;
    }

    public WebElement getLastnameInputElement() {
        return lastnameInputElement;
    }

    public WebElement getPersonalIdInputElement() {
        return personalIdInputElement;
    }

    public WebElement getPhoneInputElement() {
        return phoneInputElement;
    }

    public WebElement getDateOfBirthInputElement() {
        return dateOfBirthInputElement;
    }

    public WebElement getGenderMaleElement() {
        return genderMaleElement;
    }

    public WebElement getAgreeTermsElement() {
        return agreeTermsElement;
    }

    public WebElement getButtonActiveElement() {
        return buttonActiveElement;
    }

    public void clickRegister(){
        buttonActiveElement.click();
    }

}
