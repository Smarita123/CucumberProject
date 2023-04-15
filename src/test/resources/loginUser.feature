Feature: User Login

  Scenario Outline: Authenticates and Returns Login Successful or Failed
    Given If Login operation is done
    When  username and password is provided "<username>","<password>"
    Then  It should return the message "<result>"
    Examples:
      | username | password | result |
      | Silky | Silky123 | Login Successful |
      | silky | password | Login Failed |
      | silky | 12.34 | Login Failed |