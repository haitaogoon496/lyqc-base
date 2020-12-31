package com.lyqc.yy.enums;

import java.util.Arrays;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午5:26 2018/5/18
 */
public enum ChannelEnum {
    ZY("ZY","直营"),
    QD("QD","渠道");

    private String name;
    private String value;

    ChannelEnum(String value, String name){
        this.name = name;
        this.value = value;
    }

    /**
     * 根据key获取枚举
     *
     * @param key
     * @return 默认返回直销
     */
    public static ChannelEnum getByKey(String key) {
        return Arrays.stream(values()).filter((e) -> e.getValue().equals(key))
                .findFirst().orElse(null);
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public static ChannelEnum[] valuesNotNull(){
        return new ChannelEnum[]{ZY,QD};
    }


}
