package com.starstar.test;

import com.starstar.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils() throws SQLException {
        for (int i = 0; i < 100; i ++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection + " " + i);
            connection.close();
        }
    }
}
