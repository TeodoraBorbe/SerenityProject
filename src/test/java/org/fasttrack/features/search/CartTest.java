package org.fasttrack.features.search;

import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void loginAndAddToCart(){
        loginSteps.doLogin("teodoraborbe@yahoo.com", "Parola.123!");
        searchSteps.searchForKeyword("T-Shirt");
        searchSteps.findProductWithNameAndOpen("Blue T-Shirt");
        cartSteps.clickAddToCart();
    }
    @Test
    public void loginAndViewCart(){
        loginSteps.doLogin("teodoraborbe@yahoo.com", "Parola.123!");
        cartSteps.clickViewCart();
    }

    @Test
    public void loginAndRemoveToCart(){
        loginSteps.doLogin("teodoraborbe@yahoo.com","Parola.123!");
        cartSteps.clickViewCart();
        cartSteps.clickRemoveButton();
    }
}
