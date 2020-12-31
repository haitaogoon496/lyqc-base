package com.lyqc.athena;

import com.lyqc.base.enums.EnumValue;

public class OrderApprovalEnum  {

    /**
     * 是否贷前退回
     */
    public enum IsBackEnum implements EnumValue{

        NO(0,"贷前未退回"),
        YES(1,"贷前退回");

        private int index;
        private String name;

        IsBackEnum(int index,String name) {
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

        public static OrderApprovalEnum.IsBackEnum getEnum(int index){
            for(OrderApprovalEnum.IsBackEnum e : OrderApprovalEnum.IsBackEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 单子是否是指派
     */
    public enum IsAssignEnum implements EnumValue{

        NO(0,"未指派"),
        YES(1,"指派");

        private int index;
        private String name;

        IsAssignEnum(int index,String name) {
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

        public static OrderApprovalEnum.IsAssignEnum getEnum(int index){
            for(OrderApprovalEnum.IsAssignEnum e : OrderApprovalEnum.IsAssignEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * app显示高风险按钮
     */
    public enum ShowHighRateEnum implements EnumValue{

        INIT(-1,"未指派"),
        SHOW(0,"显示"),
        NOT_SHOW(1,"不显示");

        private int index;
        private String name;

        ShowHighRateEnum(int index,String name) {
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

        public static OrderApprovalEnum.ShowHighRateEnum getEnum(int index){
            for(OrderApprovalEnum.ShowHighRateEnum e : OrderApprovalEnum.ShowHighRateEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 高风险类型
     */
    public enum HighTypeEnum implements EnumValue{

        INIT(0,"默认"),
        NOT_CONFIG_HIGH_PRODUCT(1,"没有配置高风险"),
        ORIGIN_PRODUCT(1,"原产品"),
        HIGH_PRODUCT(1,"高风险产品"),
        REFUSE_PRODUCT(1,"高风险拒绝");

        private int index;
        private String name;

        HighTypeEnum(int index,String name) {
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

        public static OrderApprovalEnum.HighTypeEnum getEnum(int index){
            for(OrderApprovalEnum.HighTypeEnum e : OrderApprovalEnum.HighTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 是否同意高风险
     */
    public enum IsAgreeHighRiskProductEnum implements EnumValue{

        AGREE(1,"默认"),
        DISAGREE(2,"没有配置高风险");

        private int index;
        private String name;

        IsAgreeHighRiskProductEnum(int index,String name) {
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

        public static OrderApprovalEnum.IsAgreeHighRiskProductEnum getEnum(int index){
            for(OrderApprovalEnum.IsAgreeHighRiskProductEnum e : OrderApprovalEnum.IsAgreeHighRiskProductEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
