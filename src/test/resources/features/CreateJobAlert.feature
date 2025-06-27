@search
Feature: Create the Job Alert for the search
  As a NHS job seeker
  I need to search and create the alert for the same
  So that I can have this as an alert

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I click on "create alert button"
    And the page correct heading should be "Sign in"