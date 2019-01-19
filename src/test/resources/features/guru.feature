@GuruLogin
Feature: Browsing on Guru Login Page
  Verify if steps can browse into Guru Page

  Scenario Outline: Logging In
    Given I am on the Login page
    When I fill in username with <user> and password with <pass>
    Then I should see the HomePage

    Examples:
      | user   | pass |
      | "1303" | "Guru99" |