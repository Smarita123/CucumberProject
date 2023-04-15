Feature: As an user I want to be able to Calculate Available Cucumbers using Data table

  Scenario: Returns Available Cucumbers when Total and Consumed is provided
    Given User enters Total and Consumed Cucumbers
      | 50 | 20 | 30 |
      | 100 | 90 | 10 |
    When  user clicks on Submit button
    Then  it should return  Available Cucumbers