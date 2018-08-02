package com.ljh.financial.enums;

/**
 * @author liangjh
 * @create 2018-07-20 22:26
 **/
public enum OrderStatusEnum {
    INIT("初始化"),
    PROCCESS("处理中"),
    SUCCESS("成功"),
    FAIL("失败");

    private String description;

    OrderStatusEnum(String description) {
        this.description = description;
    }
}
