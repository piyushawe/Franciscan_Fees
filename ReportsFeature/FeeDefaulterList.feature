Feature: Fee Defaulter List
     As a user I would like to open fee defaulter list 
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To open fee defaulter list with fine and without head
    Then fee defaulter page is opened
    Then user selects class"<class>" on fee defaulter list
    And selects section"<section>" on fee defaulter list
    Then selects installment"<installment>" on fee defaulter list
    Then filter with cheque clearing date
    Then selects with fine on fee defaulter list
    Then selects without head on fee defaulter list
    Then click on show on fee defaulter list

    Examples: 
      | class | section | installment |
      |     1 | A       | APRIL       |

  @scenario2
  Scenario Outline: To open fee defaulter list without head
    Then fee defaulter page is opened
    Then select school"<school>" on fee defaulter list
    Then user selects class"<class>" on fee defaulter list
    And selects section"<section>" on fee defaulter list
    Then selects installment"<installment>" on fee defaulter list
    Then selects without head on fee defaulter list
    Then click on show on fee defaulter list

    Examples: 
      | class | school                         | section | installment |
      |     1 | Convent of Jesus & Mary School | A       | APRIL       |

  @scenario3
  Scenario Outline: To open fee defaulter list with fine and head
    Then fee defaulter page is opened
    Then select school"<school>" on fee defaulter list
    Then user selects class"<class>" on fee defaulter list
    And selects section"<section>" on fee defaulter list
    Then selects installment"<installment>" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects with head on fee defaulter list
    Then click on show on fee defaulter list

    Examples: 
      | class | school                         | section | installment |
      |     1 | Convent of Jesus & Mary School | A       | APRIL       |

  @scenario4
  Scenario Outline: To open fee defaulter list with head
    Then fee defaulter page is opened
    Then select school"<school>" on fee defaulter list
    Then user selects class"<class>" on fee defaulter list
    And selects section"<section>" on fee defaulter list
    Then selects installment"<installment>" on fee defaulter list
    Then selects with head on fee defaulter list
    Then click on show on fee defaulter list

    Examples: 
      | class | school                         | section | installment |
      |     1 | Convent of Jesus & Mary School | A       | APRIL       |

  @scenario5
  Scenario Outline: To open fee defaulter list with class range
    Then fee defaulter page is opened
    Then user click class range on fee defaulter list
    Then user select class range "<class-sec>" on fee defaulter list
    Then selects installment"<installment>" on fee defaulter list
    Then user click date range on fee defaulter list
    Then user select from date as month "April" year "2017" and day "1" on fee defaulter list
    Then user select to date as month "April" year "2017" and day "30" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects with head on fee defaulter list
    Then click on show on fee defaulter list

    Examples: 
      | class-sec | installment |
      | 1-A       | APRIL       |

  #with no filter
  @scenario6
  Scenario: To test class wise, without head
    Then fee defaulter page is opened
    Then selects without head on fee defaulter list
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then click on show on fee defaulter list

  @scenario7
  Scenario: To test class wise with fine, without head and cheque clearing date
    Then fee defaulter page is opened
    Then filter with cheque clearing date
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects without head on fee defaulter list
    Then click on show on fee defaulter list

  @scenario8
  Scenario: To test class wise with fine, with head and cheque clearing date
    Then fee defaulter page is opened
    Then filter with cheque clearing date
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects with head on fee defaulter list
    Then click on show on fee defaulter list

  @scenario9
  Scenario: To test class range with fine, without head and cheque clearing date
    Then fee defaulter page is opened
    Then user click class range on fee defaulter list
    Then filter with cheque clearing date
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects without head on fee defaulter list
    Then click on show on fee defaulter list

  @scenario10
  Scenario: To test class range with fine, with head and cheque clearing date
    Then fee defaulter page is opened
    Then user click class range on fee defaulter list
    Then filter with cheque clearing date
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then selects with fine on fee defaulter list
    Then selects with head on fee defaulter list
    Then click on show on fee defaulter list

  @scenario11
  Scenario: To test class range without head
    Then fee defaulter page is opened
    Then user click class range on fee defaulter list
    Then user select to date as month "May" year "2017" and day "31" on fee defaulter list
    Then selects without head on fee defaulter list
    Then click on show on fee defaulter list
