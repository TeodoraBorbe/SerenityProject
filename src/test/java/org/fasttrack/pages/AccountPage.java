package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {
    @FindBy(id = "menu-item-122")
    private WebElementFacade accountLink;

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;

    @FindBy(css = "input[value='Search']")
    private WebElementFacade submitSearchButton;

    @FindBy(css = ".header-search-button")
    private WebElementFacade searchButton;


    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickSearchButton(){ clickOn(searchButton);}
    public void setSearchField(String value){ typeInto(searchField,value);}

    public void clickSubmitSearchResult(){ clickOn(submitSearchButton);}

    }

