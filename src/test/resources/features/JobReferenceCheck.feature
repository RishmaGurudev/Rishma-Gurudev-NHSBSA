
Feature: Job Reference Check
  As an NHS job seeker
  I want to use the Job reference search functionality
  So that I can find relevant jobs quickly and easily
  # As I cant test the working of the Job reference directly since the JobRefId is unknown
  #I first search for a Job with Jobtitle/skill and fetch the JobRefId from the first entry and test the working of Job reference
  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "Developer" as the "Job title"
    And I click on "search button"
    And I click first Job title and get the JobreferenceID
    When I tap on "More Search Options"
    And I search for a job with "Job Reference ID" as the "Job reference"
    Then results should contain the same title


