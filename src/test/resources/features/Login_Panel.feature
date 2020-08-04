Feature: login feature


  @positive
  Scenario: user should be Login successfully,
  so that user can use all functionality on website
   Given user is on login page
    When User enter enter valid credentials
    Then User should be Login successfully

  @negative
  Scenario Outline: User should not able to login with invalid credentials
     Given user is on login page
    When User enter invalid userName "<UserName>"
    And User enter invalid password "<Password>"
    And User click on login Button
    Then Use should not be able to login successfully with "<receive massage>"
    Examples:
      | UserName | Password | receive massage          |
      | admin    | Admin123 | Invalid credentials      |
      |          | admin123 | Username cannot be empty |
      | Admin    |          | Password cannot be empty |

