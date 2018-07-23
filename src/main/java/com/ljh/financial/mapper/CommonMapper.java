package com.ljh.financial.mapper;


import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author liangjh
 * @create 2018-07-22 19:07
 **/
@Repository
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
