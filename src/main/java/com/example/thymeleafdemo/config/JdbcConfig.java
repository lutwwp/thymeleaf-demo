//package com.example.thymeleafdemo.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * @ClassName JdbcConfig
// * @Description: TODO
// * @Author wwp
// * @Date 2019-10-30
// * @Version V1.0
// **/
//@Configuration
////@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
//
//    @Autowired
//    private JdbcProperties properties;
//
////    @Value("${jdbc.driverClassName}")
////    private String driverClassName;
////    @Value("${jdbc.url}")
////    private String url;
////    @Value("${jdbc.username}")
////    private String username;
////    @Value("${jdbc.password}")
////    private String password;
//
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
////        dataSource.setUrl(this.url);
////        dataSource.setDriverClassName(this.driverClassName);
////        dataSource.setUsername(this.username);
////        dataSource.setPassword(this.password);
//        dataSource.setUrl(this.properties.getUrl());
//        dataSource.setDriverClassName(this.properties.getDriverClassName());
//        dataSource.setUsername(this.properties.getUsername());
//        dataSource.setPassword(this.properties.getPassword());
//        return dataSource;
//    }
//}
