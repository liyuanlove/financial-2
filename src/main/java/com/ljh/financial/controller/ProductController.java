package com.ljh.financial.controller;

import com.ljh.financial.entity.Product;
import com.ljh.financial.service.ProductService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
    @ApiModelProperty(value = "test")
    public ResponseEntity test(@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }

}
