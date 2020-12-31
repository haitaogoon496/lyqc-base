package com.lyqc.athena;

import com.lyqc.base.enums.EnumValue;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 11:35 AM 2019/3/25
 */
public class OrderApplyEnum {

    /**
     * 渠道来源
     */
    public enum Channel {

        ZY("ZY","直营"),
        QD("QD","渠道");

        private String value;
        private String name;

        Channel(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static OrderApplyEnum.Channel getEnum(String value){
            for(OrderApplyEnum.Channel e : OrderApplyEnum.Channel.values()){
                if(e.getValue().equals(value)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 初审订单小状态
     * 订单小状态(1=APP提单，2=初审通过，3=初审退回)
     */
    public enum FlowStatusEnum implements EnumValue {

        FIRST_SUBMIT(1,"提单"),
        FIRST_PASS(2,"初审通过"),
        FIRST_BACK(3,"初审退回");


        private int index;
        private String name;

        FlowStatusEnum(int index,String name) {
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

        public static OrderApplyEnum.FlowStatusEnum getEnum(int index){
            for(OrderApplyEnum.FlowStatusEnum e : OrderApplyEnum.FlowStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }


    /**
     * 终审资方校验
     * 注：终审领单子状态
     */
    public enum FinalWaitEnum implements EnumValue{

        WAIT_ACCEPT(0,"验证通过，等待终审领单"),
        VALIDATING(1,"资方验证中");

        private int index;
        private String name;

        FinalWaitEnum(int index,String name) {
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

        public static OrderApplyEnum.FinalWaitEnum getEnum(int index){
            for(OrderApplyEnum.FinalWaitEnum e : OrderApplyEnum.FinalWaitEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 终审领单
     */
    public enum SubStatusEnum implements EnumValue{

        WAIT_ACCEPT(0,"等待终审领单"),
        ACCEPT(1,"已领单");

        private int index;
        private String name;

        SubStatusEnum(int index,String name) {
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

        public static OrderApplyEnum.SubStatusEnum getEnum(int index){
            for(OrderApplyEnum.SubStatusEnum e : OrderApplyEnum.SubStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 系统审批状态
     */
    public enum RefuseStatusEnum implements EnumValue{

        NOT_REFUSE(0,"未拒绝"),
        REFUSE_NOT_PASS(1,"拒绝复核不通过"),
        FINAL_REFUSE(2,"终审拒绝"),
        SECOND_REFUSE(3,"复审拒绝");

        private int index;
        private String name;

        RefuseStatusEnum(int index,String name) {
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

        public static OrderApplyEnum.RefuseStatusEnum getEnum(int index){
            for(OrderApplyEnum.RefuseStatusEnum e : OrderApplyEnum.RefuseStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }


}
