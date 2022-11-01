package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OzkanlarGroup {


    public OzkanlarGroup() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='about-us-post']/a")
    public List<WebElement> hizmetler;

    @FindBy(xpath = "(//div[@class='about-us-post']/a)[1]")
    public WebElement importExport;
    @FindBy(xpath = "(//div[@class='about-us-post']/a)[2]")
    public WebElement clearance;
    @FindBy(xpath = "(//div[@class='about-us-post']/a)[3]")
    public WebElement storage;
    @FindBy(xpath = "(//div[@class='about-us-post']/a)[4]")
    public WebElement logistics;
    @FindBy(xpath = "(//div[@class='about-us-post']/a)[5]")
    public WebElement car;
    @FindBy(xpath = "(//div[@class='about-us-post']/a)[6]")
    public WebElement realEstate;
}
