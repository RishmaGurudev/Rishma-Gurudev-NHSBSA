
Feature: Search and save the job
  As an employer
  I need to be able to search and save the job
  So that candidates can have this in their Saved Jobs

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I save the job from search result
    And the page correct heading should be "Sign in"

