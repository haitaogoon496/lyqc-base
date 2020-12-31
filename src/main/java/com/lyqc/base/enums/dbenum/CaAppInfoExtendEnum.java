package com.lyqc.base.enums.dbenum;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午7:25 2018/6/6
 */
public class CaAppInfoExtendEnum {

    /**
     * 等待池状态
     */
    public enum FinalWaitType {

        PASS(0,"通过"),
        WAIT(1,"等待");

        private Integer value;
        private String name;

        FinalWaitType(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(Integer value){
            for(CaAppInfoExtendEnum.FinalWaitType e : CaAppInfoExtendEnum.FinalWaitType.values()){
                if(e.getValue().intValue() ==  value.intValue() ){
                    return e.getName();
                }
            }
            return null;
        }

        public static CaAppInfoExtendEnum.FinalWaitType getByValue(Integer value){
            for(CaAppInfoExtendEnum.FinalWaitType e : CaAppInfoExtendEnum.FinalWaitType.values()){
                if(e.getValue().intValue() == value.intValue()){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 等待池状态
     */
    public enum IsHighProductTypeEnum {

        PASS(1,"高风险产品"),
        REFUSE(2,"普通产品（用户未同意）");

        private Integer value;
        private String name;

        IsHighProductTypeEnum(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(Integer value){
            for(CaAppInfoExtendEnum.IsHighProductTypeEnum e : CaAppInfoExtendEnum.IsHighProductTypeEnum.values()){
                if(e.getValue().intValue() ==  value.intValue() ){
                    return e.getName();
                }
            }
            return null;
        }

        public static CaAppInfoExtendEnum.IsHighProductTypeEnum getByValue(Integer value){
            for(CaAppInfoExtendEnum.IsHighProductTypeEnum e : CaAppInfoExtendEnum.IsHighProductTypeEnum.values()){
                if(e.getValue().intValue() == value.intValue()){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 订单小状态
     */
    public enum FlowStatusEnum {
        APP_COMMIT_FAIL(-1,"提交失败"),
        DEFAULT(0,"默认值"),
        APP_COMMIT(1,"app提交"),
        FIRST_EXAMINE(2,"初审审核"),
        FIRST_EXAMINE_PASS(3,"初审通过"),
        FIRST_EXAMINE_BACK(4,"初审退回");

        private int index;
        private String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        FlowStatusEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }
    }

    /**
     * 订单小状态
     */
    public enum AcceptStatusEnum {
        INIT(0,"初始"),
        TS_ACCEPT(1,"天枢领单"),
        LY_ACCEPT(2,"力蕴领单");


        private int index;
        private String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        AcceptStatusEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }
    }

    /**
     * loanToValue 规则枚举
     */
    public enum LTVStatusEnum {
        NOT_USE(0,"未采用LTV调整"),
        SECOND_CONFIRMATION(1,"LTV复审已确认"),
        FINAL_CONFIRMATION(2,"终审已确认"),
        USER_SAVE(3,"用户保存"),
        USER_CONFIRMATION(4,"用户已确认"),
        REDUCTION_CONFIRMATION(5,"降额批复复审已确认");//单纯的降额批复，与LTV无关，这个值目前被LTVType代替

        private int index;
        private String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        LTVStatusEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }
    }

    public enum LTVTypeEnum{
        ORDINARY(0,"未调整"),
        LTV(1,"LTV调整"),
        REDUCTION(2,"降额批复"),
        REDUCTION_LTV(3,"降额且为LTV");//目前微众、渤海产品通过复审后禁止修改批复值

        private int index;
        private String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        LTVTypeEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }
    }


}
