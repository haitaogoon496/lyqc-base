package com.lyqc.receiveorder.param;

import java.io.Serializable;

import com.lyqc.base.entity.BaseEntity;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/6/21.
 */
@Data
public class BaseReiveorderParam implements Serializable{
    private String lyqckey;

    private String api;

    /**
     * 来源那个系统 参考base包中的SystemCodeEnum枚举
     */
    private Integer comeFrom;
}
