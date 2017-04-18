Feature: Certificates
    As a user I would like to verify cerficates
    So that I don't have to verify myself

  @scenario1
  Scenario Outline: To verify the selected certificate based on class, section and admission no.
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then certificates page is opened
    Then user select class "<class>" on cerfificates page
    Then user select section "<section>" on certificates page
    Then user search student by admission no "<admission no>" on certificates page
    Then user select the certificate "Birth" to print on certificates page
    Then user click show on certificates page

    Examples: 
      | class | section | admission no |
      |     1 | A       |        11373 |

  @scenario2
  Scenario Outline: To verify all cerficates
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then certificates page is opened
    Then user select class "<class>" on cerfificates page
    Then user select section "<section>" on certificates page
    Then user search student by admission no "<admission no>" on certificates page
    Then user verify certificates to print on certificates page

    Examples: 
      | class | section | admission no |
      |     1 | A       |        11373 |
