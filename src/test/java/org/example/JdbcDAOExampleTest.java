package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class JdbcDAOExampleTest {

    @Test
    void main_test() {
    }

    @Test
    void jdbcDaoTest() throws ClassNotFoundException, SQLException {
        JdbcDAOExample dao = new JdbcDAOExample();
        dao.jdbcDao();
    }
}