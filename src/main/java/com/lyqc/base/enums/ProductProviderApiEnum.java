package com.lyqc.base.enums;

/**
 * @description: Car-Product金融产品接口服务提供的restful API地址，用于第三方接入
 * 比如：lyqc-cas、crm-app、channel-sp-web、poseidon等。
 * wiki地址：http://conf.op.mljr.com/pages/viewpage.action?pageId=15582653
 * @Date : 2018/4/28 下午6:09
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum  ProductProviderApiEnum implements EnumDesc{

    feeRuleChosen_queryForCas(1, "/feeRuleChosen/queryForCas", "力蕴系统获取相关规则"),
    feeRuleChosen_queryForApp(2, "/feeRuleChosen/queryForApp", "app系统获取相关规则"),
    productEngine_call(3, "/productEngine/call", "产品费用计算总接口"),
    productEngine_callSerLoanAfterMngRate(32, "/productEngine/callSerLoanAfterMngRate", "计算服务人贷后管理费率"),

    productExpression_querySecureExpression(4, "/productExpression/querySecureExpression", "【产品规则公式】查询保险费规则公式"),
    productExpression_queryDiscountExpression(5, "/productExpression/queryDiscountExpression", "【产品规则公式】查询贴息规则公式"),


    productRule_queryLoanRateRules(6, "/productRule/queryLoanRateRules", "【产品费用规则】获取利率规则配置"),
    productRule_queryGpsRules(7, "/productRule/queryGpsRules", "【产品费用规则】获取GPS规则"),
    productRule_querySerFinRules(8, "/productRule/querySerFinRules", "【产品费用规则】获取平台费相关费率"),
    productRule_queryAccountRules(9, "/productRule/queryAccountRules", "【产品费用规则】查询账户管理费用规则"),
    productRule_queryExtendSafeRules(10, "/productRule/queryExtendSafeRules", "【产品费用规则】查询延保费规则"),
    productRule_queryPremiumsRules(12, "/productRule/queryPremiumsRules", "【产品费用规则】查询第二/三年保险费规则"),
    productRule_queryInsuranceRules(13, "/productRule/queryInsuranceRules", "【产品费用规则】个人保障计划费用规则"),
    productRule_queryHighRiskProduct(14, "/productRule/queryHighRiskProduct", "【产品费用规则】获取高风险高定价产品相应(贷款高风险利率，平台费高风险利率)"),

    ybtcApply_queryApplyProduct(15, "/ybtcApply/queryApplyProduct", "【延保费适用产品配置】查询支持产品列表"),
    productType_queryList(16, "/productType/queryList/{isQuick}", "【贷款产品】查询分类列表"),// get请求

    product_queryList(17, "/product/queryList", "【贷款产品】查询产品列表"),
    product_queryInfo(18, "/product/queryInfo/{productId}", "【贷款产品】根据产品id查询产品详情"),
    product_checkPass(19, "/product/checkPass", "【贷款产品】车贷产品配置项生效，提交订单检查"),

    feeCompute_callMonthFee(20, "/feeCompute/callMonthFee", "【通用费用计算】等额本息月供计算"),
    feeCompute_callGrossInterest(21, "/feeCompute/callGrossInterest", "【通用费用计算】总利息计算"),
    feeCompute_callMonthFeeAndGrossInterest(22, "/feeCompute/callMonthFeeAndGrossInterest", "【通用费用计算】月供和总利息计算"),
    feeCompute_callCarSecure(23, "/feeCompute/callCarSecure", "【通用费用计算】车辆保险"),
    feeCompute_callCarDiscount(24, "/feeCompute/callCarDiscount", "【通用费用计算】车辆贴息"),
    feeCompute_callSerFin(25, "/feeCompute/callSerFin", "【通用费用计算】平台费"),
    feeCompute_callInitScale(26, "/feeCompute/callInitScale", "【通用费用计算】首付比"),
    feeCompute_callInitPayment(27, "/feeCompute/callInitPayment", "【通用费用计算】首付款"),

    dictionary_options(28, "/dictionary/options/{argControlType}", "【金融产品】数据字典"),// get请求
    grayScaleControl_checkOrder(29, "/grayScaleControl/checkOrder", "根据订单对外提供的灰度控制接口"),
    traceLog_saveLog(30, "/trace/saveLog", "产品计算日志插入日志"),
    common_getSwitch(31, "/common/getSwitch/{0}", "【通用模块】获取全局参数开关"),// get请求
    productType_AllList(32,"/productType/queryProductType","获取所有的产品分类列表"),
    product_listForCas(33,"/product/queryListForCas","为lyqc-cas提供的查询列表接口"),
    common_getConfigValueByParamKey(34,"/common/getConfigValueByParamKey/{0}","获取配置信息"),// get请求
    querySerFinRateByDealerAndWorkflow(35,"/productRule/querySerFinByDealerAndWorkflow","通过门店和工作流获取平台费率集合"),
    querySecureRules_byProductId(36,"/productRule/querySecureFinRules/{productId}","查询绑定产品的保险规则"),
    position_queryPrePositionRules(37,"/position/queryPrePositionRules","获取前置规则及属性"),
    position_queryPostPositionRules(38,"/position/queryPostPositionRules","获取后置规则及属性"),
    position_processPrePosition(39,"/position/processPrePosition","执行前置规则"),
    ;

    private Integer index;
    private String name;
    private String value;

    ProductProviderApiEnum(Integer index,String name,String desc) {
        this.index = index;
        this.name = name;
        this.value = desc;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesc() {
        return this.value;
    }


    public static String getNameByIndex(int index){
        for(ProductProviderApiEnum e : ProductProviderApiEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param index 索引
     * @return
     */
    public static ProductProviderApiEnum getByIndex(int index){
        for(ProductProviderApiEnum e : ProductProviderApiEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param desc 索引
     * @return
     */
    public static ProductProviderApiEnum getByDesc(String desc){
        for(ProductProviderApiEnum e : ProductProviderApiEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
}
