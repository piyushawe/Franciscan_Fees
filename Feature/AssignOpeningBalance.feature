Feature: Assign Opening Balance
    As a user I would like to assign opening balance on different fee types
    So that I don't have to do it myself

  @scenario1
  Scenario Outline: Assign opening balance to a student on a particular fee type and verify on fee entry page
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then assign opening balance page is opened
    Then select class "<class>" on assign opening balance page
    Then select section "<section>" on assign opening balance page
    Then select fee type "SCHOOL FEE" on assign opening balance page
    Then assign opening balance to student "<name>" of amount "1000" on assign opening balance page
    Then click save on assign opening balance page
    Then go back to the default page
    Then fee entry form is opened
    Then user searches a student on fee entry form by class"<class>" section"<section>" and student details"<name>"
    Then user select fee type "SCHOOL FEE" on fee entry page
    Then verify advance amount "1000" on fee entry page

    Examples: 
      | url                              | uname | password  | class | section | name   |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | test1 | A       | sonia9 |

  @scenario2
  Scenario Outline: Assign opening balance to a student on a different fee types and verify on fee entry page with all fee types
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then assign opening balance page is opened
    Then select class "<class>" on assign opening balance page
    Then select section "<section>" on assign opening balance page
    Then select fee type "SCHOOL FEE" on assign opening balance page
    Then assign opening balance to student "<name>" of amount "1000" on assign opening balance page
    Then click save on assign opening balance page
    Then select fee type "TRANSPORT" on assign opening balance page
    Then assign opening balance to student "<name>" of amount "1000" on assign opening balance page
    Then click save on assign opening balance page
    Then go back to the default page
    Then fee entry form is opened
    Then user searches a student on fee entry form by class"<class>" section"<section>" and student details"<name>"
    Then user select fee type "All FeeTypes" on fee entry page
    Then verify advance amount "2000" on fee entry page

    Examples: 
      | url                              | uname | password  | class | section | name   |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | test1 | A       | sonia9 |

  @scenario3
  Scenario Outline: Assign opening balance to a student on a different fee types and verify on fee entry page with individual fee types
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then assign opening balance page is opened
    Then select class "<class>" on assign opening balance page
    Then select section "<section>" on assign opening balance page
    Then select fee type "SCHOOL FEE" on assign opening balance page
    Then assign opening balance to student "<name>" of amount "1000" on assign opening balance page
    Then click save on assign opening balance page
    Then select fee type "TRANSPORT" on assign opening balance page
    Then assign opening balance to student "<name>" of amount "1000" on assign opening balance page
    Then click save on assign opening balance page
    Then go back to the default page
    Then fee entry form is opened
    Then user searches a student on fee entry form by class"<class>" section"<section>" and student details"<name>"
    Then user select fee type "SCHOOL FEE" on fee entry page
    Then verify advance amount "1000" on fee entry page
    Then user select fee type "TRANSPORT" on fee entry page
    Then verify advance amount "1000" on fee entry page

    Examples: 
      | url                              | uname | password  | class | section | name   |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | test1 | A       | sonia9 |
