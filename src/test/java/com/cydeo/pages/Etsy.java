package com.cydeo.pages;

import com.cydeo.methods.EtsyMethods;
import com.cydeo.utilities.Driver;
import io.cucumber.java.fr.Et;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy {
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchArea;

    @FindBy(xpath = "//button[@class = 'wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
    public WebElement singInButton;

    @FindBy(xpath = "(//button[@type= 'submit'])[1]")
    public WebElement searchAreaClick;



    public Etsy() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
