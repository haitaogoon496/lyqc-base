package com.lyqc.receiveorder.bo;

import com.alibaba.fastjson.annotation.JSONField;

public class JdRiskBo {
    @JSONField(name = "org_code")
    private String orgCode;
    @JSONField(name = "cust_id")
    private String custId;
    private String name;
    private String mobile;
    @JSONField(name = "seri_num")
    private String seriNum;
    // 机构代码、身份证号、姓名，手机号 加密串
    private String ciphertext;

    public JdRiskBo() {
        // TODO Auto-generated constructor stub
    }

    public JdRiskBo(String custId, String name, String mobile) {
        this.custId = custId;
        this.name = name;
        this.mobile = mobile;
    }

    public JdRiskBo(String orgCode, String custId, String name, String mobile) {
        this.orgCode = orgCode;
        this.custId = custId;
        this.name = name;
        this.mobile = mobile;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSeriNum() {
        return seriNum;
    }

    public void setSeriNum(String seriNum) {
        this.seriNum = seriNum;
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }
}
