package org.example;

import java.sql.SQLException;

public class JdbcDAOExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // DAO stands for Data Access objects in java jdbc
        // This is a pattern followed in industry to maintain
        // database architecture

        StudentDAO studentDAO = new StudentDAO();
        Student s1 = studentDAO.getStudent(1);
        System.out.println(s1.name);
    }

    public void jdbcDao()throws ClassNotFoundException, SQLException {
        StudentDAO studentDAO = new StudentDAO();
        Student s1 = studentDAO.getStudent(1);
        System.out.println(s1.name);
    }
}