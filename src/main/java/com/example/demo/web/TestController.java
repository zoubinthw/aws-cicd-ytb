package com.example.demo.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
//@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() throws UnknownHostException {
        String hostAddress = Inet4Address.getLocalHost().getHostAddress();
        return ResponseEntity.ok().body(Map.of("Testing", "Up and running: " + hostAddress));
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> health() throws UnknownHostException {
        return ResponseEntity.ok().body(Map.of("Status", "Up"));
    }
}
