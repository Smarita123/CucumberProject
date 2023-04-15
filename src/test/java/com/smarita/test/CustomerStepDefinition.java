package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Customer;
import org.junit.Assert;

public class CustomerStepDefinition {

    Customer customer;
    String name, city, company;

    @Given("If customer exists")
    public void if_customer_exists() {
        // Write code here that turns the phrase above into concrete actions
        customer=new Customer();
        customer.createCustomer();

    }
    @When("Enter multiple input parameter for Name and City {string},{string}")
    public void enter_multiple_input_parameter_for_name_and_city(String name, String city) {
        // Write code here that turns the phrase above into concrete actions
        company=customer.getCompany(name,city);

    }
    @Then("It should return the Company name {string}")
    public void it_should_return_the_company_name(String expected) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expected,company);
    }
}
