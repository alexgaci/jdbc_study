import persistence.ConnectionManager;
import persistence.JdbcStatementExecutor;
import persistence.SqlExecutor;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {


        ConnectionManager connectionManager = new ConnectionManager();
        SqlExecutor sqlExecutor = new JdbcStatementExecutor(connectionManager);

//        int rowAffected = sqlExecutor.execute("DELETE from sales.stores where store_id > 3");
//
//        System.out.println("Rows affected after insert: " + rowAffected);

        sqlExecutor.select("select * from sales.stores");




//
//        Connection myConn = null;
//        Connection conn = ConnManager.getConn();
////        Statement myStmt = null;
//        Statement myStmt = conn.createStatement();
////        ResultSet myRes = null;
//
////        String dbUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;database=BikeStores";
////        String user = "jdbc_user";
////        String pass = "pa$$word!";
//
//        try {
////            myConn = DriverManager.getConnection(dbUrl, user, pass);
////            myStmt = conn.createStatement();
//           ResultSet myRes = myStmt.executeQuery("select * from sales.stores");
//
//            while (myRes.next()) {
//                System.out.println(myRes.getInt("store_id") + ", " + myRes.getString("store_name"));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            myConn = DriverManager.getConnection(dbUrl, user, pass);
//            myStmt = myConn.createStatement();
//
//            myStmt.executeUpdate("insert into sales.stores" +
//                    "(store_name, phone, email, street, city, state, zip_code)" +
//                    "values" +
//                    "('Rosario Agro', '(373) 122 1448', 'moldova@gmail.com', 'str. Arborilor 12', 'Chisinau', 'MD', '2001')");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            myConn = DriverManager.getConnection(dbUrl, user, pass);
//            myStmt = myConn.createStatement();
//
//            myStmt.executeUpdate("update sales.stores " +
//                    "set store_name = 'Rosario Agro new'" +
//                    "where store_id = 3");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            myConn = DriverManager.getConnection(dbUrl, user, pass);
//            myStmt = myConn.createStatement();
//
//            myStmt.executeUpdate("DELETE from sales.stores where store_id > 3");
//
//        } catch (Exception e) {
//            e.printStackTrace();
        //     }
//        finally {
////            close(myConn, myStmt, myRes);
//            myRes.close();
//            myStmt.close();
////            myConn.close();
//        }

    }
}
