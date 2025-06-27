@saerch
Feature: Checking the footer links in search application
  As a NHS job seeker
  I need to be access the footer links of the application
  So that I can have the relevant information

  Scenario Outline: Clicking on the footerlink
    Given I navigate to the NHS Candidate Search page
    And I click on "<FooterLink>"
    Then the page correct heading should be "<PageName>" opens in new tab
    Examples:
    | FooterLink                     | PageName                       |
    | privacy policy                 | privacy policy                 |
    | terms and conditions           | terms and conditions           |
    | accessibility statement        | accessibility statement        |
    | cookies                        | cookies                        |