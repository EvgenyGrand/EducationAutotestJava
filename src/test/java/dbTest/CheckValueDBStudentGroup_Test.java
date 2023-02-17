package dbTest;

import components.database.JdbcConnect;
import components.database.tables.AssertionsDB;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class CheckValueDBStudentGroup_Test {

    @Test
    @DisplayName("Проверка значени из таблиц студенты и группы (join)")
    public void selectRequest() throws SQLException {
        JdbcConnect jdbcConnect = new JdbcConnect();
        AssertionsDB assertionsDB = new AssertionsDB();
        jdbcConnect.jdbcConnect();
        assertionsDB.CheckFioStudentsingroup("select fio from mydbtest.student left join mydbtest.groups on student.id_group = mydbtest.groups.idgroups where student.sex = 'female' and mydbtest.groups.groupsname = 'Architect' ");

    }

}
