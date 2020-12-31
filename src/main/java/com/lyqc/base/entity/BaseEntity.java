package com.lyqc.base.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @description: Entity基类
 * @Date : 下午8:33 2018/1/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class BaseEntity implements Serializable {
    public BaseEntity() {
    }

    public String toString() {
        try {
            return this.getClass().getSimpleName() + " = " + JSON.toJSONString(this, new SerializerFeature[]{SerializerFeature.WriteMapNullValue});
        } catch (Exception var2) {
            return super.toString();
        }
    }
}
