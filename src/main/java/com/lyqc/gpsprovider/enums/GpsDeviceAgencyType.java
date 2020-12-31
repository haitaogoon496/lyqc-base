package com.lyqc.gpsprovider.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: GPS设备商类型
 * 用于与 上海大数据部门接口协议交互使用
 * @Date : 2018/9/25 下午6:55
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsDeviceAgencyType implements EnumValue {
    unknown(0, "未知"),
    /**
     * 赛格
     */
    segGPS(1, "segGPS"),
    /**
     * 久劲
     */
    jjGPS(2, "jjGPS"),
    /**
     * 谷米
     */
    gumiGPS(3, "gumiGPS")
    ;
    private int index;
    private String name;

    GpsDeviceAgencyType(int index, String name) {
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

    /**
     * 根据索引获取名称
     * @param index
     * @return
     */
    public static String getNameByIndex(int index){
        for(GpsDeviceAgencyType e : GpsDeviceAgencyType.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param index
     * @return
     */
    public static GpsDeviceAgencyType getByIndex(int index){
        for(GpsDeviceAgencyType e : GpsDeviceAgencyType.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
    /**
     * 根据名称获取枚举对象
     * @param name
     * @return
     */
    public static GpsDeviceAgencyType getByName(String name){
        for(GpsDeviceAgencyType e : GpsDeviceAgencyType.values()){
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }

    /**
     * 提供静态方法，根据GPS设备商编号获取设备商类型
     * @param gpsDealer
     * @return
     */
    public static GpsDeviceAgencyType getByGpsDealer(String gpsDealer){
        if(gpsDealer.startsWith(CarGpsConstant.SG_PREFIX)){
            return GpsDeviceAgencyType.segGPS;
        }else if(gpsDealer.startsWith(CarGpsConstant.JJ_PREFIX)){
            return GpsDeviceAgencyType.jjGPS;
        }else if(gpsDealer.startsWith(CarGpsConstant.GM_PREFIX)){
            return GpsDeviceAgencyType.gumiGPS;
        }else{
            return null;
        }
    }
}
