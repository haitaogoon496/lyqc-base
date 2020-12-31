package com.lyqc.base.enums;

public enum VinApiEnum {
    TRANSIENT_VINCODE(1,"/model/parent/query/by/vin","根据vin码获取车型");

    private Integer index;
    private String name;
    private String value;

    VinApiEnum(Integer index, String name, String value) {
        this.index = index;
        this.name = name;
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
