package com.longmin.zoo.test.bean;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @program: zoo
 * @description: 账户
 * @author: Dx
 * @create: 2018-06-08 17:01
 **/
@Entity
@Data
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long userId;


    private Long mainBalance;


    private Long deputyBalance;


    private Long createUser;


    private Integer status;


    private Long version;


    private Date createTime;


    private Date updateTime;


    private Integer deleteFlag;


}
