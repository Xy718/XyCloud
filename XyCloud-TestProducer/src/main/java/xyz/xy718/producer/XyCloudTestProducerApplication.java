package xyz.xy718.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XyCloudTestProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyCloudTestProducerApplication.class, args);
    }

}
