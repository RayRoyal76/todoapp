package com.rayvon.todoApp.config;


import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("/secret.properties")
@Configuration
public class PropConfig {

    @Autowired
    Environment env;
}
