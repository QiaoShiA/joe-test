package com.joe.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName : joe-test
 * @ClassName : com.joe.cloud.controller.DemoController
 * @Author : Joe
 * @Date : 2023/2/14 18:28
 * @Description : demo的控制层
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @RequestMapping( "/test")
    public String getStr() {
        return "test";
    }

}
