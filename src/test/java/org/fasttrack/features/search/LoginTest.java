package org.fasttrack.features.search;

import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidEmail(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe@yahoo.com");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickLogin();

    }

    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodora@yahoo.com");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickLogin();
    }

    @Test
    public void loginWithValidPassword(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe@yahoo.com");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickLogin();
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe@yahoo.com");
        loginSteps.setPassword("Parola.13");
        loginSteps.clickLogin();
    }

    @Test
    public void loginWithValidUserName(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickLogin();
    }

    @Test
    public void loginWithInvalidUserName(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teoborbe");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickLogin();

    }
    @Test
    public void lostPasswordWithValidEmail(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.clickLostYourPassword();
        loginSteps.clickUserNameLostYourPassword("teodoraborbe@yahoo.com");
        loginSteps.clickResetPassword();
    }
    @Test
    public void lostPasswordWithValidUserName(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.clickLostYourPassword();
        loginSteps.clickUserNameLostYourPassword("teodoraborbe");
        loginSteps.clickResetPassword();
    }
    @Test
    public void lostPasswordWithInvalidEmail(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.clickLostYourPassword();
        loginSteps.clickUserNameLostYourPassword("teodora@yahoo.com");
        loginSteps.clickResetPassword();
    }
    @Test
    public void lostPasswordWithInvalidUserName(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.clickLostYourPassword();
        loginSteps.clickUserNameLostYourPassword("teoborbe");
        loginSteps.clickResetPassword();
    }
    @Test
    public void rememberMeWithEmail(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe@yahoo.com");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickRememberMeButton();
    }
    @Test
    public void rememberMeWithUserName(){
        loginSteps.navigateToMyAccountPage();
        loginSteps.setUserNameAndEmail("teodoraborbe");
        loginSteps.setPassword("Parola.123!");
        loginSteps.clickRememberMeButton();
    }
}
