package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/6.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxAnnexParam implements Serializable{
    /**
     * 附件名称
     */
    @NotBlank(message = "附件名称不能为空")
    private String annexName;
    /**
     * 附件地址
     * 影像件则为key 办单侠有影像件
     * 和电子征信授权书是http地址
     */
    @NotBlank(message = "附件地址或key不能为空")
    private String annexAddress;
    /**
     * 用户
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 附件类型
     * APP_ANNEX("4", "申请附件"),
     BEF_ANNEX("5", "贷前附件"),
     AFT_ANNEX("6", "贷后附件"),
     APR_ANNEX("28", "审批附件"),
     GPS_ANNEX("29", "GPS资料"),
     FILE_ANNEX("30", "影像件资料"),
     ELECTRONIC_AUTHORIZATION("9","电子授权书");
     *
     */
    @NotNull(message = "附件类型不能为空")
    private Integer annexType;
    /**
     * 附件code
     * 如car_back  只有影像件有
     */
    private String fileCode;

    /**
     * 影像件在配置中的id
     * 代表配置中的唯一标识
     */
    private Long imgId;

    /**
     * 是否需要转换为本地附件
     * 比如原先生成的pdf
     */
    private boolean needDownload;
}
