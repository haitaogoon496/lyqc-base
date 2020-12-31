package com.lyqc.base.enums;

import java.util.Arrays;

/**
 * 订单类型
 * 辛巴使用的
 * @author yajun.fan
 * @date 2018/9/14
 */
public enum ReqSourceEnum {
    ZX("ZX", "直销", 0),
    SP("SP", "渠道", 1);
    private String key;
    private String name;
    private Integer value;

    ReqSourceEnum(String key, String name, Integer value) {
        this.key = key;
        this.name = name;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public static ReqSourceEnum getReqResource(String key) {
        return Arrays.stream(ReqSourceEnum.values()).filter(e -> e.getKey().equals(key)).findFirst()
            .orElse(null);
    }

    public static ReqSourceEnum getReqResourceByValue(Integer value) {
        return Arrays.stream(ReqSourceEnum.values()).filter(e -> e.getValue().equals(value)).findFirst()
            .orElse(null);
    }
}