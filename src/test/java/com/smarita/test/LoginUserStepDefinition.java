package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginUser;
import org.junit.Assert;

public class LoginUserStepDefinition {

    LoginUser loginuser;
    String result;

    @Given("If Login operation is done")
    public void if_login_operation_is_done() {
        // Write code here that turns the phrase above into concrete actions
        loginuser= new LoginUser();
    }
    @When("username and password is provided {string},{string}")
    public void username_and_password_is_provided(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        result=loginuser.valid(username,password);
    }
    @Then("It should return the message {string}")
    public void it_should_return_the_message(String expectedResult) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expectedResult,result);
    }



}
