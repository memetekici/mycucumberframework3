
Feature: US1003_user_should_add_data_scenario_outline
@regression1
  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And search for the first name "<firstname>"
    Then verify the name fields contains first name "<firstname>"

    Examples: test data for the data table test
    |firstname|lastname|position|office |extension|startdate |salary |
    |jon      |sam     |doctor  |LA     |456      |2020-10-10|7890000|
    |ab       |samdfdf |doctord |LA     |4532     |2020-10-11|722000000|
    |ali      |eee     |oooo    |malatya|666      |2020-10-12|7890200|
    |veli     |fff     |student |erzurum|555      |2020-10-13|7890300|
    |memet    |sacccc  |lawyer  |berlin |222      |2020-10-14|7894000|


