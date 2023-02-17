package components;

import java.sql.*;

public class Test {
    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "12345";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection  connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

//        statement.executeUpdate("insert into mydbtest.student (fio, sex,id_group) value ('Alexey' , 'male', 2)");
//        statement.executeUpdate("delete from mydbtest.student where id = '8'");
        ResultSet resultSet = statement.executeQuery("select fio from mydbtest.student where id = '1' ");
        while (resultSet.next()){
            String fio = (resultSet.getString("fio"));
            if (fio.equalsIgnoreCase("Elena")){
                System.out.println("Success!");
            }else{
                System.out.println("Fail");
            }


        }




        }

    }
