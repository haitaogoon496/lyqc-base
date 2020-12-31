package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/15.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxPreFundParam implements Serializable{
    /**
     * 身份证ocr结果 0失败 1成功
     */
    private Integer identitycardOcrResult;

    /**
     * OCR 结果描述
     */
    private String identitycardOcrResultMsg;

    /**
     *准入结果 0 失败 1通过 2拒绝 3验证中 4.未验证
     */
    private Integer admittanceResult;

    /**
     * 准入结果描述
     */
    private String admittanceResultMsg;

    /**
     * 银行卡绑定结果  0未绑定 1已绑定 2已跳过
     */
    private Integer bindBankcardResult;

    /**
     * 银行卡绑定结果描述
     */
    private String bindBankcardResultMsg;

    /**
     * 资方预审1已完成 2被拒绝 3已跳过
     */
    private Integer isPassFundPre;

    /**
     * 资方名称
     */
    private String isPassFundPreName;

    /**
     * 开户授权状态：1.未开户 2开户中 3已开户 4开户失败
     */
    private Integer openAccountAuthStatus;

    /**
     * 开户验证描述
     */
    private String openAccountAuthResultMsg;

    /**
     * 授信结果，0成功，1失败
     */
    private Integer creditInfoStatus;

    /**
     * 授信认证信息
     */
    private String creditInfoResultMsg;
}
