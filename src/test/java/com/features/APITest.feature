Feature: Test Github API

  Scenario Outline: User is able to validate the Github API Response

    Given User sets the base API Request <URL>
    And User authenticates the API request with <token>
    When User sends the API request to get all the repositories
    Then User validates the response status is <code>

    Examples:
    |URL                   | token                              | code |
    |https://api.github.com| 4164b2d6744483028690784c2b4997060  | 200  |