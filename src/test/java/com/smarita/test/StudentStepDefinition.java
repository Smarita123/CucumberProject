package com.smarita.test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Student;
import org.junit.Assert;

import java.util.List;

public class StudentStepDefinition {

    String fName,lName,email,city,standard;
    Student obj=new Student();
    String expectedMessage,message;

    @Given("Student enters student registration details in registration page")
    public void student_enters_student_registration_details_in_registration_page(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> rowsList = dataTable.asLists();
        for(List<String> row: rowsList) {
            fName=row.get(0);
            lName=row.get(1);
            email=row.get(2);
            city=row.get(3);
            standard=row.get(4);
            System.out.println(fName+" "+lName+" "+email+" "+city+" "+standard);
            expectedMessage=row.get(5);
        }

    }
    @When("Student clicks on register button")
    public void student_clicks_on_register_button() {
        System.out.println("Line 35"+" "+fName+" "+lName+" "+email+" "+city+" "+standard);

            message =obj.createStudent(fName,lName,email,city, standard);


    }
    @Then("it should return  Registration Successful or NOT Registered")
    public void it_should_return_registration_successful_or_not_registered() {

        Assert.assertEquals(expectedMessage,message);


    }



}
