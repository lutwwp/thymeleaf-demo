package com.example.thymeleafdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName JdbcConfig
 * @Description: TODO
 * @Author wwp
 * @Date 2019-10-30
 * @Version V1.0
 **/
@Configuration
public class JdbcConfig2 {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
