package com.lyqc.base.enums;

/**
 * @description: 产品引擎相关枚举
 * @Date : 2018/5/9 下午5:29
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class ProductEngineConstant {
    /**
     * @description: 产品计算日志-业务类型
     * @Date : 2018/5/9 下午5:30
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum CalcLogBuzType implements EnumValue {

        PRODUCT_ENGINE_CALL(1, "计算引擎调用"),
        LOANAPPLY_BUZ_TRACE(2, "Loanapply业务追踪"),
        SEIG_PRERULE_CHECK(3,"前置规则校验"),
        LOAN_BEFORE_CHANGE_PRODUCT(4,"贷前更换产品获取产品列表"),
        DHARMA_DATA_CHECK(5, "达摩数据一致性校验");

        private int index;
        private String name;

        CalcLogBuzType(int index, String name) {
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
         *
         * @param index 索引
         * @return
         */
        public static String getNameByIndex(int index) {
            for (CalcLogBuzType e : CalcLogBuzType.values()) {
                if (e.getIndex() == index) {
                    return e.getName();
                }
            }
            return null;
        }

        /**
         * 根据索引获取枚举对象
         *
         * @param index 索引
         * @return CalcLogBuzType
         */
        public static CalcLogBuzType getByIndex(int index) {
            for (CalcLogBuzType e : CalcLogBuzType.values()) {
                if (e.getIndex() == index) {
                    return e;
                }
            }
            return null;
        }
    }
}
