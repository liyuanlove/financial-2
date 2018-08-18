package com.ljh.financial.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author liangjh
 * @create 2018-08-18 16:42
 **/
@Data
public class AddProductDto {


    @ApiModelProperty(value = "产品名字")
    @NotBlank(message = "产品名字不能为空")
    private String name;

    @ApiModelProperty(value = "起投金额")
    @NotNull(message = "起投金额不能为空")
    private BigDecimal thresholdAmount;

    @ApiModelProperty(value = "投资步长")
    @NotNull(message = "投资步长不能为空")
    private BigDecimal stepAmount;

    @ApiModelProperty(value = "锁定期")
    @NotNull(message = "锁定期不能为空")
    private Short lockTerm;

    @ApiModelProperty(value = "收益率, 0-100百分比")
    @NotNull(message = "收益率不能为空")
    private BigDecimal rewardRate;

    @ApiModelProperty(value = "状态,AUDITING('审核中'),IN_SALE('销售中'),LOCKED('锁定'),FINISHED('已结束')")
    @NotNull(message = "状态不能为空")
    private String status;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "创建者")
    private String createUser;

    @ApiModelProperty(value = "更新者")
    private String updateUser;
}
