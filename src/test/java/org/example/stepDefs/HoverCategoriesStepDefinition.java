package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HoverCategoriesStepDefinition {
    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();

    String subCategory;


    @When("User hover to a category and click on one of its subcategories")
    public void hoverThenClickOnSubcategory() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(homePage.electronicsMainCategory()).
                moveToElement(homePage.electronicsMainCategory()).build().perform();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(homePage.electronicsMainCategory()));
        subCategory = homePage.cellPhonesSubCategory().getText().toLowerCase().trim();
        System.out.println("***************" + subCategory + "*********************");
        actions.moveToElement(homePage.electronicsMainCategory()).
                moveToElement(homePage.cellPhonesSubCategory())
                .click().build().perform();

    }

    @Then("User should be navigated to a page contains products about that subcategory")
    public void subcategoryResults() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("cell-phones"));
        softAssert.assertEquals(homePage.subCategoryPageTitle().getText(), "Cell phones");
        softAssert.assertTrue(homePage.subCategoryPageTitle().getText().
                toLowerCase().equals(subCategory));
        softAssert.assertAll();

    }
}
