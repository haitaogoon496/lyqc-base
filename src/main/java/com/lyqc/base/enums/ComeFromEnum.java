package com.lyqc.base.enums;

/**
 * @description: 标示CA_APP_INFO (come_from)订单来源 0:PC  1:APP 2:WEIXIN  3: 4:办单侠
 * @Date : 2018/7/5 下午5:04
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum ComeFromEnum implements EnumValue {
    UNKNOWN(-1,""),
    PC(0,"PC"),
    APP(1,"APP"),
    WEIXIN(2,"WEIXIN"),
    EWDS(3,""),//数据库里有3，也是未知类型
    BANDANXIA(4,"办单侠");

    ComeFromEnum(int index, String name) {
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

    public ComeFromEnum getByIndex(int index) {
        for (ComeFromEnum e : ComeFromEnum.values()) {
            if (index == e.getIndex()) {
                return e;
            }
        }
        return null;
    }
}
