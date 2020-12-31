package com.lyqc.base.enums;

/**
 * @description: 推送客户端PUSH消息常量类
 * @Date : 下午5:13 2018/1/24
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public final class PushConstant {
    /**
     * @description: PUSH来源系统枚举
     * @Date : 下午5:13 2018/1/24
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum PushSourceEnum implements EnumValue {

        LYQC_CAS(1, "力蕴系统");

        PushSourceEnum(int index, String name) {
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
            for(PushSourceEnum e : PushSourceEnum.values()){
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
        public static PushSourceEnum getByIndex(int index){
            for(PushSourceEnum e : PushSourceEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: PUSH业务类型枚举
     * @Date : 下午5:13 2018/1/24
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum BizTypeEnum implements EnumValue {

        GPS_APPROVAL(1, "GPS审批管理");

        BizTypeEnum(int index, String name) {
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
            for(BizTypeEnum e : BizTypeEnum.values()){
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
        public static BizTypeEnum getByIndex(int index){
            for(BizTypeEnum e : BizTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: PUSH类型枚举
     * @Date : 下午5:13 2018/1/24
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum PushTypeEnum implements EnumValue {

        MESSAGE(1, "站内信"),
        PUSH(2, "PUSH");

        PushTypeEnum(int index, String name) {
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
            for(PushTypeEnum e : PushTypeEnum.values()){
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
        public static PushTypeEnum getByIndex(int index){
            for(PushTypeEnum e : PushTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
