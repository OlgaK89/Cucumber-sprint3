Feature: Login


@dashboard
  Scenario: Confirm proceeding to next page after login

   Given I am on login page
    When I insert login information
    Then I should move to next page
