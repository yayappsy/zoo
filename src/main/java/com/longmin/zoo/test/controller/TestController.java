package com.longmin.zoo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: zoo
 * @description: 测试
 * @author: Dx
 * @create: 2018-06-08 18:12
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return "haha";
    }
}
