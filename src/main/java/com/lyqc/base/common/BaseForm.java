package com.lyqc.base.common;

import java.io.Serializable;

/**
 * @description: Form基类
 * @Date : 下午4:13 2018/2/5
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class BaseForm implements Serializable{
    private static final long serialVersionUID = -7659575678494184665L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 开始时间
     */
    private String beginTime;
    /**
     * 截止时间
     */
    private String endTime;
    /**
     * 是否分页
     */
    private boolean paging = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isPaging() {
        return paging;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }
}
