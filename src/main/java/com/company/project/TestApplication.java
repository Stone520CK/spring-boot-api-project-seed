package com.company.project;/**
 * @description: test
 * @Author Stone
 */


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
@SpringBootTest
class TestApplication  {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println("获取数据库连接"+dataSource.getConnection());
    }

}
