Feature: Get starships from SWAPI

  Scenario: Get Death Star
    Given url "https://swapi.dev/api/"
    And path "starships/9"
    When method get
    Then status 200
    And match response.name == "Death Star"