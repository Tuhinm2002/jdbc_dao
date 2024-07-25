package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class JDBCDemoTest {

    @Test
    void main_test() {

    }

    @Test
    void QueryExecuteTest() throws SQLException,ClassNotFoundException {
        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.QueryExecute();
    }

    @Test
    void getMultipleVal() throws SQLException,ClassNotFoundException {
        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.getMultipleVal();
    }

    @Test
    void insertVal() throws ClassNotFoundException,SQLException{
        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.insertVal();
    }

    @Test
    void insertDynamicVal() throws ClassNotFoundException,SQLException{
        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.insertDynamicVal();
    }
}