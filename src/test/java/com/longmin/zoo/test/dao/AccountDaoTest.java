package com.longmin.zoo.test.dao;

import com.longmin.zoo.BaseTest;
import com.longmin.zoo.test.bean.Account;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class AccountDaoTest extends BaseTest {

    @Resource
    private AccountDao accountDao;

    @Test
    public void test() {
        Account one = accountDao.getOne(22L);
        System.out.println(one);
    }

}