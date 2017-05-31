Feature: Delete Fee receipt
     As a user I would like to delete fee receipt

  @delete1
  Scenario Outline: To delete fee receipt by student details
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then delete fee receipt page is opened
    Then user searches a student to delete by class"<class>" section"<section>" and student details"<name>"
    Then user enters the reason"test" to delete
    Then user deletes the receipt "<receipt no>"

    Examples: 
      | url                              | uname | password  | class | section | name   | receipt no |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |     1 | A       | sonia1 |      10145 |

  @delete2
  Scenario Outline: To delete cancelled fee receipt
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then delete fee receipt page is opened
    Then user searches a student to delete by class"<class>" section"<section>" and student details"<name>"
    Then select search cancel fee receipt
    Then user enters the reason"test" to delete
    Then user deletes the receipt "<receipt no>"

     Examples: 
      | url                              | uname | password  | class | section | name   | receipt no |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |     1 | A       | sonia1 |      9943 |
     
  @delete3
  Scenario Outline: To delete all cancelled fee receipts
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then delete fee receipt page is opened
    Then user searches a student to delete by class"<class>" section"<section>" and student details"<name>"
    Then select search cancel fee receipt
    Then user deletes all the cancelled fee receipts
    
    Examples: 
      | url                              | uname | password  | class | section | name   | 
      | http://qaerp.franciscanecare.net | admin | Admin@987 |     1 | A       | sonia1 |      

  @delete4
  Scenario Outline: To delete all fee receipts
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then delete fee receipt page is opened
    Then user searches a student to delete by class"<class>" section"<section>" and student details"<name>"
    Then user delete all the fee receipts

    Examples: 
      | url                              | uname | password  | class | section | name   | 
      | http://qaerp.franciscanecare.net | admin | Admin@987 |     1 | A       | sonia1 |      
    