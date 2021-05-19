package com.neueda.test.createurl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.neueda.test.createurl.controller", "com.neueda.test.createurl.service" })
public class CreateUrlConfig {
}
