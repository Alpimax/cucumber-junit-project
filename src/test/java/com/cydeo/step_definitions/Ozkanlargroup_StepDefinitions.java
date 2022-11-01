//package com.cydeo.step_definitions;
//
//import com.cydeo.pages.ozkanlargroup_page.OzkanlarGroup;
//import com.cydeo.utilities.Driver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebElement;
//
//public class Ozkanlargroup_StepDefinitions {
//    OzkanlarGroup ozkanlarGroup = new OzkanlarGroup();
//
//    @Given("user should see dashboard {int} diffrent servies")
//    public void user_should_see_dashboard_diffrent_servies(Integer int1) {
//        System.out.println("User on homepage");
//
//    }
//
//    @When("user goes homepage")
//    public void user_goes_homepage() {
//        System.out.println("User on homepage");
//    }
//
//    @When("user should see homepage")
//    public void user_should_see_homepage() {
//        for (WebElement each: ozkanlarGroup) {
//            System.out.println(each.getText());
//        }
//    }
//
//    @When("user should see importExport")
//    public void user_should_see_import_export() {
//        ozkanlarGroup.importExport.click();
//        System.out.println(ozkanlarGroup.importExport.getText());
//    }
//
//    @When("user should see clearance")
//    public void user_should_see_clearance() {
//        ozkanlarGroup.clearance.click();
//        System.out.println(ozkanlarGroup.clearance.getText());
//    }
//
//    @When("user should see storage")
//    public void user_should_see_storage() {
//        ozkanlarGroup.storage.click();
//        System.out.println(ozkanlarGroup.storage.getText());
//    }
//
//    @When("user should see logistics")
//    public void user_should_see_logistics() {
//        ozkanlarGroup.logistics.click();
//        System.out.println(ozkanlarGroup.logistics.getText());
//    }
//
//    @When("user should see realEstate")
//    public void user_should_see_real_estate() {
//        ozkanlarGroup.realEstate.click();
//        System.out.println(ozkanlarGroup.realEstate.getText());
//    }
//}
