package com.ljh.financial.enums;



/**
 * @author liangjh
 * @create 2018-07-20 22:25
 **/
public enum OrderTypeEnum {
    APPLY("申购"),
    REDEEM("赎回");

    private String description;

    OrderTypeEnum (String description) {
        this.description = description;
    }
}
