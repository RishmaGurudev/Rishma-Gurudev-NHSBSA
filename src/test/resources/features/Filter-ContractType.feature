@search
Feature: Filter the contract type jobs in search
  As an NHS job seeker
  I want to use the contract type filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Contract Filter
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for "contract type" "<contractType>"
    Then I can see search result for "contract type" "<contractTypes>" filter
    Examples:
      |contractType   |contractTypes   |
      |Permanent      |Permanent      |
      |Fixed-term     |Fixed-Term     |
      |Apprenticeship |Apprenticeship |
      |Voluntary      |Voluntary      |
      |Locum          |Locum          |
      |Training       |Training       |
      |Secondment     |Secondment     |
      |Honorary       |Honorary       |
      |Bank           |Bank           |
      |NHS Reservist  |NHS Reservist  |

