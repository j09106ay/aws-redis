package com.aws.java.aws_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value   = "/api/v1/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public String saveString(@RequestParam String key, @RequestParam String value) {
        redisService.saveString(key, value);
        return "Saved successfully!";
    }

    @GetMapping("/get/{key}")
    public String getString(@PathVariable String key) {
        return redisService.getString(key);
    }
}