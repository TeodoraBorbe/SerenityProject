package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String keyword){
        accountPage.clickSearchButton();
        accountPage.setSearchField(keyword);
        accountPage.clickSubmitSearchResult();
    }

    public void findProductWithNameAndOpen(String productName){
        Assert.assertTrue(searchResultPage.findProductAndOpen(productName));
    }

    }

