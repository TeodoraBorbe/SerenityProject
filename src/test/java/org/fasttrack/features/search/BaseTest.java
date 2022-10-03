package org.fasttrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.serenity.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {


    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected LogoutSteps logoutSteps;
    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected SearchSteps searchSteps;





    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get("http://qa4.fasttrackit.org:8008/");
    }
}
