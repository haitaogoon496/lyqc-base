package com.lyqc.base.enums;

/**
 * @description: Car-Heil金融产品接口服务提供的restful API地址，用于第三方接入
 */
public enum CarHeilProviderApiEnum implements EnumDesc{

    getConfigParamVal(1, "/configParams/getConfigParamValByKey", "car-heil获取配置参数的值");

    private Integer index;
    private String name;
    private String value;

    CarHeilProviderApiEnum(Integer index, String name, String desc) {
        this.index = index;
        this.name = name;
        this.value = desc;
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
        return this.value;
    }


    public static String getNameByIndex(int index){
        for(CarHeilProviderApiEnum e : CarHeilProviderApiEnum.values()){
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
    public static CarHeilProviderApiEnum getByIndex(int index){
        for(CarHeilProviderApiEnum e : CarHeilProviderApiEnum.values()){
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
    public static CarHeilProviderApiEnum getByDesc(String desc){
        for(CarHeilProviderApiEnum e : CarHeilProviderApiEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
}
