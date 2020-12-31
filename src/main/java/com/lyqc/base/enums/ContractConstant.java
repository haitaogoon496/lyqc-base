package com.lyqc.base.enums;

/**
 * @description: 电子合同相关枚举
 * @Date : 下午1:52 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public final class ContractConstant {
    /**
     * @description: 门店管理 秒据接口 枚举
     * @Date : 2017/9/27 下午2:55
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ContractStepEnum implements EnumValue {

        ALL(1,"全部"),
        NEW_APPLY(10,"提交阶段"),
        BEFORE_LOAN(20,"贷前阶段");

        ContractStepEnum(int index, String name) {
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
            for(ContractStepEnum e : ContractStepEnum.values()){
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
        public static ContractStepEnum getByIndex(int index){
            for(ContractStepEnum e : ContractStepEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
