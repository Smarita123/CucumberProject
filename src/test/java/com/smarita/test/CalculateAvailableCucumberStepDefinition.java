package com.smarita.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Cucumbers;
import org.junit.Assert;

import java.util.List;

public class CalculateAvailableCucumberStepDefinition {

    int total, consumed, expectedOutput, actualOutput;
    Cucumbers cucumbers;

    @Given("User enters Total and Consumed Cucumbers")
    public void user_enters_total_and_consumed_cucumbers(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions

        List<List<Integer>> rowsList = dataTable.asLists(Integer.class);
        for(List<Integer> row: rowsList) {
            total=row.get(0);
            consumed=row.get(1);
            expectedOutput=row.get(2);
            System.out.println(total+" "+consumed+" "+expectedOutput);

        }
    }
    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        cucumbers=new Cucumbers();
        actualOutput=cucumbers.calculateAvailable(total, consumed);


    }
    @Then("it should return  Available Cucumbers")
    public void it_should_return_available_cucumbers() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expectedOutput,actualOutput);

    }
}
