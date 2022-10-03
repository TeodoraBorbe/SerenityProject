package org.fasttrack.features.search;

import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registerWithValidEmail(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setEmail("teodoraborbe@yahoo.com");
        registerSteps.setPassword("parola.123!");
        registerSteps.clickRegister();



    }

    @Test
    public void registerWithInvalidEmail(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setEmail("teodora@yahoo.com");
        registerSteps.setPassword("parola.123!");
        registerSteps.clickRegister();
    }

    @Test
    public void registerWithValidPassword(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setEmail("teodoraborbe@yahoo.com");
        registerSteps.setPassword("parola.123!");
        registerSteps.clickRegister();

    }

    @Test
    public void registerWithInvalidPassword(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setEmail("teodoraborbe@yahoo.com");
        registerSteps.setPassword("parola.12345!");
        registerSteps.clickRegister();

    }
}
