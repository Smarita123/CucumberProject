Feature: Calculator multidata example

  Scenario Outline: Returns the sum each time you pass two numbers
    Given If calculator add operation exists
    When Enter multiple input parameter <input1>,<input2>
    Then Add operation for multidata should return <output>
    Examples:
      | input1 | input2 | output |
      | 100 | 50 | 150 |
      | 30 | 20 | 50 |
      | 22 | 77 | 99 |


  Scenario Outline:Returns the subtraction each time you pass two numbers
    Given If calculator minus operation exists
    When Enter multiple input parameter for minus <input1>,<input2>
    Then Minus operation for multidata should return <output>
    Examples:
      | input1 | input2 | output |
      | 50 | 20 | 30 |
      | 100 | 35 | 65 |
