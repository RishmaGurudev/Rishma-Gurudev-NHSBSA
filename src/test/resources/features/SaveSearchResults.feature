
Feature: Search and save the search
  As an employer
  I need to be able to search and save the search
  So that candidates can have this in their Saved searches

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I click on "save this search button"
    And the page correct heading should be "Sign in"