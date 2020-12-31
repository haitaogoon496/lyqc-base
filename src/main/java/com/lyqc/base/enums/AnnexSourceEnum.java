package com.lyqc.base.enums;


public enum AnnexSourceEnum implements  EnumValue{

    CRM(1, "APP"),
    PC(2, "力蕴系统"),
    CA(3, "合同中心"),
    OTHER(4,"其他");

    AnnexSourceEnum(int index,String name){
        this.index=index;
        this.name=name;
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
        for(AnnexSourceEnum e : AnnexSourceEnum.values()){
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
    public static AnnexSourceEnum getByIndex(int index){
        for(AnnexSourceEnum e : AnnexSourceEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
