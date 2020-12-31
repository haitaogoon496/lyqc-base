package com.lyqc.product.dto;

import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @description: 产品费用项重置DTO
 * @see <a href="http://conf.op.mljr.com/pages/viewpage.action?pageId=27463482">http://conf.op.mljr.com/pages/viewpage.action?pageId=27463482</a>
 * <pre>
 * 适用于辛巴APP，用于控制APP产品费用规则重置，具体就是根据输入的费用规则字段以及原先相关费用项相关选择项
 * 根据系统当前配置，判断每个费用项已选择的是否需要清空重置
 * </pre>
 * @Date : 2018/10/29 下午2:21
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class FeeResetDTO extends FeeRuleDTO{
    private static final long serialVersionUID = 7392957639206296929L;
    @ApiModelProperty(name="licenseType", value = "车牌类型(0:私牌、1:公牌、2:挂靠公牌、3:以租代购)", dataType = "String")
    @EnumValidation(enums = ConstEnum.LicenceTypeEnum.class,message = "[车牌类型]非法值，必须({0})")
    private String licenseType;
    @ApiModelProperty(name="carAge",value="车龄",dataType="BigDecimal")
    private BigDecimal carAge;
    @ApiModelProperty(name="course",value="车里程数",dataType="BigDecimal")
    private BigDecimal course;
    @ApiModelProperty(name="rateLevel",value="GPS档位",dataType="String")
    private String rateLevel;
    @ApiModelProperty(name="gpsLevel",value="利率档位",dataType="String")
    private String gpsLevel;
    @ApiModelProperty(name="comRate",value="平台费率",dataType="BigDecimal")
    private BigDecimal comRate;
    @ApiModelProperty(name="secondYearPremiumTcId",value="第二年保险费规则ID",dataType="Long")
    private Integer secondYearPremiumTcId;
    @ApiModelProperty(name="thirdYearPremiumTcId",value="第三年保险费规则ID",dataType="Long")
    private Integer thirdYearPremiumTcId;
    @ApiModelProperty(name="accountAmount",value="账户管理费",dataType="Long")
    private BigDecimal accountAmount;
    @ApiModelProperty(name="renewalCommissionRuleId",value="续保押金ID",dataType="Long")
    private Integer renewalCommissionRuleId;
    @ApiModelProperty(name="lifeInsuranceRate",value="人身保险费费率",dataType="Long")
    private BigDecimal lifeInsuranceRate;
    @ApiModelProperty(name="theftProtectionFee",value="盗抢险金额",dataType="BigDecimal")
    private BigDecimal theftProtectionFee;
    @ApiModelProperty(name="theftProtectionId",value="盗抢险ID",dataType="Integer")
    private Integer theftProtectionId;
    @ApiModelProperty(name="enjoyPackId",value="超享包ID",dataType="Integer")
    private Integer enjoyPackId;

}
