package com.redbus.practiceDemo;

import org.testng.annotations.DataProvider;

public class MyDP {
    @DataProvider(name = "data")
    public static Object[][] getData() {
        return new Object[][]{
                {"Sunil"}, {"Bhanu"}
        };
    }

}
