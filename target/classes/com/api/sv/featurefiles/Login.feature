Feature: User Login Feature

  Scenario: User Login Scenario
    Given User is at the login page of the application
    When User with following username and password
      | UsernameOne   | PasswordOne   |
      | UsernameTwo   | PasswordTwo   |
      | UsernameThree | PasswordThree |
      | UsernameFour  | PasswordFour  |
      
      
Then User should be able to login with correct username and password
