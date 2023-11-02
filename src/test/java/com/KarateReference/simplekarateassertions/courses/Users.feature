Feature: Confirm User Contracts

  Background:
    * url 'http://localhost:8080/karate-demo'

  Scenario: Get All Courses

    Given path '/users/firstUser'
    * method GET
    And response.name == "Cole"
    Then status 200

  Scenario: Create course but not authorized
    Given path '/users/badResponseUser'

    * method GET
    Then status 400

