package com.lyqc.base.enums;

/**
 * @description:  车贷产品 - 平台费规则相关枚举
 * @Date : 2018/3/6 下午2:52
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class SerFinConstant {
    /**
     * @description: 收取方式（1，线上收取；2，线下收取）
     * @Date : 2018/3/6 下午2:52
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum TakenModeEnum implements EnumValue {
        ONLINE(1, "线上收取"),
        OFFLINE(2, "线下收取");
        TakenModeEnum(int index, String name) {
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
        public static String getNameByIndex(Integer index){
            if(index == null){
                return ONLINE.getName();
            }
            for(TakenModeEnum e : TakenModeEnum.values()){
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
        public static TakenModeEnum getByIndex(Integer index){
            if(index == null){
                return ONLINE;
            }
            for(TakenModeEnum e : TakenModeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
