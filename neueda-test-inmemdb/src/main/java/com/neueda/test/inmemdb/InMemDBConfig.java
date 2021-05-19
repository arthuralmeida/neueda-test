package com.neueda.test.inmemdb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.neueda.test.inmemdb.repository" })
public class InMemDBConfig {
}
