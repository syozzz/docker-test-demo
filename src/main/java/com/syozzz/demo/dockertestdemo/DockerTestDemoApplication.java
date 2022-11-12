package com.syozzz.demo.dockertestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
        exclude = DataSourceAutoConfiguration.class
)
public class DockerTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerTestDemoApplication.class, args);
    }

}
