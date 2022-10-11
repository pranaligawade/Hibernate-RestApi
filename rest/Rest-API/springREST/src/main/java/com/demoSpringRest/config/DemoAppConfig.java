package com.demoSpringRest.config;
//step 2- configruation
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("Springdemo.config")

public class DemoAppConfig {
}
