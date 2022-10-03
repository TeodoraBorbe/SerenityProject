package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(css = "button[name='add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(id = "menu-item-124")
    private WebElementFacade cartButton;

    @FindBy(css = ".remove")
    private WebElementFacade removeButton;

    public void clickAddToCartButton(){clickOn(addToCartButton);}

    public void clickViewCart (){ clickOn(cartButton);}

    public void clickRemoveButton(){clickOn(removeButton);}
}
