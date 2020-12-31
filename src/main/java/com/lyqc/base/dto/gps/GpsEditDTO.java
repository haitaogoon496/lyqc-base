package com.lyqc.base.dto.gps;

import com.lyqc.base.common.BaseDTO;

/**
 * @description: 控制APP客户端是否可编辑DTO对象
 * @Date : 下午4:13 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class GpsEditDTO extends BaseDTO {
    private static final long serialVersionUID = 4260200775321682772L;
    /**
     * 申请单号
     */
    private String appCode;
    /**
     * 申请单号状态
     */
    private String status;
    /**
     * 申请单号isGps状态
     */
    private String isGps;
    /**
     * GPS费用
     */
    private Double gpsFee;

    public GpsEditDTO() {
    }

    public GpsEditDTO(String appCode, String status, String isGps, Double gpsFee) {
        this.appCode = appCode;
        this.status = status;
        this.isGps = isGps;
        this.gpsFee = gpsFee;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsGps() {
        return isGps;
    }

    public void setIsGps(String isGps) {
        this.isGps = isGps;
    }

    public Double getGpsFee() {
        return gpsFee;
    }

    public void setGpsFee(Double gpsFee) {
        this.gpsFee = gpsFee;
    }
}
