
Feature: Filter the pay range based jobs in search
  As an NHS job seeker
  I want to use the pay range filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Pay Range Filter
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for "pay range" "<payrangetype>"
    Then I can see search result for "pay range" "<payrangetype>" filter
    Examples:
      |payrangetype      |
      |£0 to £10,000     |
      |£10,000 to £20,000|
      |£20,000 to £30,000|
      |£30,000 to £40,000|
      |£40,000 to £50,000|
      |£50,000 to £60,000|
      |£60,000 to £70,000|
      |£70,000 to £80,000|
      |£80,000 to £90,000|
      |£90,000 to £100,000|
      |£100,000 plus      |


