
Feature: Search for jobs in the NHS using other factors
  As an employer
  I need to be able to publish job advert for search
  So that candidates can able search for jobs in search

  Background:
    Given I navigate to the NHS Candidate Search page

  Scenario: Search for an job with Postcode
    When I search for a job with "NE3 4NB" as the "Postcode"
    And I click on "search button"
    Then results should contain the word "NE3 4NB" in "Postcode"

  Scenario: Search for an job with Postcode
    When I search for a job with "Coventry" as the "Town/city"
    And I click on "search button"
    Then results should contain the word "Coventry" in "Town/city"

  Scenario: Empty Search with null values
    When I tap on "More Search Options"
    And I click on "search button"
    Then results should contain some job adverts

  Scenario: Search with Employer field
    When I tap on "More Search Options"
    And I search for a job with "NHS Business Services Authority" as the "Employer"
    And I click on "search button"
    Then results should contain the word "NHS Business Services Authority" in "Employer"