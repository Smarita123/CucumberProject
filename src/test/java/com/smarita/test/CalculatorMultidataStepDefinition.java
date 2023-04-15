package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;
import org.junit.Assert;

public class CalculatorMultidataStepDefinition {

    private Integer int1, int2;
    private Integer result;
    Calculator calculator;

    @Given("If calculator add operation exists")
    public void if_calculator_add_operation_exists() {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
    }
    @When("Enter multiple input parameter {int},{int}")
    public void enter_multiple_input_parameter(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        this.int1=int1;
        this.int2=int2;
        result=calculator.add(int1,int2);
    }
    @Then("Add operation for multidata should return {int}")
    public void add_operation_for_multidata_should_return(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expected,result);
    }

    @Given("If calculator minus operation exists")
    public void if_calculator_minus_operation_exists() {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
    }
    @When("Enter multiple input parameter for minus {int},{int}")
    public void enter_multiple_input_parameter_minus(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        this.int1=int1;
        this.int2=int2;
        result=calculator.minus(int1,int2);
    }
    @Then("Minus operation for multidata should return {int}")
    public void minus_operation_for_multidata_should_return(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expected,result);
    }
}
