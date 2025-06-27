@search
Feature: Filter for working pattern job types
  As an NHS job seeker
  I want to use the working pattern filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Filter the working pattern jobs in search result
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for "working pattern" "<workingPattern>"
    Then I can see search result for "working pattern" "<workingPatternType>" filter
    Examples:
      |workingPattern         |workingPatternType     |
      | full-time             |Full time              |
      | part-time             |Part time              |
      | job share             |Job-share              |
      | home or remote working|Home or remote working |
      | compressed hours      |Compressed hours       |
      | term time hours       |Term time hours        |
      | annualised hours      |Annualised hours       |