
Feature: End-to-End Job Search
  As an NHS job seeker
  I want to use the search functionality with both basic and advanced options
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Basic search for Developer jobs in London
    When I search for a job with "Developer" as the "job title"
    And I enter "London" as the "location"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"

  Scenario: Advanced search for Developer jobs in London
    When I tap on "More Search Options"
    And I search for a job with "Developer" as the "job title"
    And I enter "Newcastle Upon Tyne" as the "location"
    And I enter "NHS Business Services Authority" as the "Employer"
    And I select pay range as "30-40" thousand
    And I click on "search button"
    Then results should contain the word "NHS Business Services Authority" in "Employer"
