Feature: As an user I want to be able to register Students

  Scenario: Returns Registration Successful when student is created
    Given Student enters student registration details in registration page
      | John | Doe    | john@gmail.com | bhubaneswar | 8 | Registration Successful |
      | Ken     | Chan | ken@gmail.com   | bangalore   | 9 | Registration Successful |
      |      |  | ken@gmail.com   | bangalore   | 9 | NOT Registered |
    When  Student clicks on register button
    Then  it should return  Registration Successful or NOT Registered