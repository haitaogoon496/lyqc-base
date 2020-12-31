package com.lyqc.athena;

import com.lyqc.base.enums.EnumValue;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 11:36 AM 2019/3/25
 */
public class OrderFeeReplyEnum {

    /**
     * 打印配偶
     */
    public enum PrintSpouseEnum implements EnumValue {

        NOT_PRINT(0,"打印"),
        PRINT(1,"不打印");

        private int index;
        private String name;

        PrintSpouseEnum(int index,String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public static OrderFeeReplyEnum.PrintSpouseEnum getEnum(int index){
            for(OrderFeeReplyEnum.PrintSpouseEnum e : OrderFeeReplyEnum.PrintSpouseEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

}
