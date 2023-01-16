package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Login;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CurrenciesStepDefinition {
    HomePage homePage = new HomePage();
    Login login = new Login();


    @Given("User go to Home page")
    public void validateHomePage() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/"));
    }
    @When("User select euro currency from drop down menu")
    public void selectEuroCurrency() {
        Select select = new Select(homePage.currencyDropDown());
        select.selectByVisibleText("Euro");
    }
    @Then("All items prices change to euro")
    public void validateAllPriceItemsChangedToEuro() {
        List<WebElement> itemsPrices = homePage.itemsPrices();
        for(WebElement itemPrice : itemsPrices){
            Assert.assertTrue(itemPrice.getText().contains("€"));
        }
    }
}
