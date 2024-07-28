package com.billlog.core;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
public class DataCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataCoreApplication.class, args);
        System.out.println("Hello [ ODOS DATA CORE Module ] world!");
    }
}