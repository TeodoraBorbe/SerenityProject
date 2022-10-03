package org.fasttrack.features.search;

import org.junit.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void loginAndLogout(){
        loginSteps.doLogin("teodoraborbe@yahoo.com", "Parola.123!");
        logoutSteps.clickLogoutButton();
    }
}
