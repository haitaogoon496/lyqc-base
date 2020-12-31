package com.lyqc.base.enums;

/**
 * @description:门店类型枚举
 * @Date : 2018/5/29$ 17:57$
 * @Author : liht
 */
public enum DealerTypeEnum implements EnumValue {
    DD(1,"DD"),
    SP(2,"SP"),
    SP_01(3,"SP-01"),
    EWDS(4,"二网DS"),
    EWSP(5,"二网SP");

    DealerTypeEnum (int index,String name) {
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
    // 直营或者渠道环境下  获取不同类型enum


    /**
     * 通过判断 直营|渠道返回不同类型
     * @return
     */
    public static DealerTypeEnum[] valuesBySystem(boolean isZy){

        if(isZy){
            return new DealerTypeEnum[]{DealerTypeEnum.DD,DealerTypeEnum.SP,DealerTypeEnum.SP_01};
        }
        return DealerTypeEnum.values();
    }
    // 根据索引获取enum类型
    public static DealerTypeEnum getIndex (int index) {
        for (DealerTypeEnum dealerEnum:DealerTypeEnum.values()) {
            if (index == dealerEnum.getIndex()) {
                return dealerEnum;
            }
        }
        return null;
    }

    public static DealerTypeEnum getName (String name) {
        for (DealerTypeEnum dealerEnum : DealerTypeEnum.values()) {
            if (name.equalsIgnoreCase(dealerEnum.getName())) {
                return dealerEnum;
            }
        }
        return null;
    }
}
