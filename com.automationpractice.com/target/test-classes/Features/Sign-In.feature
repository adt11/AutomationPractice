@Login-Register @Smoke
Feature: Check Login and Register functionality
  I want to login with email id and password
  I want to register new user by entering fields

  Background: Navigation to the Home Page
    Given I open the URL "http://automationpractice.com/"
    And I click on Sign In button

  @Login-Positive
  Scenario: Validate user should login with valid credentials
    When I enter valid user name and password
      | qa07test1957@gmail.com |
      | Qwerty@12              |
    And I click on Log In button
    Then I should able to see sign out button
    And I click on Log Out button
    And I should back to login page successfully

  @Forgot-Positive
  Scenario: Validate user forgot with registered email id
    When I click on forgot link
    And I enter registered user name
      | qa07test1957@gmail.com |
    And I click retrive password button
    And Message should be "A confirmation email has been sent to your address: qa07test1957@gmail.com"

  @Login-Negative
  Scenario: Validate user should not login with invalid credentials
    When I enter valid user name and password
      | qa09test1957@gmail.com |
      | Qwerty@12              |
    And I click on Log In button
    Then Error message should appear "Authentication failed."

  @Forgot-Negative
  Scenario: Validate user forgot with not registered email id
    When I click on forgot link
    And I enter registered user name
      | qa09test1957@gmail.com |
    And I click retrive password button
    And Error message should appear "There is no account registered for this email address."
