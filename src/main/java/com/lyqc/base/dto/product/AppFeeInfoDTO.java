package com.lyqc.base.dto.product;

import com.lyqc.base.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description 申请单费用详情DTO对象，用于承载主表Ca_app_info相关拆解费用
 * @Date : 2018/4/9
 * @Author : 樊康康(kangkang.fan@mljr.com)
 */
@Data
public class AppFeeInfoDTO extends BaseEntity {

    private static final long serialVersionUID = -6646021081084092726L;

    @ApiModelProperty(name="gpsFloatFee",value="gps费自主金额",dataType="BigDecimal")
    private BigDecimal gpsFloatFee;

    @ApiModelProperty(name="commFloatFeeRate",value="平台费自主费率",dataType="BigDecimal")
    private BigDecimal commFloatFeeRate;

}
