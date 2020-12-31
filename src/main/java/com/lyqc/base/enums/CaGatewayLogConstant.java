package com.lyqc.base.enums;

public final class CaGatewayLogConstant {

    public enum TypeEnum implements EnumValue {
        RETURN_NOTIFY_APP(7, "退回通知APP"),
        BH_BIGS_CALL_BACK(6, "渤海授信回调接口（复审）"),
        BH_SECOND_IMAGE(5, "渤海影像件接口（复审）"),
        BH_SECOND_INFO(4, "渤海信息接口（复审）"),
        HIGH_PRODUCT_YY(3, "发送风控高风险数据"),
        CAR_PRODUCT_YY(2, "金融产品接口(高风险)"),
        BIGS_WC_AUDIT(1, "资负机审前置接口");

        TypeEnum(int index, String name) {
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
            for(TypeEnum e : TypeEnum.values()){
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
        public static TypeEnum getByIndex(int index){
            for(TypeEnum e : TypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
