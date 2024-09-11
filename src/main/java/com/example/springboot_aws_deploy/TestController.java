package com.example.springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/TestOne")
    public  String test()
    {
        return "Test One";
    }
}
