package com.neueda.test.bootapp;

import com.neueda.test.createurl.CreateUrlConfig;
import com.neueda.test.forward.ForwardConfig;
import com.neueda.test.inmemdb.InMemDBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CreateUrlConfig.class, ForwardConfig.class, InMemDBConfig.class})
public class UrlApp {

    public static void main(String[] args) {
        SpringApplication.run(UrlApp.class, args);
    }
}
