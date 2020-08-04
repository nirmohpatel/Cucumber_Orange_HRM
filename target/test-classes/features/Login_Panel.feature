Feature: login feature


  @sun
  Scenario: user should be Login successfully,
  so that user can use all functionality on website
   Given user is on login page
    When User enter enter valid credentials
    Then User should be Login successfully

   @moon
  Scenario Outline: User should not able to login with invalid credentials
     Given user is on login page
    When User enter invalid userName "<UserName>"
    And User enter invalid password "<Password>"
    And User click on login Button
    Then Use should not be able to login successfully with "<receive massage>"
    Examples:
      | UserName | Password | receive massage          |
      | admin    | Admin123 | Invalid credentials      |
    #  |          |          | Username cannot be empty |
      |          | admin123 | Username cannot be empty |
      | Admin    |          | Password cannot be empty |
      #| Admin    | Admin123 | Invalid credentials      |
      #| admin    | admin123 | Invalid credentials      |