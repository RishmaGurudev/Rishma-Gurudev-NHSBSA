@search
Feature: Filter the contract type jobs in search
  As an NHS job seeker
  I want to use the covid filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Filter the covid related jobs in search result
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for covid related jobs
    Then I can see search result for covid jobs