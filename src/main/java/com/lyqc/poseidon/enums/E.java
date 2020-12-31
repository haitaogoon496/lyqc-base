package com.lyqc.poseidon.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: 枚举示例
 * @Date : 下午3:23 2018/5/22
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public enum  E implements EnumValue {
    ;

    private int index;
    private String name;

    E(int index, String name) {
        this.index = index;
        this.name = name;
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
        for(E e : E.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static E getByIndex(int index){
        for(E e : E.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}