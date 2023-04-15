package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginUser;
import org.junit.Assert;

import java.util.List;

public class LoginUsingDataTableStepDefinition {
    String username, password, expectedMessage, actualMessage;
    LoginUser loginuser;

    @Given("User enters Username and Password in Login page")
    public void user_enters_username_and_password_in_login_page(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> rowsList = dataTable.asLists();
        for(List<String> row: rowsList) {
            username=row.get(0);
            password=row.get(1);
            expectedMessage=row.get(2);
            System.out.println(username+" "+password+" "+expectedMessage);

        }


    }
    @When("Student clicks on Submit button")
    public void student_clicks_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        loginuser=new LoginUser();
        actualMessage=loginuser.valid(username,password);

    }
    @Then("it should return  Login Successful or Login Failed")
    public void it_should_return_login_successful_or_failed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
