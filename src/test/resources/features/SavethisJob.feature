@search
Feature: Search and save the job
  As an NHS job seeker
  I want to use the search functionality and save the job
  So that I can find relevant jobs in the saved Job option

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I save the job from search result
    And the page correct heading should be "Sign in"

