package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps{
    @Step
    public void navigateToHomePage(){ homePage.open();}


    @Step
    public void navigateToMyAccountPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void setUserNameAndEmail(String email) {loginPage.setUserNameAndEmailField(email);}

    @Step
    public void setPassword(String password) {loginPage.setPasswordField(password);}


    @Step
    public void clickLogin() {loginPage.clickLoginButton();}

    @Step
    public void clickLostYourPassword(){loginPage.clickLostYourPassword();}

    @Step
    public void clickUserNameLostYourPassword(String value){loginPage.clickUserNameLostYourPassword(value);}

    @Step
    public void clickResetPassword(){loginPage.clickResetPassword();}

    @Step
    public void clickRememberMeButton(){loginPage.clickRememberMeButton();}


    @Step
    public void doLogin(String email, String pass){
        navigateToHomePage();
        navigateToMyAccountPage();
        setUserNameAndEmail(email);
        setPassword(pass);
        clickLogin();

}}
