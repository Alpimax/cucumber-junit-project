package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");
    }
	private WebElement webElement;


    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("It is from When");
    }

    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }
}
