package com.ljh.financial.service.impl;

import com.ljh.financial.entity.Product;
import com.ljh.financial.mapper.ProductMapper;
import com.ljh.financial.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liangjh
 * @create 2018-07-22 17:03
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product addProduct(Product product) {

        productMapper.insertSelective(product);
        return product;
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
