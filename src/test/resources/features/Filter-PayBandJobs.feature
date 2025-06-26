
Feature: Filter the pay grade and scheme based jobs in search
  As an NHS job seeker
  I want to use the pay grade and scheme filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Pay band & scheme filter
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for "pay scheme grade" "<paySchemeGrade>"
    Then I can see search result for "pay scheme grade" "<paySchemeGrade>" filter
    Examples:
      | paySchemeGrade      |
      | Band 2              |
      | Band 3              |
      | Band 4              |
      | Band 5              |
      | Band 6              |
      | Band 7              |
      | Band 8a             |
      | Band 8b             |
      | Band 8c             |
      | Band 8d             |
      | specialty doctor    |
      | foundation doctor   |
      | consultant          |
      | specialty registrar |
      | doctor - other      |
      | specialist          |

