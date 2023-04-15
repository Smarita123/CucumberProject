Feature: As an user I want to be able to login successfully using Data table

  Scenario: Returns Login Successful or Failed when Username and password is submitted
    Given User enters Username and Password in Login page
      | Silky | Silky123    | Login Successful |
      | Silky | Invalid | Login Failed |
      | Invalid | Silky123 | Login Failed |
    When  Student clicks on Submit button
    Then  it should return  Login Successful or Login Failed