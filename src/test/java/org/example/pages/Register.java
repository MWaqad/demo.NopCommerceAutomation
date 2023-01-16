package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class Register {

    public WebElement registerLink(){
        By registerLink = By.className("ico-register");
        return driver.findElement(registerLink);
    }

    public WebElement genderCheckBox() {
        By genderCheckBox = By.id("gender-male");
        return driver.findElement(genderCheckBox);
    }

    public WebElement FirstNameTxtField() {
        By insertFirstName = By.id("FirstName");
        return driver.findElement(insertFirstName);
    }

    public WebElement LastNameTxtField() {
        By insertLastName = By.id("LastName");
        return driver.findElement(insertLastName);
    }

    public WebElement birthDayDropDown() {
        By selectBirthDay = By.name("DateOfBirthDay");
        return driver.findElement(selectBirthDay);
    }

    public WebElement BirthMonthDropDown() {
        By selectBirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(selectBirthMonth);
    }

    public WebElement BirthYearDropDown() {
        By selectBirthYear = By.name("DateOfBirthYear");
        return driver.findElement(selectBirthYear);
    }

    public WebElement emailAddressTxtField() {
        By emailAddressTxtField = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtField);
    }

    public String validEmail() {
        return "test121080568@example.com";
    }

    public WebElement passwordTxtField() {
        By passwordTxtField = By.id("Password");
        return driver.findElement(passwordTxtField);
    }

    public String validPassword() {
        return "Test@1234";
    }

    public WebElement confirmPassTxtField() {
        By confirmPassTxtField = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtField);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement successMsg() {
        By successMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(successMsg);
    }

}
