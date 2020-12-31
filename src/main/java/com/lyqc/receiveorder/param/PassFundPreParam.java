package com.lyqc.receiveorder.param;


import java.io.Serializable;

/**
 * @program: crm-app
 * @description: 新网或浦发补充实体类
 * @author: xp
 * @create: 2018-07-10 18:30
 **/
public class PassFundPreParam implements Serializable {
    /**
     * 身份证面验证结果：0失败 1成功
     */
    private Integer identityCardOcrResult;

    /**
     * 身份证面验证描述
     */
    private String identityCardOcrResultMsg;

    /**
     * 准入结果：0 失败 1通过 2拒绝 3验证中 4.未验证
     */
    private Integer admittanceResult;

    /**
     * 准入结果描述
     */
    private String admittanceResultMsg;

    /**
     * 银行卡绑定结果：0未绑定 1已绑定 2已跳过
     */
    private Integer bindBankCardResult;

    /**
     * 银行卡绑定结果描述
     */
    private String bindBankCardResultMsg;

    /**
     * 新网和浦发的完成状态 1已完成 2被拒绝 3已跳过
     */
    private String isPassFundPre;

    /**
     * 新网和浦发的名称 新网 XHC,浦发 PF
     */
    private String isPassFundPreName;

    public Integer getIdentityCardOcrResult() {
        return identityCardOcrResult;
    }

    public void setIdentityCardOcrResult(Integer identityCardOcrResult) {
        this.identityCardOcrResult = identityCardOcrResult;
    }

    public String getIdentityCardOcrResultMsg() {
        return identityCardOcrResultMsg;
    }

    public void setIdentityCardOcrResultMsg(String identityCardOcrResultMsg) {
        this.identityCardOcrResultMsg = identityCardOcrResultMsg;
    }

    public Integer getAdmittanceResult() {
        return admittanceResult;
    }

    public void setAdmittanceResult(Integer admittanceResult) {
        this.admittanceResult = admittanceResult;
    }

    public String getAdmittanceResultMsg() {
        return admittanceResultMsg;
    }

    public void setAdmittanceResultMsg(String admittanceResultMsg) {
        this.admittanceResultMsg = admittanceResultMsg;
    }

    public Integer getBindBankCardResult() {
        return bindBankCardResult;
    }

    public void setBindBankCardResult(Integer bindBankCardResult) {
        this.bindBankCardResult = bindBankCardResult;
    }

    public String getBindBankCardResultMsg() {
        return bindBankCardResultMsg;
    }

    public void setBindBankCardResultMsg(String bindBankCardResultMsg) {
        this.bindBankCardResultMsg = bindBankCardResultMsg;
    }

    public String getIsPassFundPre() {
        return isPassFundPre;
    }

    public void setIsPassFundPre(String isPassFundPre) {
        this.isPassFundPre = isPassFundPre;
    }

    public String getIsPassFundPreName() {
        return isPassFundPreName;
    }

    public void setIsPassFundPreName(String isPassFundPreName) {
        this.isPassFundPreName = isPassFundPreName;
    }
}

