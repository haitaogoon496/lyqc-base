package com.lyqc.receiveorder.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * Created by xiaoxian on 2018/8/28.
 */
public enum ReceiveOrderStepEnum implements EnumValue {
    SECOND(1,"秒拒通过提交"),
    AGREE(2,"准入提交"),
    CREDIT(3,"信审提交"),
    BEFORE_LOAN(4,"贷前提交"),
    AFTER_LOAN(5,"贷后提交"),
    LTV_ADJUST_SUBMIT(11, "ltv 同意/提交调整"),
    HIGH_RISK_AGREE(12, "高风险拒绝或同意"),
    BEFORE_LOAN_CHANGE_FUND(20,"贷前更换资方"),
    BEFORE_LOAN_CHANGE_PRODUCT(21,"贷前更换产品");

    private int index;
    private String name;

    ReceiveOrderStepEnum(int index,String name){
        this.name = name;
        this.index = index;
    }

    public static String getName(Integer index) {
        for (ReceiveOrderStepEnum item : ReceiveOrderStepEnum.values()) {
            if (index != null && item.index == index) {
                return item.name;
            }
        }
        return "未知类型-" + index;
    }

    public static ReceiveOrderStepEnum getByIndex(int index){
        for(ReceiveOrderStepEnum e : ReceiveOrderStepEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
