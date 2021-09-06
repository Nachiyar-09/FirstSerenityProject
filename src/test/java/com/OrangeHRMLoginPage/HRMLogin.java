package com.OrangeHRMLoginPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class HRMLogin extends PageObject {

public void LoginPageUnderTest(){
    $("#txtUsername").sendKeys("Admin");
    $("#txtPassword").sendKeys("admin123");
    $("#btnLogin").click();

}
public void VerifyHomePageTitle(){
    String HomePageTitle = $("#welcome").getText();
}
}
