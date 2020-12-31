package com.lyqc.product.enums;

import com.lyqc.base.enums.EnumDesc;

/**
 * @description: 车贷产品-组件类型枚举
 * @Date : 2018/5/22 下午3:43
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum ComponentClassifyEnum implements EnumDesc {
    NULL(0, "", "--请选择--"),
    C_COM_FEE(1, "C_COMFEE", "平台费规则类组件"),
    C_RATE(2, "C_RATE", "利率规则类组件"),
    C_GPS(3, "C_GPS", "GPS规则类组件");

    private Integer index;
    private String name;
    private String desc;

    ComponentClassifyEnum(Integer index,String name,String desc) {
        this.index = index;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public static String getNameByIndex(int index){
        for(ComponentClassifyEnum e : ComponentClassifyEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static ComponentClassifyEnum getByIndex(int index){
        for(ComponentClassifyEnum e : ComponentClassifyEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param desc 索引
     * @return
     */
    public static ComponentClassifyEnum getByDesc(String desc){
        for(ComponentClassifyEnum e : ComponentClassifyEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
}