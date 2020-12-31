package com.lyqc.heil.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: 标签相关常量枚举
 * @Date : 2018/6/6 上午11:12
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class TagConstant {
    /**
     * @description: 业务类型枚举
     * 对应pd_tags表中的业务类型
     * @Date : 下午10:43 2018/6/4
     * @Author : zhaoxin
     */
    public enum BuzTypeEnum implements EnumValue {
        SER_FIN_RULE(1,"平台费规则"),
        GPS_RULE(2,"GPS规则"),
        RATE_RULE(3,"利率规则"),
        INSURANSE_SECOND_YEAR(4,"第二年保险费规则"),
        INSURANSE_THIRD_YEAR(5,"第三年保险费规则"),
        ACCOUNT_RULE(6,"账户管理费规则"),
        YAN_BAO_RULE(7,"延保费规则"),
        LIFE_INSURANSE(8,"人身保险费规则"),
        SER_FIN_RULE_GROUP(9,"平台费规则组"),
        PRODUCT(10,"车贷产品"),
        RENEWAL_COMMISSION(11,"续保押金"),
        DISCOUNT(12,"贴息规则"),
        INSURANCE(13,"保险费用规则"),
        THEFT_INSURANCE(14,"盗抢险规则"),
        SY_ARG_CONTROL(15,"数据字典"),
        PD_CONFIG_PARAM(16,"全局参数配置"),
        ENJOY_PACK(17,"超享包"),
        PD_FEE(18, "pdFeeRule所有的规则");

        private int index;
        private String name;

        BuzTypeEnum(int index, String name) {
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
            for(BuzTypeEnum e : BuzTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static BuzTypeEnum getByIndex(int index){
            for(BuzTypeEnum e : BuzTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }


        public static TagConstant.BuzTypeEnum getTagTypeByClassify(Integer pdFeeClassify) {
            if (pdFeeClassify != null && pdFeeClassify != 0) {
                switch (pdFeeClassify) {
                    // 人身保险
                    case 1:
                        return TagConstant.BuzTypeEnum.LIFE_INSURANSE;
                    //续保押金
                    case 2:
                        return TagConstant.BuzTypeEnum.RENEWAL_COMMISSION;
                    // 车辆保险
                    case 3:
                        return TagConstant.BuzTypeEnum.INSURANCE;
                    // 车辆贴息
                    case 4:
                        return TagConstant.BuzTypeEnum.DISCOUNT;
                    // 盗抢险
                    case 5:
                        return TagConstant.BuzTypeEnum.THEFT_INSURANCE;
                    //超享包
                    case 6:
                        return TagConstant.BuzTypeEnum.ENJOY_PACK;
                }
            }
            return null;
        }
    }

}
