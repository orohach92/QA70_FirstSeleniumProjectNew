package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.sconto.pages.HomePage.baseUrl;

public class HomePageSteps {
    HomePage home;
    LoginPage login;

    @Given("User is on HomePage")
    public void is_on_HomePage(){
        home = open(baseUrl, HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }
    @When("User clicks on Login icon")
    public void user_clicks_on_Login_icon(){
        home.clickOnLoginIcon();
    }
    @Then("User verifies Login Form is displayed")
    public void verify_Login_Form_is_displayed(){
        login = Selenide.page(LoginPage.class);
        login.verifyLoginTitle();
    }
}
