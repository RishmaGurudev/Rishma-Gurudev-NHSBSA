@search
Feature: Search and save the search
  As an NHS job seeker
  I want to use the search functionality and save the search
  So that I can find relevant in the saved searches

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Save this search button
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I click on "save this search button"
    And the page correct heading should be "Sign in"