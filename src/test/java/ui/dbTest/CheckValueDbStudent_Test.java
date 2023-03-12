package ui.dbTest;



import ui.components.database.JdbcConnect;
import ui.components.database.tables.StepsDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static java.sql.DriverManager.getConnection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckValueDbStudent_Test {

    @Test
    @DisplayName("Проверка значения из таблицы Студенты")
    public void selectRequest() throws SQLException {
        JdbcConnect jdbcConnect = new JdbcConnect();
        StepsDAO studentTable = new StepsDAO();
        jdbcConnect.jdbcConnect();
        studentTable.CheckFioStudents("select fio from mydbtest.student where id = '1' ");
    }

}


