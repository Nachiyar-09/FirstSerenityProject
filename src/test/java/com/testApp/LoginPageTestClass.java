package com.testApp;

import PageSteps.HRMLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTestClass {

    @Managed(driver ="chrome")
    WebDriver browser;

    @Steps
    HRMLoginSteps hrmLoginSteps;

    @Title("Login test with valid credentials")
    @Test
    public void appTest(){
        hrmLoginSteps.UserNavigateToURL();
        hrmLoginSteps.VerifyLoginAction();
        hrmLoginSteps.VerifySuccessfullLogin();

    }


}
