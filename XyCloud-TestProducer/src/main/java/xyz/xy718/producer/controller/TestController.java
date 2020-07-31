package xyz.xy718.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.xy718.model.TestUser;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${test.value}")
    String value;

    @GetMapping
    public String getTest(){
    	TestUser user= new TestUser();
        return value;
    }
}
