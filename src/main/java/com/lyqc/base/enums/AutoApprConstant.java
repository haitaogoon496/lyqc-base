package com.lyqc.base.enums;

/**
 * @description: 【前置规则模块】相关枚举
 * @Date : 2018/4/28 下午12:15
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class AutoApprConstant {
    /**
     * @description: 类型：
     * @Date : 2018/12/3 下午4:51
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ClassifyEnum implements EnumValue {
        PREPOSITION(1, "前置规则"),
        POSTPOSITION(2, "后置规则");

        ClassifyEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        private int index;
        private String name;

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getName() {
            return this.name;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(ClassifyEnum e : ClassifyEnum.values()){
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
        public static ClassifyEnum getByIndex(int index){
            for(ClassifyEnum e : ClassifyEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 规则类型枚举
     * @Date : 2018/4/28 下午2:20
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum BelongNameEnum implements EnumValue {
        CHECK(1, "校验类"),
        COMPUTE(2, "计算类");

        BelongNameEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        private int index;
        private String name;

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getName() {
            return this.name;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(BelongNameEnum e : BelongNameEnum.values()){
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
        public static BelongNameEnum getByIndex(int index){
            for(BelongNameEnum e : BelongNameEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据name获取枚举对象
         * @param name
         * @return
         */
        public static BelongNameEnum getByName(String name){
            for(BelongNameEnum e : BelongNameEnum.values()){
                if(e.getName().equals(name)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 前置规则类型
     * @Date : 2018/4/28 下午2:17
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum RuleTypeEnum implements EnumDesc {
        BACK(1, "B", "自动退回"),
        CANCEL(2, "C", "自动取消"),
        REJECT(3, "R", "自动拒绝");

        private Integer index;
        private String name;
        private String desc;

        RuleTypeEnum(Integer index,String name,String desc) {
            this.index = index;
            this.name = name;
            this.desc = desc;
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
            return this.desc;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(RuleTypeEnum e : RuleTypeEnum.values()){
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
        public static RuleTypeEnum getByIndex(int index){
            for(RuleTypeEnum e : RuleTypeEnum.values()){
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
        public static RuleTypeEnum getByDesc(String desc){
            for(RuleTypeEnum e : RuleTypeEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 操作符
     * @Date : 2018/4/28 下午2:20
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum OpIdnEnum implements EnumValue {
        IN(1, "in"),
        NOT_IN(2, "not in"),
        GT(3, ">"),
        GE(4, ">="),
        LT(5, "<"),
        LE(6, "<="),
        NE(7, "<>"),
        EQUAL(8, "="),
        //MOD_GT_100(9, "mod 100 >")
        ;

        OpIdnEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        private int index;
        private String name;

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getName() {
            return this.name;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(OpIdnEnum e : OpIdnEnum.values()){
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
        public static OpIdnEnum getByIndex(int index){
            for(OpIdnEnum e : OpIdnEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据操作符获取枚举对象
         * @param name
         * @return
         */
        public static OpIdnEnum getByName(String name){
            for(OpIdnEnum e : OpIdnEnum.values()){
                if(e.getName().equals(name)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 属性值类型
     * @Date : 2018/4/28 下午2:20
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum PropValueTypeEnum implements EnumDesc {
        STRING(1, "String","字符串"),
        INTEGER(20, "Integer","整型"),
        FLOAT(21, "float","浮点型"),
        EXPRESSION(30, "expression","表达式");

        private Integer index;
        private String name;
        private String desc;

        PropValueTypeEnum(Integer index,String name,String desc) {
            this.index = index;
            this.name = name;
            this.desc = desc;
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
            return this.desc;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(PropValueTypeEnum e : PropValueTypeEnum.values()){
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
        public static PropValueTypeEnum getByIndex(int index){
            for(PropValueTypeEnum e : PropValueTypeEnum.values()){
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
        public static PropValueTypeEnum getByDesc(String desc){
            for(PropValueTypeEnum e : PropValueTypeEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 属性值名称枚举
     * @Date : 2018/4/28 下午2:20
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum PropNameEnum implements EnumDesc, EnumRelevance {
        RATE_LEVEL(1, "rateLevel","利率档位", PropValueTypeEnum.STRING),
        A_COM_RATE(2, "aComRate","平台费利率", PropValueTypeEnum.FLOAT),
        IS_LCV(3, "isLcv","车类", PropValueTypeEnum.STRING),
        A_LOAN_PERIOD(4, "aLoanPeriod","申请贷款期限", PropValueTypeEnum.INTEGER),
        IS_OLD(5, "isOld","是否二手车", PropValueTypeEnum.STRING),
        PRODUCT_CODE(6, "productCode","产品code", PropValueTypeEnum.INTEGER),
        P_AGE(7, "pAge","申请人年龄", PropValueTypeEnum.INTEGER),
        A_INIT_SCALE(8, "aInitScale","申请首付款比例", PropValueTypeEnum.FLOAT),
        A_LOAN_AMOUNT(9, "aLoanAmount","申请贷款总金额", PropValueTypeEnum.FLOAT),
        FLOW_SEQ(10, "flowSeq","审批流程", PropValueTypeEnum.INTEGER),
        A_LOAN_RATE(11, "aLoanRate","申请贷款利率", PropValueTypeEnum.FLOAT),
        ACCOUNT_FEE(12, "accountFee","申请账户管理费", PropValueTypeEnum.FLOAT),
        GPS_FEE(13, "gpsFee","申请GPS费用", PropValueTypeEnum.FLOAT),
        A_YANBAO_FEE(14, "aYanbaoFee","申请第二年保险费", PropValueTypeEnum.FLOAT),
        COMPANY_CODE(15, "companyCode","经销商编码", PropValueTypeEnum.INTEGER),
        CAR_AGE(16, "carAge","车龄(月)", PropValueTypeEnum.INTEGER),
        DEALER_CODE(17, "dealerCode","门店编码", PropValueTypeEnum.INTEGER),
        A_CAR_LOAN_AMOUNT(18, "aCarloanAmount","申请车辆贷款金额", PropValueTypeEnum.FLOAT),
        IS_PRE_INTEREST(19, "isPreInterest","是否前置总利息", PropValueTypeEnum.STRING),
        COMPANY_LICENSE(20, "companyLicense","是否公牌", PropValueTypeEnum.INTEGER),
        PRODUCT_NAME(21, "productName","产品名称", PropValueTypeEnum.STRING),
        SALE_PRICE(22, "salePrice","实际销售价", PropValueTypeEnum.FLOAT),
        GPS_LEVEL(23, "gpsLevel","gps档位", PropValueTypeEnum.STRING),
        LIFE_INSURANCE_RATE(24, "lifeInsuranceRate","人身险费率", PropValueTypeEnum.FLOAT),
        GPS_COUNT(25, "gpsCount","GPS安装数量", PropValueTypeEnum.INTEGER),
        EXPRESSION(26,"expression","通用表达式", PropValueTypeEnum.EXPRESSION),

        R_A_CAR_LOAN_AMOUNT(27,"rACarloanAmount", "批复车辆贷款金额", PropValueTypeEnum.FLOAT),
        R_LOAN_AMOUNT(28,"rLoanAmount", "批复总贷款", PropValueTypeEnum.FLOAT),
        R_INIT_PAYMENT(29,"rInitPayment", "批复首付", PropValueTypeEnum.FLOAT),
        R_INIT_SCALE(30,"rInitScale", "批复首付比", PropValueTypeEnum.FLOAT),
        R_LOAN_PERIODS(31,"rLoanPeriods", "贷款期限", PropValueTypeEnum.INTEGER),
        R_LOAN_RATE(32,"rLoanRate", "批复贷款年利率", PropValueTypeEnum.FLOAT),
        R_RATE_LEVEL(33,"rRateLevel", "批复利率档位",PropValueTypeEnum.STRING),
        PRE_LOAN_RATE(34,"preLoanRate", "批复贴息前利率", PropValueTypeEnum.FLOAT),
        REPLY_THEFT_PROTECTION_FEE(35,"replyTheftProtectionFee", "批复盗抢险费用", PropValueTypeEnum.FLOAT),
        REPLY_THEFT_PROTECTION_REBATE(36,"replyTheftProtectionRebate", "批复盗抢险返佣", PropValueTypeEnum.FLOAT),
        R_GPS_FEE(37,"rGpsFee", "批复GPS费用", PropValueTypeEnum.FLOAT),
        R_SECURE_FEE(38,"rSecureFee", "批复保险费", PropValueTypeEnum.FLOAT),
        R_COM_FEE(39,"rComFee", "账户管理费(平台费)", PropValueTypeEnum.FLOAT),
        R_YANBAO_FEE(40,"rYanbaoFee", "第二年保险费", PropValueTypeEnum.FLOAT),
        R_YANBAO_FEE3(41,"rYanBaoFee3", "第三年保险费", PropValueTypeEnum.FLOAT),
        R_ACCOUNT_FEE(42,"rAccountFee", "账户管理费2", PropValueTypeEnum.FLOAT),
        R_EXTEND_COST(43,"rExtendCost", "批复延保费", PropValueTypeEnum.FLOAT),
        R_GROSS_INTEREST(44,"rGrossInterest", "前置总利息", PropValueTypeEnum.FLOAT),
        NOTARIZATION_FEE(45,"notarizationFee", "评估公证等其他费用", PropValueTypeEnum.FLOAT),
        R_LIFE_INSURANCE(46,"rLifeInsurance", "批复人身保险费", PropValueTypeEnum.FLOAT),
        REPLY_RENEW_COMMISSION(47,"replyRenewCommission", "批复续保押金", PropValueTypeEnum.FLOAT),
        GPS_REBATE(48,"gpsRebate", "GPS返佣费", PropValueTypeEnum.FLOAT),
        SER_FIN_REBATE(49,"serFinRebate", "平台费返佣费", PropValueTypeEnum.FLOAT),
        A_CAR_PRICE_CHANGE(50,"aCarPriceChange", "二手车调整价", PropValueTypeEnum.FLOAT),
        A_CAR_PRICE(51,"aCarPrice", "二手车评估价", PropValueTypeEnum.FLOAT);

        private Integer index;
        private String name;
        private String desc;
        private PropValueTypeEnum relevance;
        private ClassifyEnum[] classifyEnums;

        PropNameEnum(Integer index,String name,String desc,PropValueTypeEnum relevance) {
            this.index = index;
            this.name = name;
            this.desc = desc;
            this.relevance = relevance;
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
            return this.desc;
        }

        @Override
        public PropValueTypeEnum getRelevance() {
            return this.relevance;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(PropNameEnum e : PropNameEnum.values()){
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
        public static PropNameEnum getByIndex(int index){
            for(PropNameEnum e : PropNameEnum.values()){
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
        public static PropNameEnum getByDesc(String desc){
            for(PropNameEnum e : PropNameEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据name获取枚举对象
         * @param name 名称
         * @return
         */
        public static PropNameEnum getByName(String name){
            for(PropNameEnum e : PropNameEnum.values()){
                if(e.getName().equals(name)){
                    return e;
                }
            }
            return null;
        }
    }

}
