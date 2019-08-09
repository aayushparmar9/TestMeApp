Feature: Register Casestudy

  @Register
  Scenario: User Registration
    Given Navigate to the home page
    When User clicks on signup button
    When user enters user name as "abc"
    When user enters first name as "fname"
    When user enters last name as "lname"
    When user enters password as "1234"
    When user enters confirm password as "1234"
    When user enters gender as "Male"
    When user enters email as "abc@gmail.com"
    When user enters mobile number as "9876543219"
    When user enters DOB as "18/10/1997"
    When user enters address as "Mumbai"
    And user selects security question as "What is your favour color?" and user selects security answer as "Red"
    And User clicks on Register

    
    
    
    