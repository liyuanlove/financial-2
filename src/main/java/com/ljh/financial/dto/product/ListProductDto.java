package com.ljh.financial.dto.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author liangjh
 * @create 2018-08-19 22:39
 **/
@Data
public class ListProductDto {

    @ApiModelProperty(value = "id")
    private List<Integer> id;

    @ApiModelProperty(value = "最小收益率")
    private BigDecimal minRewardRate;

    @ApiModelProperty(value = "最大收益率")
    private BigDecimal maxRewardRate;

    @ApiModelProperty(value = "状态")
    private List<String> status;

}
