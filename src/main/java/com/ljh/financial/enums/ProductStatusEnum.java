package com.ljh.financial.enums;


/**
 * @author liangjh
 * @create 2018-07-20 22:24
 **/
public enum ProductStatusEnum {


    AUDITING("审核中"),
    IN_SALE("销售中"),
    LOCKED("锁定"),
    FINISHED("已结束");

    private String description;

    ProductStatusEnum(String description) {
        this.description = description;
    }
}
