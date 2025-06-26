
Feature: Checking the contents in Search for jobs application
  As a NHS job seeker
  I need to be check the contents of the application
  So that I can search for jobs in search

  Scenario: Check the heading the Search page
    Given I navigate to the NHS Candidate Search page
    And the page correct heading should be "Search for jobs in the NHS"

  Scenario: Checking the working of Sign in button
    Given I navigate to the NHS Candidate Search page
    And I click on "Sign in Button"
    And the page correct heading should be "Sign in"

  Scenario: Clicking on the NHS Jobs Logo
    Given I navigate to the NHS Candidate Search page
    And I click on "NHS Logo Button"
    And the page correct heading should be "Apply on NHS Jobs"

  Scenario: Clicking on Create an account
    Given I navigate to the NHS Candidate Search page
    And I click on "Create an account"
    And the page correct heading should be "What is your name?"

  Scenario: Click on search link
    Given I navigate to the NHS Candidate Search page
    When I search for a job with "CV3 4DF" as the "Postcode"
    And I click on "search button"
    And I click on "search link"
    And the page correct heading should be "Search for jobs in the NHS"

  Scenario: Verify the search options on Search landing Screen
    Given I navigate to the NHS Candidate Search page
    And the page correct heading should be "Search for jobs in the NHS"
    When I tap on "More Search Options"
    Then I see all 6 search fields on search screen

  Scenario: Verify the search options on Search results Screen
    Given I navigate to the NHS Candidate Search page
    And the page correct heading should be "Search for jobs in the NHS"
    And I click on "search button"
    And I tap on "More Search Options"
    Then I see all 4 search fields on search screen



