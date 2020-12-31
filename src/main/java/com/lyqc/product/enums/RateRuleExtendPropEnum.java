package com.lyqc.product.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: 利率规则扩展属性枚举
 * @Date : 2018/11/26 下午4:16
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum RateRuleExtendPropEnum implements EnumValue{
    costRate(1, "资金成本利率"),
    ;

    RateRuleExtendPropEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 根据索引获取名称
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index){
        for(RateRuleExtendPropEnum e : RateRuleExtendPropEnum.values()){
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
    public static RateRuleExtendPropEnum getByIndex(int index){
        for(RateRuleExtendPropEnum e : RateRuleExtendPropEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
