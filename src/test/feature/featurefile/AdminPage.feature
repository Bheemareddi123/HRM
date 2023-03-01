Feature: OrangeHRM Admin Page

  Scenario Outline: User Creates admin and verifies it.
    Given User has launched OrangeHRM Application
    When User log into application by entering common "<username>" and "<password>"

    Examples: 
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: 
    When User click on Admin menu and clicks on add button
    And User Enters "<EmployeeName>","<UserName>","<Password>" and "<ConfirmPassword>" and clicks on save
    Then User verifies the Created Admin by entering "<UserName>"

    Examples: 
      | EmployeeName   | UserName | Password  | ConfirmPassword |
      | Jadine  Jackie | America  | Kohli@123 | Kohli@123       |
      | Jadine  Jackie | India    | Kohli@123 | Kohli@123       |
      | Jadine  Jackie | London   | Kohli@123 | Kohli@123       |

  Scenario: 
    Then User closes the browser
