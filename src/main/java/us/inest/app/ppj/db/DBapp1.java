package us.inest.app.ppj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBapp1 {
    /*
     * Driver class: The driver class for the oracle database is
     * oracle.jdbc.driver.OracleDriver. Connection URL: The connection URL for the
     * oracle10G database is jdbc:oracle:thin:@localhost:1521:xe where jdbc is the
     * API, oracle is the database, thin is the driver, localhost is the server name
     * on which oracle is running, we may also use IP address, 1521 is the port
     * number and XE is the Oracle service name. You may get all these information
     * from the tnsnames.ora file. Username: The default username for the oracle
     * database is system. Password: It is the password given by the user at the
     * time of installing the oracle database.
     */

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    // Database credentials
    static final String USER = "SYSTEM";
    static final String PASS = "sys";

    public static void simpleOperations() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 2: Register JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("select 'Hello Thin driver tester '||USER||'!' result from dual");
            while (rset.next()) {
                System.out.println(rset.getString(1));
            }
            rset.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
