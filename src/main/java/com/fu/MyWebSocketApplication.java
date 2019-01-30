package com.fu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@SpringBootApplication
@EnableScheduling
public class MyWebSocketApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MyWebSocketApplication.class).web(true).run(args);
    }
}
