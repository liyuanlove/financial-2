package com.ljh.financial.service;

import com.github.pagehelper.PageInfo;
import com.ljh.financial.dto.product.ListProductDto;
import com.ljh.financial.entity.Product;
import org.omg.CORBA.INTERNAL;

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

    /**
     * 根据Id查询单个产品
     * @param id
     * @return
     */
    Product getProductById(Integer id);


    /**
     * 根据条件查新产品
     * @param dto
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo listProductByArgs(ListProductDto dto, Integer pageNum, Integer pageSize);
}
