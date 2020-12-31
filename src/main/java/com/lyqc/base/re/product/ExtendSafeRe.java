package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description 延保费规则实体类
 * @Date : 2018/3/15
 * @Author : 樊康康(kangkang.fan@mljr.com)
 */
@Data
public class ExtendSafeRe extends BaseRe{

    private static final long serialVersionUID = 8084540231752516601L;
    @ApiModelProperty(name="name",value="套餐名称",dataType="String")
    private String name;
    @ApiModelProperty(name="fee",value="套餐费用",dataType="BigDecimal")
    private BigDecimal fee;
}
