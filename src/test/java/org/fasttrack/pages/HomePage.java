package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(id ="menu-item-122" )
    private WebElementFacade accountLink;

    public void clickAccountLink(){ clickOn(accountLink);}








}
