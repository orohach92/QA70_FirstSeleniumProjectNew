package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

    HomePage home;
    LoginPage login;

    @And("User enters valid data")
    public void user_enters_valid_data(){
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User click on Anmelden button")
    public void user_click_on_Anmelden_button(){
        login.clickOnAnmelden();
    }

    @And("User click on User icon")
    public void user_click_on_User_icon(){
        home = Selenide.page(HomePage.class);
        home.clickOnStatusLogin();
    }
    @Then("User verifies his name")
    public void verify_User_name(){
        login.verifyName();
    }

    @And("User enters invalid email and correct password")
    public void user_enters_invalid_email_and_correct_password(){
        login = Selenide.page(LoginPage.class);
        login.enterDataNegative("wrong@gmail.com","zw82A&usgNBkeW@");
    }

    @And("User click on Anmelden button Negative")
    public void user_click_on_Anmelden_button_negative(){
        login.clickOnAnmeldenNegative();
    }

    @Then("User verifies error message is displayed")
    public void user_verifies_error_message_is_displayed(){
        login.verifyLoginErrorMessage();
    }

}
