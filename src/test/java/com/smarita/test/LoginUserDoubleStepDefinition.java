package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginUser;
import org.junit.Assert;

public class LoginUserDoubleStepDefinition {

    LoginUser loginuser;
    String result;

    @Given("If Login operation is done for double datatype")
    public void if_login_operation_is_done() {
        // Write code here that turns the phrase above into concrete actions
        loginuser= new LoginUser();
    }
    @When("username and password is provided {string},{double}")
    public void username_and_password_is_provided(String username, Double password) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Decimal val password ***"+password);
        //result=loginuser.valid(username,"password");
    }
    @Then("For double datatype It should return the message {string}")
    public void it_should_return_the_message(String expectedResult) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expectedResult,result);
    }




}
