package com.example.defi_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/service-instances")
    public List<String> serviceInstances() {
        return this.discoveryClient.getServices();
    }
}
