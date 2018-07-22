package com.ljh.financial.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liangjh
 * @create 2018-07-20 22:21
 **/
@Data
@Entity
public class Product {
    @Id
    private Integer id;

    private String name;

    private String status ;

    private BigDecimal thresholdAmount ;

    private BigDecimal stepAmount;

    private Integer lockTerm;

    private BigDecimal rewardRate;

    private String memo;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;
}
