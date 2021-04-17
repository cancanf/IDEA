package 课堂代码.JDBC;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        //数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root&useUnicode=true&characterEncoding=UTF-8");
        //执行sql语句的对象
        Statement statement = connection.createStatement();
        //返回的结果集
        ResultSet resultSet = statement.executeQuery("select * from student");
        while (resultSet.next()) {

        }

    }
}
