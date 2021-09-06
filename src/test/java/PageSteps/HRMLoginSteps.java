package PageSteps;

import com.OrangeHRMLoginPage.HRMLogin;
import net.thucydides.core.annotations.Step;

public class HRMLoginSteps {

      private HRMLogin hrmlogin;

    @Step
    public void UserNavigateToURL(){
        hrmlogin.open();
    }

    @Step
    public void VerifyLoginAction(){
        hrmlogin.LoginPageUnderTest();
    }

    @Step
    public void VerifySuccessfullLogin(){
        hrmlogin.VerifyHomePageTitle();
    }
}
