package com.lyqc.base.common;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @description: Re 基类
 * @Date : 下午6:55 2018/3/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class BaseRe implements Serializable {
    private static final long serialVersionUID = -4889329811517097432L;
    /**
     * 主键id
     */
    @ApiModelProperty(name="id",value="主键id",dataType="Integer")
    private Integer id;

    public BaseRe() {
    }

    public BaseRe(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
