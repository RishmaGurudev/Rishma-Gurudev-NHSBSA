
Feature: Job Search
  As an NHS job seeker
  I want to use the search functionality with both basic and advanced options
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: To clear the search fields data
    When I tap on "More Search Options"
    And I search for a job with "<What>" as the "job title"
    And I search for a job with "<Where>" as the "Postcode"
    And I search for a job with "<JobReference>" as the "jobreference"
    And I search for a job with "<Employer>" as the "Employer"
    And I click on "search button"
    And I filter the search result for "Distance" "<Distance>"
    And I filter the search result for "working pattern" "<WorkingPattern>"
    And I filter the search result for "contract type" "<ContractType>"
    And I filter the search result for "staff group" "<StaffGroup>"
    And I filter the search result for "pay range" "<PayRange>"
    And I filter the search result for "pay grade" "<PayGrade>"
    And results should contain some job adverts
    Examples:
    |What       |Where    |JobReference   |Employer                       |Distance   |Covid-19|WorkingPattern|ContractType |StaffGroup           |PayRange           |PayGrade   |
    |Nurse      |CV3      |               |NHS                            |+5 Miles   |        |full-time     |             |                     |                   |           |
    |Doctor     |         |               |                               |           |        |full-time     |Permanent    |Healthcare Scientists|£30,000 to £40,000 |Band 5     |
    |Python     |         |               |NHS Business Services Authority|           |        |              |Fixed-term   |                     |£40,000 to £50,000 |           |
    |Carer      |         |               |                               |           |        |part-time     |             |                     |£40,000 to £50,000 |           |
    |Therapist  |London   |               |                               |+20 Miles  |        |              |             |                     |                   |           |
    |Tester     |         |               |                               |           |        |full-time     |             |                     |                   |Band 5     |
