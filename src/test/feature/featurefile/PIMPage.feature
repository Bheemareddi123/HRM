Feature: OrangeHRM PIMPage

  Scenario Outline: User Adds EmployeeDetails
    Given User has launched the OrangeHRM Application
    When User log into application by entering "<username>" and "<password>"
    And User click on PIM menu and clicks on add employee button
    And User enters "<firstName>","<middleName>","<lastName>" and "<employeeID>"
    Then User verifies the Added Employee by entering "<firstName>"

    Examples: 
      | username | password | firstName | middleName | lastName | employeeID |
      | Admin    | admin123 | RRR     | K          | GF       |        805 |
      
