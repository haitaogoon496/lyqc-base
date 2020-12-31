package com.lyqc.poseidon.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ReturnTypeEnum {

    PRELOAN_AFTER_CALLBACK("1","贷前及贷前之后退回类型"),
    PRELOAN_BEFORE_CALLBACKNO("0","贷前之前退回类型");


    private String name;
    private String value;

    private ReturnTypeEnum(String value, String name){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getIndex() {
        return this.value;
    }

    public static ReturnTypeEnum[] valuesNotNull(){
        return new ReturnTypeEnum[]{PRELOAN_AFTER_CALLBACK,PRELOAN_BEFORE_CALLBACKNO};
    }
}
