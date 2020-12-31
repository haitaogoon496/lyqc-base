package com.lyqc.base.re;

import java.io.Serializable;

/**
 * @description: GPS信息状态Re对象
 * @Date : 下午1:50 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class GpsInfoStatusRe implements Serializable {
    /**
     * 【提交审核GPS】按钮状态是否可用
     */
    private boolean submitButtonEnable;
    /**
     * 【GPS安装单】是否可编辑
     */
    private boolean gpsInfoEnable;
    /**
     * 【GPS图片资料】是否可编辑
     */
    private boolean gpsAnnexEnable;

    public GpsInfoStatusRe() {
    }

    /**
     * 构造函数
     * @param submitButtonEnable
     * @param gpsInfoEnable
     * @param gpsAnnexEnable
     */
    public GpsInfoStatusRe(boolean submitButtonEnable, boolean gpsInfoEnable, boolean gpsAnnexEnable) {
        this.submitButtonEnable = submitButtonEnable;
        this.gpsInfoEnable = gpsInfoEnable;
        this.gpsAnnexEnable = gpsAnnexEnable;
    }

    public boolean isSubmitButtonEnable() {
        return submitButtonEnable;
    }

    public void setSubmitButtonEnable(boolean submitButtonEnable) {
        this.submitButtonEnable = submitButtonEnable;
    }

    public boolean isGpsInfoEnable() {
        return gpsInfoEnable;
    }

    public void setGpsInfoEnable(boolean gpsInfoEnable) {
        this.gpsInfoEnable = gpsInfoEnable;
    }

    public boolean isGpsAnnexEnable() {
        return gpsAnnexEnable;
    }

    public void setGpsAnnexEnable(boolean gpsAnnexEnable) {
        this.gpsAnnexEnable = gpsAnnexEnable;
    }
}
