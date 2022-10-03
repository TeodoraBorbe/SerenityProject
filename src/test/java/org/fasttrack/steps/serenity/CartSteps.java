package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class CartSteps extends BaseSteps{

    @Step
    public void clickAddToCart (){cartPage.clickAddToCartButton();}

    @Step
    public void clickViewCart(){cartPage.clickViewCart();}

    @Step
    public void clickRemoveButton(){cartPage.clickRemoveButton();}
}
