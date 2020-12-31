package com.lyqc.gpsprovider.enums;

import com.lyqc.base.enums.EnumValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: GPS影像件code 枚举
 * @Date : 2018/8/13 上午11:37
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsImgCodeEnum implements EnumValue {
    wired_gps_num(1, "有线GPS编号"),
    wired_gps_far(2, "有线安装远景"),
    wired_gps_clo(3, "有线安装近景1"),

    wireless_gps_num(4, "无线GPS编号"),
    wireless_gps_far(5, "无线安装远景"),
    wireless_gps_clo(6, "无线GPS近景"),

    gps_installation(7, "GPS安装单"),
    gps_car_nameplate(8, "车辆铭牌"),
    p_car(9, "整车照片"),
    gps_other(10, "补充材料"),

    ;

    GpsImgCodeEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 根据索引获取名称
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index){
        for(GpsImgCodeEnum e : GpsImgCodeEnum.values()){
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
    public static GpsImgCodeEnum getByIndex(int index){
        for(GpsImgCodeEnum e : GpsImgCodeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举名称集合
     * @return
     */
    public static List<String> codeList(){
        return Arrays.asList(GpsImgCodeEnum.values()).stream().map(each -> each.name()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(codeList());
    }
}