@tag
Feature: buttom links verify

  @smoke
  Scenario Outline: verifying links
    Given I am on homepage
    When I click "<links>" in step
    Then I verify the "<url>" and "<title>" in step

    Examples: 
      | links                     | url                                                                             | title                                 |
      | Write for us              | https://softwaretestingboard.com/write-for-us/                                  | Write For Us - Software Testing Board |
      | Contact us                | https://softwaretestingboard.com/contact/                                       | Contact - Software Testing Board      |
      | Search Terms              | https://magento.softwaretestingboard.com/search/term/popular/                   | Popular Search Terms                  |
      | Privacy and Cookie Policy | https://magento.softwaretestingboard.com/privacy-policy-cookie-restriction-mode | Privacy Policy                        |

  @reg
  Scenario Outline: Fill Subscribe to our mailing list form
    Given I am on homepage
    When I click "<link>"
    Then I enter "<email>"  "<firstName>" "<lastname>"  "<companyName>"  "<position>"
    And I verfy the "<url>" and "<title>"
    Then I hit subscrive

    Examples: 
      | link                          | email             | firstName | lastname  | companyName | position | url                                         | title                              |
      | Subscribe to our mailing list | rayhanc@yahoo.com | rayhan    | chowdhury | ray         | hr       | https://softwaretestingboard.com/subscribe/ | Subscribe - Software Testing Board |
