package org.alinazim.bean;

import java.sql.*;

public class ConnectionsDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String DataBase = "jdbc:mysql://localhost:3306/StudentRegisterApp";
        String username = "root";
        String password = "alinazim";
        Connection connection = DriverManager.getConnection(DataBase, username,password);
        Statement statement = connection.createStatement();
        statement.execute("select * from teacher");
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
    }
}
