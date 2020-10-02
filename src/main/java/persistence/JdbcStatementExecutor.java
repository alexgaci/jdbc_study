package persistence;

import java.sql.*;

public class JdbcStatementExecutor implements SqlExecutor {

    final private ConnectionManager connectionManager;

    public JdbcStatementExecutor(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public void select(String query) throws SQLException {
        final Connection connection = connectionManager.getDatabaseConnection();
        try {
            final Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int execute(String query) throws SQLException {
        final Connection connection = connectionManager.getDatabaseConnection();
        try {
            final Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
