package com.lyqc.base.enums;

/**
 * CA风控取消拒绝码表中RISK_TYPE字段对应的风险类型枚举
 * @author huyue
 * @date 2018/8/29 17:09
 */
public enum  RiskTypeEnum implements EnumDesc {

    A(0,"A","通过类型"),
    C(1,"C","取消类型"),
    D(2,"D","风控退回"),
    N(3,"N","请款审批退回"),
    R(4,"R","拒绝类型");


    private int index;
    private String name;
    private String desc;

    RiskTypeEnum(int index, String name, String desc) {
        this.index = index;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
