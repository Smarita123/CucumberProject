Feature: Cucumber hello dynamic text example

  Scenario: Returns Hello World when you pass world input parameter
    Given Enter input parameter "World"
    When print method of AppendAndPrint.java is called
    Then It should return "Hello World"

  Scenario: Returns Hello Lalu when you pass world input parameter
    Given Enter input parameter "Lalu"
    When print method of AppendAndPrint.java is called
    Then It should return "Hello Lalu"