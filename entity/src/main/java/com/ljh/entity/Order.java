package com.ljh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author liangjh
 * @create 2018-07-20 22:18
 **/
@Data
@Entity
public class Order {

    @Id
    private Integer id;
}
