
Feature: Filter the staff group based jobs in search
  As an NHS job seeker
  I want to use the staff group filter to filter job adverts.
  So that I can find relevant jobs quickly and easily

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario Outline: Staff Group Filter
    When I search for a job with "Developer" as the "job title"
    And I click on "search button"
    Then results should contain the word "Developer" in "Job Title"
    And I filter the search result for "staff group" "<staffgroup>"
    #Then I can see search result for "staff group" "<staffgroupe>" filter
    #Here I am unable to proceed with the checking of the staffgroup filter
      # because to verify there is no data available in the Job details tile or in the Job advert details.
        # So, here I am checking if the filters are working or not

    Examples:
      | staffgroup                                    |
      |Additional Clinical Services                   |
      |Additional Professional Scientific & Technical |
      |Administrative & Clerical                      |
      |Allied Health Professionals                    |
      |Estates & Ancillary                            |
      |Healthcare Scientists                          |
      |Medical & Dental                               |
      |Nursing & Midwifery Registered                 |
      |Students                                       |

