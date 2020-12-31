package com.lyqc.product.enums;

import java.util.ArrayList;
import java.util.List;

import com.lyqc.base.enums.EnumDesc;

/**
 * @description:  产品中心定义的新的资金方code
 * @Date : 2018/7/31 19:17
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
public enum FundNoEnum implements EnumDesc {
    NORMAL(0, "普通资金方", ""),
    SPDB(1, "浦发", "PF"),
    NYBANK(2, "南粤", "NY"),
    HC(3, "华昌", "HC"),
    XHC(4, "新华昌", "XHC"),
    ICBC(5, "工行", "GH"),
    WZR(6, "微众融", "WZR"),
    WZ(7, "微众", "WZ"),
    ZBYH(8, "众邦", "ZBYH"),
    CM(9, "挖财", "CM"),
    BH(10, "渤海", "BH"),
    PFLS(11, "浦发零售", "PFLS"),
    SCGH(12,"四川工行","SCGH"),
    HBGH(13,"湖北工行","HBGH")
    ;

    FundNoEnum(Integer index, String name, String desc) {
        this.index = index;
        this.name = name;
        this.desc = desc;
    }

    private int index;
    private String name;
    private String desc;

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDesc() {
        return desc;
    }

    /**
     * 根据索引获取名称
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index){
        for(FundNoEnum e : FundNoEnum.values()){
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
    public static FundNoEnum getByIndex(int index){
        for(FundNoEnum e : FundNoEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param desc 索引
     * @return
     */
    public static FundNoEnum getByDesc(String desc){
        for(FundNoEnum e : FundNoEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
    
    /**
     * 获取所有不为空的desc
     * @param desc 索引
     * @return
     */
    public static List<String> getALLDesc(){
        List<String> descs = new ArrayList<String>();
        for(FundNoEnum e : FundNoEnum.values()){
            if(!e.desc.isEmpty()) {
                descs.add(e.desc);
            }
        }
        return descs;
    }
}
