Feature: Login to hris 

Scenario: login with correct credentials
   Given User is on login page
   When User enters correct Username
   And User enters correct password
   Then  User click signin button
   And User redirected to timesheet
   And user verifies the home page
   
 #Scenario: login with only correct username
    #Given  user is on login page
   #When user enters correct username
   #And user enters incorrect password
    #And user click signIn button
    #Then a Invlaid login msg is shown
    #And Qaitupdates is shown
