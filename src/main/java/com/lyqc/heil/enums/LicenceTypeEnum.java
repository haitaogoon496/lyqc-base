package com.lyqc.heil.enums;

import com.lyqc.base.enums.EnumValue;
/**
 * @description: 车牌类型 枚举
 * @Date : 2018/6/25 下午12:03
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum LicenceTypeEnum implements EnumValue{
    PRIVATE_LICENCE(0,"私牌"),
    PUBLIC_LICENCE(1,"公牌"),
    SUBORDINATE_PUBLIC_LICENSE(2,"挂靠公牌"),
    INSTEAD_OF_BUY_WITH_LEASE(3,"以租代购");
    private int index;
    private String name;

    LicenceTypeEnum(int index, String name){
        this.name = name;
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    public static String getNameByIndex(int index){
        for(LicenceTypeEnum e : LicenceTypeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static LicenceTypeEnum getByIndex(int index){
        for(LicenceTypeEnum e : LicenceTypeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
