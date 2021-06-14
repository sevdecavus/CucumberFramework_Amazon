Feature: Amazon search
  Scenario: TC01_user search product on Amazon
    Given user go to Amazon webpage
    And user write iphone on searchbox
    Then user get resultnumber on the screen
