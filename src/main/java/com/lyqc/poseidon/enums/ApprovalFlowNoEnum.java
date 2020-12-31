package com.lyqc.poseidon.enums;

import com.lyqc.base.enums.EnumValue;

public enum ApprovalFlowNoEnum implements EnumValue {

    VALID(0, "资方验证"),
    GETORDER(1, "领单"),
    APPROVAL(2, "审批");

    ApprovalFlowNoEnum(int index, String name) {
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
        for(ApprovalFlowNoEnum e : ApprovalFlowNoEnum.values()){
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
    public static ApprovalFlowNoEnum getByIndex(int index){
        for(ApprovalFlowNoEnum e : ApprovalFlowNoEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
