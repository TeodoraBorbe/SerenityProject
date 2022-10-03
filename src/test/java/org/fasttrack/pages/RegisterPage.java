package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {
    @FindBy (id ="reg_email")
    private WebElementFacade emailField;

    @FindBy (id ="reg_password")
    private WebElementFacade passwordField;

    @FindBy (css = "button[name='register']")
    private WebElementFacade registerButton;

    public void setEmailField(String value){ typeInto(emailField, value);}

    public void setPasswordField(String value) { typeInto(passwordField, value);}

    public void clickRegisterButton(){clickOn(registerButton);}





}
