package com.lyqc.base.enums;

import java.util.function.Function;

/**
 * @description: 产品规则条件相关枚举
 * @Date : 2018/4/15 上午11:18
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class RuleConditionConstant {
    /**
     * 获取索引字符串，用,分割
     * @return
     */
    public static String indexes(EnumValue[] enumValues){
        return indexes(enumValues,e -> String.valueOf(e.getIndex()));
    }

    /**
     * 获取索引字符串，用,分割
     * @return
     */
    public static String indexes(EnumValue[] enumValues, Function<EnumValue,String> function){
        StringBuilder sb = new StringBuilder();
        for(EnumValue e : enumValues){
            String value = function.apply(e);
            if(null != value && !"".equals(value)){
                sb.append(value).append(",");
            }
        }
        String indexes = sb.toString();
        if(indexes.length() > 0 && indexes.endsWith(",")){
            indexes = indexes.substring(0,indexes.length() - 1);
        }
        return indexes;
    }

    /**
     * @description: 是否二手车
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsOldEnum implements EnumValue {
        YES(1, "是"),
        NO(0, "否");

        IsOldEnum(int index, String name) {
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
            for(IsOldEnum e : IsOldEnum.values()){
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
        public static IsOldEnum getByIndex(int index){
            for(IsOldEnum e : IsOldEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 获取索引字符串，用,分割
         * @return
         */
        public static String indexes(){
            return RuleConditionConstant.indexes(IsOldEnum.values());
        }
    }
    /**
     * @description: 是否提供房产
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsHouseEnum implements EnumValue {
        YES(1, "是"),
        NO(0, "否");

        IsHouseEnum(int index, String name) {
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
            for(IsHouseEnum e : IsHouseEnum.values()){
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
        public static IsHouseEnum getByIndex(int index){
            for(IsHouseEnum e : IsHouseEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 获取索引字符串，用,分割
         * @return
         */
        public static String indexes(){
            return RuleConditionConstant.indexes(IsHouseEnum.values());
        }
    }
    /**
     * @description: 车类
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsLcvEnum implements EnumValue {
        PASSENGER(0, "乘用车"),
        LCV(1, "LCV"),
        MMPV(2, "MMPV"),
        COMMERCIAL(3, "商用车");
        IsLcvEnum(int index, String name) {
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
            for(IsLcvEnum e : IsLcvEnum.values()){
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
        public static IsLcvEnum getByIndex(int index){
            for(IsLcvEnum e : IsLcvEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 获取索引字符串，用,分割
         * @return
         */
        public static String indexes(){
            return RuleConditionConstant.indexes(IsLcvEnum.values());
        }
    }
    /**
     * @description: 还款期限 枚举
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum LoanPeriodsEnum implements EnumValue {
        SIX(6, "6"),
        TWELVE(12, "12"),
        EIGHTEEN(18, "18"),
        TWENTY_FOUR(24, "24"),
        THIRTY(30, "30"),
        THIRTY_SIX(36, "36"),
        FORTY_TWO(42, "42"),
        FORTY_EIGHT(48, "48");
        LoanPeriodsEnum(int index, String name) {
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
            for(LoanPeriodsEnum e : LoanPeriodsEnum.values()){
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
        public static LoanPeriodsEnum getByIndex(int index){
            for(LoanPeriodsEnum e : LoanPeriodsEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 获取索引字符串，用,分割
         * @return
         */
        public static String indexes(){
            return RuleConditionConstant.indexes(LoanPeriodsEnum.values());
        }
    }
    /**
     * @description: 【平台费规则】工作流 枚举
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum WorkFlowEnum implements EnumDesc {
        NULL(1, "", "无"),
        GOOD_CUSTOMER(2, "P", "好客户"),
        GENERAL_CUSTOMER(3, "A,H,J,L", "一般客户"),;

        private Integer index;
        private String name;
        private String desc;

        WorkFlowEnum(Integer index,String name,String desc) {
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


        public static String getNameByIndex(int index){
            for(WorkFlowEnum e : WorkFlowEnum.values()){
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
        public static WorkFlowEnum getByIndex(int index){
            for(WorkFlowEnum e : WorkFlowEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据名称获取枚举对象
         * @param name 名称
         * @return
         */
        public static WorkFlowEnum getByName(String name){
            for(WorkFlowEnum e : WorkFlowEnum.values()){
                if(e.getName().equals(name)){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据描述获取枚举对象
         * @param desc 索引
         * @return
         */
        public static WorkFlowEnum getByDesc(String desc){
            for(WorkFlowEnum e : WorkFlowEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据名称获取枚举描述
         * @param name 名称
         * @return
         */
        public static String getDescByName(String name){
            for(WorkFlowEnum e : WorkFlowEnum.values()){
                if(e.getName().equals(name)){
                    return e.getDesc();
                }
            }
            return "";
        }

        /**
         * 获取索引字符串，用,分割
         * @return
         */
        public static String names(){
            return RuleConditionConstant.indexes(WorkFlowEnum.values(),e -> e.getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(WorkFlowEnum.names());
    }
}
