package com.lyqc.yy.enums;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午5:26 2018/5/18
 */
public enum AuthorizeTypeEnum {
    DZ("DZ","电子授权"),
    ZZ("ZZ","纸质授权");

    private String name;
    private String value;

    AuthorizeTypeEnum(String value, String name){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public static AuthorizeTypeEnum[] valuesNotNull(){
        return new AuthorizeTypeEnum[]{DZ,ZZ};
    }


}
