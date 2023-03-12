package ui.dbTest;

import ui.components.database.JdbcConnect;
import ui.components.database.tables.StepsDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class CheckValueDBStudentGroup_Test {

    @Test
    @DisplayName("Проверка значени из таблиц студенты и группы (join)")
    public void selectRequest() throws SQLException {
        JdbcConnect jdbcConnect = new JdbcConnect();
        StepsDAO assertionsDB = new StepsDAO();
        jdbcConnect.jdbcConnect();
        assertionsDB.CheckFioStudentsingroup("select fio from mydbtest.student left join mydbtest.groups on student.id_group = mydbtest.groups.idgroups where student.sex = 'female' and mydbtest.groups.groupsname = 'Architect' ");

    }

}
