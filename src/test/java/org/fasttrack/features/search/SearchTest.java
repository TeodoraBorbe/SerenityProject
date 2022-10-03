package org.fasttrack.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void loginAndSearchProduct(){
        loginSteps.doLogin("teodoraborbe@yahoo.com","Parola.123!");
        searchSteps.searchForKeyword("T-Shirt");
        searchSteps.findProductWithNameAndOpen("Blue T-Shirt");

    }


    @Test
    public void loginAndSearchWithEmptySpace(){
        loginSteps.doLogin("teodoraborbe@yahoo.com", "Parola.123!");
        searchSteps.searchForKeyword(" ");
    }

    @Test
    public void loginAndSearchUsingSymbols(){
        loginSteps.doLogin("teodoraborbe@yahoo.com", "Parola.123!");
        searchSteps.searchForKeyword("@#$@#$");
    }
}

