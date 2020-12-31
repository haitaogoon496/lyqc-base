package com.lyqc.gpsprovider.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: GPS设备商类型编码前缀
 * 用于与 上海大数据部门接口协议交互使用
 * @Date : 2018/9/25 下午6:55
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsDeviceAgencyPrefix implements EnumValue {
    /**
     * 赛格
     */
    SG(1, "SG"),
    /**
     * 久劲
     */
    JJ(2, "JJ"),
    /**
     * 谷米
     */
    GM(3, "GM")
    ;
    private int index;
    private String name;

    GpsDeviceAgencyPrefix(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    public static String getNameByIndex(int index){
        for(GpsDeviceAgencyPrefix e : GpsDeviceAgencyPrefix.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static GpsDeviceAgencyPrefix getByIndex(int index){
        for(GpsDeviceAgencyPrefix e : GpsDeviceAgencyPrefix.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
