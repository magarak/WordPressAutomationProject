package com.wordpress.stepdefinitions;

import com.wordpress.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefinition extends DriverFactory {

    @Given("open wordpress application")
    public void openWordpressApplication() {
        driver.get("https://wordpress.com/");
    }

    @When("click on login link")
    public void clickOnLoginLink() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"lpc-header-nav\"]/div/div/div[1]/div/nav/ul[2]/li[1]/a"));
        element.click();
    }

    @Then("login page should appear")
    public void loginPageShouldAppear() {
        boolean result;
        try {
            WebElement element = driver.findElement(By.id("usernameOrEmail"));
            result = element.isDisplayed();
        } catch (Exception e) {
            result = false;
        }
        Assert.assertTrue(result);
    }

    @When("enter user name {string}")
    public void enterUserName(String userName) {
        WebElement element = driver.findElement(By.id("usernameOrEmail"));
        element.clear();
        element.sendKeys(userName);
    }

    @When("click on continue button")
    public void clickOnContinueButton() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
        element.click();
    }

    @When("enter password {string}")
    public void enterPassword(String password) {
        WebElement element = driver.findElement(By.id("password"));
        element.clear();
        element.sendKeys(password);
    }

    @When("click on login button")
    public void clickOnLoginButton() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
        element.click();
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
    }

}
