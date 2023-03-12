package ui.components.database.tables;

import ui.components.database.JdbcConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StepsDAO extends JdbcConnect {

    public void CheckFioStudents(String SqlRecuest) throws SQLException {
        JdbcConnect jdbcConnect = new JdbcConnect();
        ResultSet resultSet = jdbcConnect().createStatement().executeQuery(SqlRecuest);
        while (resultSet.next()) {
            String fio = (resultSet.getString("fio"));
            assertTrue(fio.equalsIgnoreCase("Elena"));
        }
    }

    public void CheckFioStudentsingroup(String SqlRecuest) throws SQLException {
        JdbcConnect jdbcConnect = new JdbcConnect();
        ResultSet resultSet = jdbcConnect().createStatement().executeQuery(SqlRecuest);
        while (resultSet.next()) {
            String fio = (resultSet.getString("fio"));
            assertTrue(fio.equalsIgnoreCase("Elena"));
        }
    }
}