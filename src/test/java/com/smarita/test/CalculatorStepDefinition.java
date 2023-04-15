package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;
import org.junit.Assert;

public class CalculatorStepDefinition {
    private Calculator calculator = new Calculator();
    private Integer no1,no2 = 0;
    private Integer output = 0;
    @Given("Enter input parameter for plus {int}, {int}")
    public void enter_input_parameter_for_plus(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        this.no1 = int1;
        this.no2 = int2;
    }
    @When("add method of Calculator.java is called")
    public void add_method_of_calculator_java_is_called() {
        // Write code here that turns the phrase above into concrete actions
        output = calculator.add(no1,no2);
    }
    @Then("Add operation should return {int}")
    public void it_should_return(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(output, int1);
    }

    @Given("Enter input parameter for minus {int}, {int}")
    public void enter_input_parameter_for_minus(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        this.no1 = int1;
        this.no2 = int2;
    }
    @When("minus method of Calculator.java is called")
    public void minus_method_of_calculator_java_is_called() {
        // Write code here that turns the phrase above into concrete actions
        output = calculator.minus(no1,no2);
    }

    @Then("Minus operation should return {int}")
    public void it_should_return1(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(output, int1);
    }

}