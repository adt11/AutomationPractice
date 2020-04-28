@Smoke
Feature: Navigation to the Home Page

  Background: Navigation to the Home Page
    Given I open the URL "http://automationpractice.com/"

  @Contact-Us
  Scenario: I validate the contact us functionality
    When I click on contact us button
    Then I should see the title of the page "Contact us - My Store"

  @Login-MyStore
  Scenario: I validate the Sign In functionality
    When I click on Sign In button
    Then I should see the title of the page "Login - My Store"

  @Women-Menu
  Scenario: I validate Submenu of Women Menu functionality
    When I move to the Women Menu
    And I click on Tops Link
    Then I should see the title of the page "Tops - My Store"
    When I move to the Women Menu
    And I click on Dresses Link
    Then I should see the title of the page "Dresses - My Store"
    When I move to the Women Menu
    And I click on TShirts Link
    Then I should see the title of the page "T-shirts - My Store"
    When I move to the Women Menu
    And I click on Blouses Link
    Then I should see the title of the page "Blouses - My Store"
    When I move to the Women Menu
    And I click on Casual Dresses Link
    Then I should see the title of the page "Casual Dresses - My Store"
    When I move to the Women Menu
    And I click on Evening Dresses Link
    Then I should see the title of the page "Evening Dresses - My Store"
    When I move to the Women Menu
    And I click on Summer Dresses Link
    Then I should see the title of the page "Summer Dresses - My Store"

  @Dresses-Menu
  Scenario: I validate Submenu of Dresses Menu functionality
    When I move to the Dresses Menu
    And I click on Casual Dresses submenu
    Then I should see the title of the page "Casual Dresses - My Store"
    When I move to the Dresses Menu
    And I click on Evening Dresses submenu
    Then I should see the title of the page "Evening Dresses - My Store"
    When I move to the Dresses Menu
    And I click on Summer Dresses submenu
    Then I should see the title of the page "Summer Dresses - My Store"

  @TShirts-Menu
  Scenario: I validate TShirts Menu functionality
    When I move to the TShirts Menu
    Then I should see the title of the page "T-shirts - My Store"
