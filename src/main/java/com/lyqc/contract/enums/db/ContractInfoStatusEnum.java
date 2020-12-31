package com.lyqc.contract.enums.db;

/**
 * Created by xiaoxian on 2018/8/28.
 */
public enum ContractInfoStatusEnum {

    NO_SIGN(0,"未签约"),
    SIGN_SUCCESS(1, "签约完成"),
    SIGNING(2, "签约中"),
    ANEW_SIGN(3, "重签"),
    SIGN_FAIL(9, "签署失败"),
    NO_DATA(10, "无数据");


    ContractInfoStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }


    public static ContractInfoStatusEnum parse(int status) {
        ContractInfoStatusEnum[] values = ContractInfoStatusEnum.values();
        for(ContractInfoStatusEnum contractStatusEnum : values){
            if(contractStatusEnum.getCode() == status){
                return contractStatusEnum;
            }
        }
        return null;
    }

    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
