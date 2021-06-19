package com.ashique.propertyAnnot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
 
@Configuration
@ComponentScan(basePackages = "com.ashique.propertyAnnot")
@PropertySource(value = { "classpath:dbConfig.properties" })
public class AppConfig {
 
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}