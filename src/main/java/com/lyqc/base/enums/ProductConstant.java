package com.lyqc.base.enums;

/**
 * @description: 车贷产品常量枚举实体类
 * @Date : 下午1:52 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public final class ProductConstant {
    /**
     * @description: 产品名称枚举
     * @Date : 2018/3/14 下午12:40
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ProductNameEnum {
        PF(1, "浦发","PF"),
        NY(2, "南粤","NY"),
        XHC(3, "新华昌","XHC"),
        GH(4, "工行","GH"),
        WZ(5, "微众","WZ"),
        ZBYH(6, "众邦","ZBYH"),
        CM(7, "财米","CM"),
        BH(8, "渤海","BH"),
        PFLS(9, "浦发零售","PFLS"),
        TP(10, "天浦","TP"),
        SCGH(11,"四川工行","SCGH"),
        HBGH(12,"湖北工行","HBGH")
        ;
        /**
         * 索引
         */
        private int index;
        /**
         * 中文简称
         */
        private String shortName;
        /**
         * 英文代称
         */
        private String englishName;

        public int getIndex() {
            return index;
        }

        public String getShortName() {
            return shortName;
        }

        public String getEnglishName() {
            return englishName;
        }

        ProductNameEnum(int index, String shortName, String englishName) {
            this.index = index;
            this.shortName = shortName;
            this.englishName = englishName;
        }
        /**
         * 根据产品名称获取对应枚举
         * @param productName 产品名称
         * @return ProductNameEnum
         */
        public static ProductNameEnum getByProductName(String productName){
            for(ProductNameEnum e : ProductNameEnum.values()){
                if(productName.contains(e.getShortName())){
                    return e;
                }
            }
            return null;
        }
        /**
         * 根据产品名称获取对应枚举的英文名称
         * @param productName 产品名称
         * @return 英文名称
         */
        public static String getEnglishByProductName(String productName){
            ProductNameEnum productNameEnum = ProductNameEnum.getByProductName(productName);
            return null == productNameEnum ? null : productNameEnum.getEnglishName();
        }
    }
    /**
     * @description: 延保费类别
     * 2：第二年保险费 3：第三年保险费
     * @Date : 2017/12/14 上午10:54
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum YbtcClassifyEnum implements EnumValue {

        SECOND_YEAR(2, "第二年保险费"),
        THIRD_YEAR(3, "第三年保险费");

        private int index;
        private String name;

        YbtcClassifyEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }
        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(YbtcClassifyEnum e : YbtcClassifyEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }
        /**
         * 根据索引获取枚举对象
         * @param index 索引
         * @return YbtcClassifyEnum
         */
        public static YbtcClassifyEnum getByIndex(int index){
            for(YbtcClassifyEnum e : YbtcClassifyEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 产品费用规则分类
     * @Date : 2017/12/26 下午1:24
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum FeeRuleClassifyEnum implements EnumValue {

        LIFE_INSURANCE(1, "个人保障计划配置"),
        RENEWAL_COMMISSION(2, "续保押金配置"),
        CAR_INSURANCE(3, "车辆保险"),
        CAR_INTEREST(4, "车辆贴息"),
        THEFT_PROTECTION(5,"盗抢险配置"),
        ENJOY_PACK(6,"超享包"),
        ;

        private int index;
        private String name;

        FeeRuleClassifyEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String getNameByIndex(int index){
            for(FeeRuleClassifyEnum e : FeeRuleClassifyEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static FeeRuleClassifyEnum getByIndex(int index){
            for(FeeRuleClassifyEnum e : FeeRuleClassifyEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 车贷产品状态 枚举
     * @Date : 2017/9/27 下午2:55
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ProductStatusEnum implements EnumValue {

        WAIT_REVIEW(0, "待复核"),
        ENABLE(1, "启用"),
        REVIEW_PASS(2, "复核通过"),
        REVIEW_NOT_PASS(3, "复核不通过"),
        CANCEL(4, "撤销"),
        PAUSE(5, "暂停"),
        WAIT_SUBMIT(6, "待提交");

        ProductStatusEnum(int index, String name) {
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
            for(ProductStatusEnum e : ProductStatusEnum.values()){
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
        public static ProductStatusEnum getByIndex(int index){
            for(ProductStatusEnum e : ProductStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }


    /**
     * @description: 贴息计算方式 枚举
     * @Date : 下午12:48 2018/2/5
     * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
     */
    public enum ComFlagEnum implements EnumValue {
        TJE(1, "贴金额"),
        TDS(2, "贴点数");

        ComFlagEnum(int index, String name) {
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
            for(ComFlagEnum e : ComFlagEnum.values()){
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
        public static ComFlagEnum getByIndex(int index){
            for(ComFlagEnum e : ComFlagEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 产品规则类型
     */
    public enum RuleClassifyEnum implements EnumDesc {
        R_INTE(1, "R_INTE", "贴息规则"),
        R_GPS(2, "R_GPS", "GPS规则"),
        R_SECURE(3, "R_SECURE", "保险及其他费费用规则"),
        R_BOND(4, "R_BOND", "保证金费用规则");

        RuleClassifyEnum(Integer index, String name, String desc) {
            this.index = index;
            this.name = name;
            this.desc = desc;
        }

        private int index;
        private String name;
        private String desc;

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }
        @Override
        public String getDesc() {
            return desc;
        }

        /**
         * 根据索引获取名称
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index){
            for(RuleClassifyEnum e : RuleClassifyEnum.values()){
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
        public static RuleClassifyEnum getByIndex(int index){
            for(RuleClassifyEnum e : RuleClassifyEnum.values()){
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
        public static RuleClassifyEnum getByDesc(String desc){
            for(RuleClassifyEnum e : RuleClassifyEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }
    }
}
