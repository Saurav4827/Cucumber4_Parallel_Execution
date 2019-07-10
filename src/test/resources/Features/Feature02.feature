
Feature: login to hris

 Scenario: login with incorrect credentials
    Given User is on Login page
    When User Enters incorrect username
    When User Enter incorrect password
    And User  clicks SignIn button
    Then a Invlaid login msg is shown
    And Qaitupdates is shown
 
