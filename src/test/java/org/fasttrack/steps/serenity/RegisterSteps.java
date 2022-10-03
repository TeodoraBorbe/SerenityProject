package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void navigateToMyAccountPage() {
        homePage.clickAccountLink();
    }

    @Step
    public void setEmail(String email) {
        registerPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        registerPage.setPasswordField(password);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void doRegister(String email, String pass) {
        navigateToHomePage();
        navigateToMyAccountPage();
        setEmail(email);
        setPassword(pass);
        clickRegister();

    }
}

