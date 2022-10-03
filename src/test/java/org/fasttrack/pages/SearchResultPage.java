package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = ".woocommerce-loop-product__title")
    private List<WebElementFacade> listOfProductNames;

    public boolean findProductAndOpen(String productName){
        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(productName)){element.click();
                return true;
            }
        }
        return false;
    }
}
