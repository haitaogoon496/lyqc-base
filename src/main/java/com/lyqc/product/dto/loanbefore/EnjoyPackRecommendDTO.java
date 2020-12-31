package com.lyqc.product.dto.loanbefore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 贷前更换资方获取【超享包】规则列表
 * @Date : 2019/1/17 16:08
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
public class EnjoyPackRecommendDTO extends BaseRecommentDTO{
    @ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
    @NotNull(message = "[carAge]车龄(月)不能为空")
    private BigDecimal carAge;
    @ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
    @NotNull(message = "[course]车辆里程不能为空")
    private BigDecimal course;
    @ApiModelProperty(name = "enjoyPackRebateFee", value = "批复超享包返佣费",dataType = "BigDecimal")
    private BigDecimal enjoyPackRebateFee;
    @ApiModelProperty(name="theftProtectionId",value="盗抢险ID",dataType="Integer")
    private Integer theftProtectionId;
    @ApiModelProperty(name="renewalCommissionRuleId",value="续保押金ID",dataType="Integer")
    private Integer renewalCommissionRuleId;
    @ApiModelProperty(name = "gpsLevel", value = "gps档位",dataType = "String")
    private String gpsLevel;
}
