package com.lyqc.contract.enums.db;

import com.lyqc.base.enums.EnumValue;

/**
 * Created by xiaoxian on 2018/5/23.
 */
public enum  CaProductContractCompanyLicenceEnum implements EnumValue{
    PRIVATE_LICENCE(0,"私牌"),
    PUBLIC_LICENCE(1,"公牌"),
    GUAKAOGONGPAI(2,"挂靠公牌"),
    YIZUDAISHOU(3,"以租代购");


    private int index;
    private String name;

    CaProductContractCompanyLicenceEnum(int index,String name){
        this.name = name;
        this.index = index;
    }

    public static String getName(Integer index) {
        for (CaProductContractCompanyLicenceEnum item : CaProductContractCompanyLicenceEnum.values()) {
            if (index != null && item.index == index) {
                return item.name;
            }
        }
        return "未知类型-" + index;
    }

    public static CaProductContractCompanyLicenceEnum getByIndex(int index){
        for(CaProductContractCompanyLicenceEnum e : CaProductContractCompanyLicenceEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
