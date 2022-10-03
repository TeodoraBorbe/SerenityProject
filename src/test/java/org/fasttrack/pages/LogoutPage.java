package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LogoutPage extends PageObject {

    @FindBy (css= ".woocommerce-MyAccount-navigation-link--customer-logout a")
    private WebElementFacade logoutButton;

    public void clickLogoutButton(){clickOn(logoutButton);}
}
