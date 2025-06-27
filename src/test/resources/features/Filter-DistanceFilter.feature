@search
Feature: Distance Filter
  As an NHS job seeker
  I want to use the distance filter
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario:Distance filter
    When I search for a job with "CV3 4DF" as the "Postcode"
    And I search for a job with "+5 Miles" as the "Distance"
    And I click on "search button"
    And I filter the search result for "pay range" "£80,000 to £90,000"
    And I search for a job with "+10 Miles" as the "Distance"
    Then I can see search result where the Distance is less than "10 Miles"


