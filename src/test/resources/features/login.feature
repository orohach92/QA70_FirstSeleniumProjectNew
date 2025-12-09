Feature: Login
  @LoginPositive
  Scenario: Successful login
    Given User is on HomePage
    When User clicks on Login icon
    #Then User verifies Login Form is displayed
  And User enters valid data
    And User click on Anmelden button
    And User click on User icon
    Then User verifies his name

  @LoginWrongEmail
  Scenario: Unsuccessful login
    Given User is on HomePage
    When User clicks on Login icon
    And User enters invalid email and correct password
    And User click on Anmelden button Negative
    Then User verifies error message is displayed