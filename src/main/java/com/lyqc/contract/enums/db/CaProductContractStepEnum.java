package com.lyqc.contract.enums.db;

import com.lyqc.base.enums.EnumValue;

/**
 * author: wk
 * time: 2017/8/28 9:42
 *
 * 合同调用阶段
 *
 */
public enum CaProductContractStepEnum implements EnumValue{
    ALL(1,"全部"),
    NEW_APPLY(10,"提交阶段"),
    BEFORE_LOAN(20,"贷前阶段");


    private int index;
    private String name;

    CaProductContractStepEnum(int index,String name){
        this.name = name;
        this.index = index;
    }

    public static String getName(Integer index) {
        for (CaProductContractStepEnum item : CaProductContractStepEnum.values()) {
            if (index != null && item.index == index) {
                return item.name;
            }
        }
        return "未知类型-" + index;
    }

    public static CaProductContractStepEnum getByIndex(int index){
        for(CaProductContractStepEnum e : CaProductContractStepEnum.values()){
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
