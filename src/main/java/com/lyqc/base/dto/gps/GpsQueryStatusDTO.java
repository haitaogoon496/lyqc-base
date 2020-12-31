package com.lyqc.base.dto.gps;

import com.lyqc.base.common.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * @description: GPS查询状态DTO对象
 * @Date : 下午2:00 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class GpsQueryStatusDTO extends BaseDTO {
    private static final long serialVersionUID = 6022782855543882789L;
    /**
     * 单据号
     */
    @NotNull
    private String appCode;

    public GpsQueryStatusDTO() {
    }

    /**
     * 构造函数
     * @param appCode 单据号
     */
    public GpsQueryStatusDTO(@NotNull String appCode) {
        this.appCode = appCode;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
