
Feature: Checking the hidden button or link in Search for jobs application
  As a NHS job seeker
  I need to be check the hidden feature of the application
  So that I can search for jobs in search

  Scenario: Check the hidden feature of Save this search
    Given I navigate to the NHS Candidate Search page
    And the page correct heading should be "Search for jobs in the NHS"
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    And I "can" see Save the search option
    And I click on "search link"
    And I click on "search button"
    And I "can't" see Save the search option
  @search
  Scenario: Check the hidden feature of distance filter
    Given I navigate to the NHS Candidate Search page
    And the page correct heading should be "Search for jobs in the NHS"
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    And I "can't" see the distance filter
    And I click on "search link"
    And I search for a job with "CV3" as the "postcode"
    And I click on "search button"
    And I "can" see the distance filter
