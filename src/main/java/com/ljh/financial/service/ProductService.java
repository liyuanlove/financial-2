package com.ljh.financial.service;

import com.ljh.financial.entity.Product;

/**
 * @author liangjh
 * @create 2018-07-22 17:02
 **/
public interface ProductService {

    /**
     * 新增产品
     * @param product
     * @return
     */
    Product addProduct(Product product);

    // TODO 根据Id查询产品
    // TODO 数据校验
}
