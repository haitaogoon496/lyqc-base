package com.lyqc.base.enums.dbenum;

public class CaAppRiskResultEnum {

    /**
     * 优质客户枚举
     */
    public enum CarloanAmountAdjEnum{
        NOT_HIGH_QUALITY("0","非优质客户"),
        HIGH_QUALITY("1","优质客户");

        private String index;
        private String name;

        public String getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        CarloanAmountAdjEnum(String index, String name) {
            this.index = index;
            this.name = name;
        }
    }
}
