package com.lyqc.receiveorder.bo;

import java.io.Serializable;

public class BankBo implements Serializable{

    //银行名称
    private String bankName;
    //银行编号
    private Integer bankCode;
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Integer getBankCode() {
        return bankCode;
    }
    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }
   
    
}
