
Feature: Clear Filter
  As an NHS job seeker
  I want to use the clear filter.
  So that I see the all fields data are cleared

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: To clear the search fields data
    When I tap on "More Search Options"
    And I search for a job with "Developer" as the "job title"
    And I search for a job with "CV3 4DF" as the "Postcode"
    And I search for a job with "E0123-25-0175" as the "jobreference"
    And I search for a job with "NHS" as the "Employer"
    And I search for a job with "£0 to £10,000" as the "Pay Range"
    And I click on "clear filters button"
    And I tap on "More Search Options"
    Then I see the all fields data are cleared

  Scenario: To clear the selected filter option
    When I tap on "More Search Options"
    And I search for a job with "Developer" as the "job title"
    And I click on "search button"
    And I filter the search result for "working pattern" "Term time hours"
    And I filter the search result for "contract type" "Bank"
    And I filter the search result for "staff group" "Students"
    And  I click on "clear filters link"
    Then I see the all the checkboxes are deselected