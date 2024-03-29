package org.unibl.etf.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class DigitalSignageApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalSignageApiApplication.class, args);
    }
}