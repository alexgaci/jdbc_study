package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    final String pass = "pa$$word!";
    final String user = "jdbc_user";
    final String dbUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;database=BikeStores";

    public Connection getDatabaseConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, user, pass);
    }
}
