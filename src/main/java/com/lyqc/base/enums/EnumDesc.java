package com.lyqc.base.enums;

/**
 * @description: 用于具备 index/name/desc特性的数据字典接口
 * @Date : 下午12:27 2018/3/8
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public interface EnumDesc extends EnumValue {
    /**
     * 获取描述
     * @return
     */
    String getDesc();
}
