Feature: Cucumber hello dynamic text example

  Scenario: Returns the sum when you pass two numbers
    Given Enter input parameter for plus 100, 50
    When add method of Calculator.java is called
    Then Add operation should return 150

  Scenario: Returns the subtraction when you pass two numbers
    Given Enter input parameter for minus 100, 50
    When minus method of Calculator.java is called
    Then Minus operation should return 50