Feature: To validate login function
 

 
  Scenario: To validate login function with valid username and valid password
    Given User launch the browser and navigates to facebook app
   
    When User enters the Credentials in facebook app
    And User clicks the login button
    Then User validates the error message
    
     Scenario Outline: To validate login function with combination of all credentials
    Given User launch the browser and navigates to facebook app
   
    When User enters the "<UserName>" and "<Password>"in facebook app
    And User clicks the login button
    Then User validates the error message
    Examples:
    |UserName|Password|
    |qwert   |sdfgh   |
    |!@#$    |123456  |
    |123456  |asdfgh  |
    