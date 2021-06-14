Feature: Amazon search
  @amazonsearch
  Scenario: TC01_user search product on Amazon
    Given user go to Amazon webpage
    And user write iphone on searchbox
    Then user get resultNumber on the screen
