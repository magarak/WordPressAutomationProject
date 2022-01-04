package com.wordpress.stepdefinitions;

import com.wordpress.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {

    @Before
    public void setup() {
        initializeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
        driver = null;
    }

}
