package persistence;

import java.sql.SQLException;

public interface SqlExecutor {
    void select(String query) throws SQLException;
    int execute(String query) throws SQLException;
}
