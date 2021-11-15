package database_stepdefinition;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBUpdate_StepDefinitions {

    @Given(": user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();

    }


    @Given("user updates Email as {string} when IDHotel is {int}")
    public void user_updates_Email_as_when_IDHotel_is(String string, Integer int1) throws SQLException {
        String query = "SELECT Email FROM dbo.tHOTEL";//Writing the query

        //Execute the query
        DBUtils.executeQuery(query);
        //Skip the first 3 lines.We should use resultSet to skip
        //resultSet==>Driver.getResult
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();
        while (DBUtils.getResultset().next()){
            String str = DBUtils.getResultset().getString("Email");
            System.out.println(str);
        }
      //  System.out.println(DBUtils.getResultset().getObject("Email"));
        String updateQuery="UPDATE dbo.tHOTEL SET Email = '" + string +"' WHERE IDHotel=" + int1 + "";
        DBUtils.executeQuery(updateQuery);


    }
}
