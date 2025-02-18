Feature: Access Solutions Dropdown Menu
  As a user
  I want to access all options under the "Solutions" dropdown menu in the main navigation bar
  So that I can easily navigate to relevant sections of the website

  Scenario: Dropdown Visibility
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu in the main navigation bar
    Then I should see the options "Automotive," "Lifestyle," "Consumer," "Professional," and "Digital Transformation Solutions"

  Scenario: Option Navigation
    Given I am on the homepage
    When I click on the "Solutions" dropdown menu in the main navigation bar
    And I click on the "Automotive" option
    Then I should be navigated to the "Automotive" section

  Scenario: Dropdown Dismissal by clicking outside
    Given I have opened the "Solutions" dropdown menu
    When I click outside the dropdown menu
    Then the dropdown menu should close

  Scenario: Dropdown Dismissal by interacting with other navigation items
    Given I have opened the "Solutions" dropdown menu
    When I click on another navigation item
    Then the dropdown menu should close