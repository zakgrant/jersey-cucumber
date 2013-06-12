Feature: HelloWorld Web Service HTTP GETs

  Scenario: Get collection of people
    Given I query person
    When I make the rest call
    Then response should contain:
      """
      [{"address":"Tokyo","name":"suzuki","id":1},{"address":"Osaka","name":"satou","id":2},{"address":"Naogya","name":"tanaka","id":3}]
      """

  Scenario Outline: Get person by id
    Given I query person by "<id>"
    When I make the rest call
    Then response should contain "<person>"

    Examples:

    | id | person                                      |
    | 1  | {"address":"Tokyo","name":"suzuki","id":1}  |
    | 2  | {"address":"Osaka","name":"satou","id":2}   |
    | 3  | {"address":"Naogya","name":"tanaka","id":3} |
