package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup() {
        System.out.println("This one before method that will run before method");
    }

    @After
    public void tearDown() {
        System.out.println("This one after method that will run after method");
    }
}
