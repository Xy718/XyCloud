package xyz.xy718.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class XyCloudConfigApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(XyCloudConfigApplication.class, args);
    }

}
