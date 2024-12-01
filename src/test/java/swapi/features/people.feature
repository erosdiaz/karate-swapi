Feature: Get people from SWAPI

  Scenario: Get luke
    Given url "https://swapi.dev/api/"
    And path "people/1"
    When method get
    Then status 200