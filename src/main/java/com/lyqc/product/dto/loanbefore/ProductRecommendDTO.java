package com.lyqc.product.dto.loanbefore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 贷前更换资方获取产品列表校验DTO
 * @Date : 2018/12/12 11:18
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
public class ProductRecommendDTO extends RuleRecommendDTO{
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotNull(message = "[appCode]appCode不能为空")
    private String appCode;
    @ApiModelProperty(name="accountAmount",value="账户管理费",dataType="BigDecimal")
    private BigDecimal accountAmount;
    @ApiModelProperty(name="fundNo",value="资金方No",dataType="String")
    @NotNull(message = "[fundNo]资金方No不能为空")
    private String fundNo;
    @ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
    @NotNull(message = "[carAge]车龄(月)不能为空")
    private BigDecimal carAge;
    @ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
    @NotNull(message = "[course]车辆里程不能为空")
    private BigDecimal course;
}
