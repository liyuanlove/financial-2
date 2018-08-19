package com.ljh.financial.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljh.financial.dto.product.ListProductDto;
import com.ljh.financial.entity.Product;
import com.ljh.financial.mapper.ProductMapper;
import com.ljh.financial.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author liangjh
 * @create 2018-07-22 17:03
 **/
@Slf4j
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

    @Override
    public PageInfo listProductByArgs(ListProductDto dto, Integer pageNum, Integer pageSize) {
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        if (dto.getId() != null && dto.getId().size() > 0) {
            criteria.andIn("id", dto.getId());
        }
        if (dto.getMinRewardRate() != null && BigDecimal.ZERO.compareTo(dto.getMinRewardRate()) < 0) {
            criteria.andGreaterThanOrEqualTo("rewardRate", dto.getMinRewardRate());
        }
        if (dto.getMaxRewardRate() != null && BigDecimal.ZERO.compareTo(dto.getMaxRewardRate()) < 0) {
            criteria.andLessThanOrEqualTo("rewardRate", dto.getMaxRewardRate());
        }
        if (dto.getStatus() != null && dto.getStatus().size() > 0) {
            criteria.andIn("status", dto.getStatus());
        }
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(productMapper.selectByExample(example));
    }
}
