Feature: Get planets from SWAPI

  Scenario: Get Tatooine
    Given url "https://swapi.dev/api/"
    And path "planets/1"
    When method get
    Then status 200