import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private static final String URL_CONN = "jdbc:sqlserver://localhost\\MSSQLSERVER;database=BikeStores";
    private static final String USERNAME = "jdbc_user";
    private static final String PASSWORD = "pa$$word!";

    private Connection connection;

    public DBWorker(){
        try{
            connection = DriverManager.getConnection(URL_CONN, USERNAME, PASSWORD);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
