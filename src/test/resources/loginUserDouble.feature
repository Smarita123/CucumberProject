Feature: User Login for Double datatype

  Scenario Outline: Authenticates and Returns Login Successful or Failed for decimal values
    Given If Login operation is done for double datatype
    When  username and password is provided "<username>",<password>
    Then  For double datatype It should return the message "<result>"
    Examples:
      | username | password | result |
      | Silky | 12.00 | Login Failed |
