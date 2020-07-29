package xyz.xy718.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class XyCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyCloudConfigApplication.class, args);
    }

}
