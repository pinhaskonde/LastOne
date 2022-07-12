package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class Tests extends TestBase {
    MainPage mainPage;
//    FormPage formPage;

    @BeforeMethod
    public void setMainPage(){
        mainPage = PageFactory.initElements(wd,MainPage.class);
//        formPage = PageFactory.initElements(wd,FormPage.class);
    }

    @Test
    public void tests() throws InterruptedException {
//        mainPage.clickRegButton();
        mainPage.clickRegister();
        Thread.sleep(7000);

        mainPage.inputText(mainPage.getFirstnameInputElement(),"Benjamin");
        mainPage.inputText(mainPage.getLastnameInputElement(),"Franklin");
        mainPage.inputText(mainPage.getPersonalIdInputElement(),"345740593");
        mainPage.inputText(mainPage.getPhoneInputElement(),"0544262422");
        mainPage.inputText(mainPage.getDateOfBirthInputElement(),"05051999");
        mainPage.getGenderMaleElement().click();
        mainPage.getAgreeTermsElement().click();
        mainPage.getButtonActiveElement().click();


        Thread.sleep(7000);
    }



}
