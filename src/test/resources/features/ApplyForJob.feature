
Feature: Apply for Job
  As a NHS job seeker
  I need to be able to search and find a relevant Job
  So that I can click and apply for the job

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "Java" as the "Skills"
    And I click on "search button"
    And I select the Job to apply
    And the page correct heading should be "You are leaving NHS Jobs"
