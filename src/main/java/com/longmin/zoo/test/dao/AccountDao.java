package com.longmin.zoo.test.dao;

import com.longmin.zoo.test.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: zoo
 * @description: 账户
 * @author: Dx
 * @create: 2018-06-08 17:03
 **/
@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

}
