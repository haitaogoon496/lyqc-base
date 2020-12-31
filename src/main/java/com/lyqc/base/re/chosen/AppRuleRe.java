package com.lyqc.base.re.chosen;

import com.lyqc.base.common.BaseRe;
import com.lyqc.base.re.product.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 贷款申请单费用规则Re对象
 * 业务场景：适用于APP客户端选择相关费用项、费率
 * 业务背景：该Re对象基于对 lyqc-crm 的重构封装：/lyqcapi/data/getRules
 * @Date : 下午3:19 2018/3/22
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class AppRuleRe extends BaseRe {
    private static final long serialVersionUID = -2720160876967640372L;
    /**
     * 灰度开关
     */
    @ApiModelProperty(name="graySwitch",value="灰度是否准入",dataType="graySwitch")
    private boolean graySwitch;
    /**
     * 平台费
     */
    @ApiModelProperty(name="serFinRuleList",value="平台费",dataType="List<SerFinRuleRe>")
    private List<SerFinRuleRe> serFinRuleList;
    /**
     * 延保费
     */
    @ApiModelProperty(name="extendSafeList",value="延保费",dataType="List<ExtendSafeRe>")
    private List<ExtendSafeRe> extendSafeList;
    /**
     * 账号管理费
     */
    @ApiModelProperty(name="accountRuleList",value="账号管理费",dataType="List<AccountRuleRe>")
    private List<AccountRuleRe> accountRuleList;
    /**
     * 第二年保险费套餐
     */
    @ApiModelProperty(name="premiumsTc2List",value="第二年保险费套餐",dataType="List<PremiumsTcRe>")
    private List<PremiumsTcRe> premiumsTc2List;
    /**
     * 第三年保险费套餐
     */
    @ApiModelProperty(name="premiumsTc3List",value="第三年保险费套餐",dataType="List<PremiumsTcRe>")
    private List<PremiumsTcRe> premiumsTc3List;
    /**
     * 人身保险(个人保障计划)
     */
    @ApiModelProperty(name="lifeInsurance",value="人身保险(个人保障计划)",dataType="List<LifeInsuranceRe>")
    private List<LifeInsuranceRe> lifeInsuranceList;
    /**
     * 支持第X年保险费的相关产品
     */
    @ApiModelProperty(name="ybtcApplyProduct",value="支持第X年保险费的相关产品",dataType="YbtcApplyProductRe")
    private YbtcApplyProductRe ybtcApplyProduct;

    /**
     * 续保押金规则
     */
    @ApiModelProperty(name="renewalCommissionRuleReList",value="续保押金规则",dataType="List<RenewalCommissionRuleRe>")
    private List<RenewalCommissionRuleRe> renewalCommissionRuleReList;

    /**
     * 盗抢险规则
     */
    @ApiModelProperty(name="theftProtectionReList",value="盗抢险规则",dataType="List<TheftProtectionRe>")
    private List<TheftProtectionRe> theftProtectionReList;
}
