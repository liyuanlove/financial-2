package com.ljh.financial.controller;

import com.ljh.financial.entity.Product;
import com.ljh.financial.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangjh
 * @create 2018-07-22 17:03
 **/
@RestController
@Api(description = "test")
@RequestMapping("/api/v1/test")
public class ProductController {

    @Resource
    private ProductService productService;


    @PostMapping
    @ApiModelProperty(value = "test")
    public ResponseEntity test(@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }

}
