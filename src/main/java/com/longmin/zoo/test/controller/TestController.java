package com.longmin.zoo.test.controller;

import com.longmin.zoo.test.bean.Account;
import com.longmin.zoo.test.dao.AccountDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

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
        return "方方我爱你";
    }
}
