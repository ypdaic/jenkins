package com.daiyanping.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public JSONObject hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello", "world");
        return jsonObject;
    }
}
