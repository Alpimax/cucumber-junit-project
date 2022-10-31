package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStepdefs {
    @Then("user should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown() {
    }

    @Given("user is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {
        System.out.println("clear");
    }

}
