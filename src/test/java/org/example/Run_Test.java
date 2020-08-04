package org.example;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features=".",tags = "@positive,@negative",format = {"pretty","html:target/Destination"})

public class Run_Test {
}
