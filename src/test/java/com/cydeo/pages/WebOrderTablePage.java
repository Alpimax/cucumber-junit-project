package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderTablePage {
    public WebOrderTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement orderButton;
    public WebElement productSelect;
    public WebElement quantity;
    public WebElement customerName;
	private WebElement webElement;
    public WebElement street;
    public WebElement city;
    public WebElement state;
    public WebElement zipCode;
    public WebElement cardType;
    public WebElement cardNumber;
    public WebElement inputCardExp;
    public WebElement processOrderButton;

}
