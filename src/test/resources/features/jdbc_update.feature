@dbedit
Feature: Update Hotel Data
  Background: User connected to the database
    Given : user connects to the application database

    Scenario: Update hotels
      And user updates Email as "thisupdateemails@update.data" when IDHotel is 10