package com.ljh.financial.controller;

import com.ljh.financial.dto.product.AddProductDto;
import com.ljh.financial.dto.product.ListProductDto;
import com.ljh.financial.entity.Product;
import com.ljh.financial.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author liangjh
 * @create 2018-07-22 17:03
 **/
@RestController
@Api(description = "产品接口集")
@RequestMapping("/api/v1/product")
public class ProductController {

    @Resource
    private ProductService productService;


    @PostMapping
    @ApiOperation(value = "新增一个产品")
    public ResponseEntity addProduct(@RequestBody @Validated AddProductDto dto) {
        Product product = new Product();
        BeanUtils.copyProperties(dto, product);
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping("{id}")
    @ApiOperation(value = "查询单个产品")
    public ResponseEntity findOne(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("list")
    @ApiOperation(value = "分页查询产品")
    public ResponseEntity listProduct(@RequestBody @Validated ListProductDto dto,
                                      @RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "10")Integer pageSize) {
        return ResponseEntity.ok(productService.listProductByArgs(dto, pageNum, pageSize));
    }
}
