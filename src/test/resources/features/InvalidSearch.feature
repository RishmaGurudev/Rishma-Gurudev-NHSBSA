@search
Feature: Negative scenario
  As an NHS job seeker
  I want to use the search functionality with different options
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page
    And I tap on "More Search Options"

  Scenario Outline: Invalid
    When I search for a job with "<searchValue>" as the "<fieldType>"
    And I click on "search button"
    Then results should contain the word "<results>" in "search results"
    Examples:
    |searchValue|fieldType      |results            |
    |####       |Job Title      |No result found    |
    |CV333 4DDD |Postcode       |Location not found |
    |-----      |Jobreference   |No result found    |
    |&&&&&      |Employer       |No result found    |




