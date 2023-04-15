package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HelloService;
import org.junit.Assert;

public class HelloDynamicTextStepDefintion {

    private HelloService helloService = new HelloService();
    private String name = "";
    private String output = "";
    @Given("Enter input parameter {string}")
    public void enter_input_parameter(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.name = string;
    }
    @When("print method of AppendAndPrint.java is called")
    public void print_method_of_append_and_print_java_is_called() {
        // Write code here that turns the phrase above into concrete actions
        output = helloService.print(name);
    }
    @Then("It should return {string}")
    public void it_should_return(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(output, string);
    }

}
