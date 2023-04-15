package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HelloService;
import org.junit.Assert;

public class HelloServiceMultidataDefinition {
    private String response;
    private HelloService hello;

    @Given("If Service exists")
    public void service_exists() {
        // Write code here that turns the phrase above into concrete actions
        hello = new HelloService();
    }
    @When("Enter multiple input parameter {string}")
    public void enter_input_parameter_silky(String value) {
        // Write code here that turns the phrase above into concrete actions
        response = hello.print(value);
    }
    @Then("It should return the result for multiple inputs {string}")
    public void it_should_return_the_result(String output) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(output,response);
    }

}