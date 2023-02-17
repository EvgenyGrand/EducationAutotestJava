package components.database;

import java.sql.*;

import static components.database.JdbcConfig.*;

public class JdbcConnect {
    public Connection jdbcConnect() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

}




