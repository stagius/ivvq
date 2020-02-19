Feature: Test that tasks can be shown on UI

  Scenario: Test retrieve task 1
    When I visit the url /task/1
    Then something is displayed