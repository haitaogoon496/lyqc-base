package com.lyqc.heil.enums;
/**
 * @description: 后置规则相关枚举
 * 业务场景：适用于控制复审审批，主要提供给产品运营配置使用
 * @Date : 2018/11/30 下午2:34
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class PostPositionConstant {
    /**
     * 规则类型
     */
    public enum RuleTypeEnum {
        CALCULATION(1, "计算类"),
        COMPARE(2, "比较类");

        private Integer value;
        private String name;

        RuleTypeEnum(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static RuleTypeEnum getRuleTypeEnum(Integer ruleType) {
            for (RuleTypeEnum e : RuleTypeEnum.values()) {
                if (e.getValue() == ruleType) {
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 业务类型枚举
     */
    public enum BusinessTypeEnum{
        ORDINARY_RULE(0,"普通规则"),
        LTV_RULE(1,"TLV规则"),
        HIGH_QUALITY_USER(2,"优质用户规则");

        private Integer value;
        private String name;

        BusinessTypeEnum(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * 规则参数列表
     */
    public enum VariableEnum {
        RACarloanAmount("rACarloanAmount", "批复车辆贷款金额"),
        RLoanAmount("rLoanAmount", "批复总贷款"),
        RInitPayment("rInitPayment", "批复首付"),
        RInitScale("rInitScale", "批复首付比"),
        RLoanPeriods("rLoanPeriods", "贷款期限"),
        RLOANRATE("rLoanRate", "批复贷款年利率"),
        ISPRINTW("isPrintW", "是否打印配偶"),
        RRateLevel("rRateLevel", "批复利率档位"),
        preloanRate("preloanRate", "批复贴息前利率"),
        SalePrice("ralePrice", "实际销售价"),
        RGpsFee("rGpsFee", "批复GPS费用"),
        RSecureFee("rSecureFee", "批复保险费"),
        RComFee("rComFee", "账户管理费(平台费)"),
        RYanbaoFee("rYanbaoFee", "第二年保险费"),
        RYanBaoFee3("rYanBaoFee3", "第三年保险费"),
        RAccountFee("rAccountFee", "账户管理费2"),
        RextendCost("rextendCost", "批复延保费"),
        RgrossInterest("rgrossInterest", "前置总利息"),
        NotarizationFee("notarizationFee", "评估公证等其他费用"),
        RLifeInsurance("rLifeInsurance", "批复人身保险费"),
        replyRenewCommission("replyRenewCommission", "批复续保押金"),
        ProductName("productName", "产品类型"),
        GpsFee("gpsFee", "GPS费"),
        GpsRebate("gpsRebate", "GPS返佣费"),
        SerFinRebate("serFinRebate", "平台费返佣费"),
        IsPreInterest("isPreInterest", "前置总利息"),
        ACarPriceChange("aCarPriceChange", "二手车调整价"),
        ACarPrice("aCarPrice", "二手车评估价"),
        ALoanAmount("aLoanAmount", "申请总贷款"),
        idno("idno", "申请人身份证号"),
        AComRate("aComRate", "平台费利率"),
        monthPay("monthPay", "月供"),
        incomeMonth("incomeMonth", "税后月收入"),
        incomeOth("incomeOth", "其他月收入");

        private String name;
        private String remark;

        VariableEnum(String name, String remark) {
            this.name = name;
            this.remark = remark;
        }

        public String getName() {
            return name;
        }

        public String getRemark() {
            return remark;
        }

        public static VariableEnum getVariableEnum(String ruleType) {
            for (VariableEnum e : VariableEnum.values()) {
                if (e.getName().equals(ruleType)) {
                    return e;
                }
            }
            return null;
        }
    }

    public enum DetailTypeEnum {
        FILTER(1, "筛选类"),
        INTERCEPTOR(2, "拦截类"),
        LTV_CALCULATION(3,"LTV计算类");

        private int index;
        private String name;

        DetailTypeEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public enum TargetTypeEnum {
        GIVEN(1, "指定值"),
        VARIABLE(2, "订单中对应字段的值"),
        MIN_VALUE(3, "min方法结果值"),
        MAX_VALUE(4, "max方法结果值"),
        FORMULA_VALUE(5, "自定义公式值");

        private int index;
        private String remark;

        public int getIndex() {
            return index;
        }

        public String getRemark() {
            return remark;
        }

        TargetTypeEnum(int index, String remark) {
            this.index = index;
            this.remark = remark;
        }

        public static TargetTypeEnum getTargetTypeEnumByIndex(int targetType) {
            for (TargetTypeEnum targetTypeEnum : TargetTypeEnum.values()) {
                if (targetTypeEnum.getIndex() == targetType) {
                    return targetTypeEnum;
                }
            }
            return null;
        }
    }

    public enum OpSymbolEnum {
        IN("in", "包含"),
        NOTIN("not in", "不包含"),
        NOT_EQUAL("<>", "不等于"),
        EQUAL("=", "等于"),
        LESS("<", "小于"),
        GREATER(">", "大于"),
        GREATER_OR_EQUAL(">=", "大于等于"),
        LESS_OR_EQUAL("<=", "小于等于");

        private String operator;

        private String desc;

        public static OpSymbolEnum getOperator(String symbol) {
            for (OpSymbolEnum operator : OpSymbolEnum.values()) {
                if (operator.getOperator().equals(symbol)) {
                    return operator;
                }
            }
            return null;
        }

        OpSymbolEnum(String operator, String desc) {
            this.operator = operator;
            this.desc = desc;
        }

        public String getOperator() {
            return operator;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 规则展示类型
     */
    public enum ShowTypeEnum{
        NOT_SHOW(0,"不展示"),
        LTV(1,"LoanToValue");

        private int index;
        private String remark;

        public int getIndex() {
            return index;
        }

        public String getRemark() {
            return remark;
        }

        ShowTypeEnum(int index, String remark) {
            this.index = index;
            this.remark = remark;
        }
    }
}

