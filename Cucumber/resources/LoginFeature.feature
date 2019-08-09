Feature: Login Functionality

  
@Login
  Scenario Outline: Login with valid credentials
    Given Navigate to home page
    When user enters "<username>" and "<password>"
    Then user logged in successfully

 Examples: 
    |username| |password|
    |Admin   | |password456|
    |Lalitha | |password123|

  @case4
  Scenario: The one where user picks different product through search search functionaliy
    When Lalitha searches below products in the search box
      | Head   |
      | Travel |
      | Laptop |
    Then product should be added in the cart if available
    
    
    @case4
    Scenario: Payment
    When User opens the cart
    And User clicks checkout button
    And User fills address and proceeds to pay button
    Then Payment is Successful
    
