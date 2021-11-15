$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/jdbc_read.feature");
formatter.feature({
  "name": "Read Data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DBtest"
    }
  ]
});
formatter.background({
  "name": "User connected to the database",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user connects to the database",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_connects_to_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Reading Hotel Reservations",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DBtest"
    }
  ]
});
formatter.step({
  "name": "user gets \"Name\" the \"Hotel\" table",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_table(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user reads all rows in the \"Name\" column",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_reads_all_rows_in_the_column(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 15 in \"Name\" column and verifies the value is \"LILLE\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 1 in \"Name\" column and verifies the value is \"Rodisson Demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 10 in \"Name\" column and verifies the value is \"SUNSET\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});