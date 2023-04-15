Feature: As an user
  I want to receive an dynamic result appended with Hello

  Scenario Outline: Returns dynamic result
    Given If Service exists
    When  Enter multiple input parameter "<inputText>"
    Then  It should return the result for multiple inputs "<outputtext>"
    Examples:
      | inputText | outputtext     |
      | Silky     | Hello Silky    |
      | Cucumber  | Hello Cucumber |
      | Java      | Hello Java     |