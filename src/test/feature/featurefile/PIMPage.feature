Feature: OrangeHRM PIMPage

  Scenario Outline: User Adds EmployeeDetails
    Given User has launched the OrangeHRM Application
    When User log into application by entering "<username>" and "<password>"

    Examples: 
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: 
    And User click on PIM menu and clicks on add employee button
    And User enters "<firstName>","<middleName>","<lastName>" and "<employeeID>"
    Then User verifies the Added Employee by entering "<firstName>"

    Examples: 
      | firstName | middleName | lastName | employeeID |
      | RRR       | K          | GF       |        805 |

  Scenario: 
    Then User closes the Application
