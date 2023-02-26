package ui.components.database;

import java.sql.*;

public class JdbcConnect {
    public Connection jdbcConnect() throws SQLException {
        Connection connection = DriverManager.getConnection(JdbcConfig.URL, JdbcConfig.USERNAME, JdbcConfig.PASSWORD);
        return connection;
    }

}




