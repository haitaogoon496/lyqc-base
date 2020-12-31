package com.lyqc.dharma.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @author lingyu.shang
 */
public enum SystemSourceEnum implements EnumValue {

    ZY(1, "zy"),
    QD(2, "qd");

    SystemSourceEnum(int index, String name) {
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
        for(SystemSourceEnum e : SystemSourceEnum.values()){
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
    public static SystemSourceEnum getByIndex(int index){
        for(SystemSourceEnum e : SystemSourceEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

}
