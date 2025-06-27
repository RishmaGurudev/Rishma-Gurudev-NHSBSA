@search
Feature: Filter the jobs based on sort filter search
  As an NHS job seeker
  I want to use the sort filter to sort the job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Sort the jobs based on sort filter search
    When I search for a job with "Java" as the "job title"
    And I click on "search button"
    And I filter the search result for "sort filter" "<sortfilter>"
    Then I can see search result for "sort" "<sortfilter>" filter
    Examples:
      |sortfilter                |
      | Best Match               |
      | Closing Date             |
      | Salary lowest to highest |
      | Salary highest to lowest |

    Scenario Outline: Check if the sort by option shows distance option
      When I search for a job with "CV31" as the "postcode"
      And I click on "search button"
      And I filter the search result for "sort filter" "<sortfilter>"
      Then I can see search result for "sort" "<sortfilter>" filter
      Examples:
        |sortfilter                |
        | Distance                 |


