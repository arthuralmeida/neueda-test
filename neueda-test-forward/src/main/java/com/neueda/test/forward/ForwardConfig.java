package com.neueda.test.forward;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.neueda.test.forward.controller" })
public class ForwardConfig {
}
