package com.mohan.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginShouldOpenInventory() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(
            loginPage.isInventoryVisible(),
            "Expected inventory page to be visible after valid login"
        );
    }

    @Test
    public void invalidPasswordShouldShowError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("standard_user", "wrong_password");

        Assert.assertTrue(
            loginPage.getErrorMessage().toLowerCase().contains("username and password"),
            "Expected an error message for invalid credentials"
        );
    }

    @Test
    public void emptyCredentialsShouldShowError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("", "");

        Assert.assertTrue(
            loginPage.getErrorMessage().toLowerCase().contains("username is required"),
            "Expected a validation message for empty credentials"
        );
    }
}
