package com.leitianyu_2;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

public class DruidDemo_001 {
    public static void main(String[] args) throws Exception {


        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc_Demo/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

}
