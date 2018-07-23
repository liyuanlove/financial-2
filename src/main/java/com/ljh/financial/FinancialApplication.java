package com.ljh.financial;

import com.ljh.financial.mapper.CommonMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ljh.financial.mapper", markerInterface = CommonMapper.class)
public class FinancialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialApplication.class, args);
	}
}
