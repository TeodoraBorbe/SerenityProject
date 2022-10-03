package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy (id = "username")
    private WebElementFacade userNameAndEmailField;

    @FindBy (id = "password")
    private WebElementFacade passwordField;

    @FindBy (css = "button[name='login']")
    private WebElementFacade loginButton;

    @FindBy( css = ".woocommerce-LostPassword a")
    private WebElementFacade lostYourPasswordElement;

    @FindBy(id = "user_login")
    private WebElementFacade userNameLostYourPassword;

    @FindBy(css = ".woocommerce-Button")
    private WebElementFacade resetPasswordButton;

    @FindBy(css = ".woocommerce-form__label")
    private WebElementFacade clickRememberMeButton;

    public void setUserNameAndEmailField(String value){ typeInto(userNameAndEmailField, value);}

    public void setPasswordField(String value) { typeInto(passwordField, value);}

    public void clickLoginButton(){clickOn(loginButton);}

    public void clickLostYourPassword(){clickOn(lostYourPasswordElement);}

    public void clickUserNameLostYourPassword(String value){typeInto(userNameLostYourPassword, value);}

    public void clickResetPassword(){clickOn(resetPasswordButton);}

    public void clickRememberMeButton(){clickOn(clickRememberMeButton);}
}
