Feature: Addition

  Scenario: Adding 1 and 1
    Given two integers 1 and 1
    When I add them
    Then I get 2


  Scenario: Adding 2 and 2
    Given two integers 2 and 2
    When I add them
    Then I get 4


  Scenario: Adding 2 and 3
    Given two integers 2 and 3
    When I add them
    Then I get 5