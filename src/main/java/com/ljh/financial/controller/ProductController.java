package com.ljh.financial.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangjh
 * @create 2018-07-22 17:03
 **/
@RestController
@Api(description = "test")
@RequestMapping("/")
public class ProductController {

    @GetMapping
    @ApiModelProperty(value = "test")
    public ResponseEntity test() {
        return ResponseEntity.ok("asdasdasd");
    }

}
