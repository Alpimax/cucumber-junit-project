package com.cydeo.methods;

import com.cydeo.pages.Etsy;
import com.cydeo.utilities.Driver;



public class EtsyMethods extends Etsy  {


    public void driver(){
        Driver.getDriver().get("https://www.etsy.com/");
    }

    public void sendKey() {
   searchArea.sendKeys("Woodspoon");
    }

    public void searchButton() {

    }
}
