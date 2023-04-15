Feature: User should be able to retrieve Company name

  Scenario Outline: Returns company name of a customer
    Given If customer exists
    When  Enter multiple input parameter for Name and City "<inputText1>","<inputText2>"
    Then  It should return the Company name "<outputtext>"
    Examples:
      | inputText1 | inputText2 | outputtext |
      | Silky | Mumbai | Paymentz |
      | Lalatendu | Bhubaneswar | TechM |
