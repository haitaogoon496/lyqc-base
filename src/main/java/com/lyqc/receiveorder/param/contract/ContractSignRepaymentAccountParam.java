package com.lyqc.receiveorder.param.contract;

import java.io.Serializable;


import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xiaoxian on 2018/8/30.
 */
@Data
@EqualsAndHashCode(of = {"accountName","accountNo","accountSubBank"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractSignRepaymentAccountParam implements Serializable{
    /**
     * 账户名
     */
    @NotBlank
    private String accountName;
    /**
     * 账户号
     */
    @NotBlank
    private String accountNo;
    /**
     * 开户行
     */
    @NotBlank
    private String accountBank;
    /**
     * 开户行 支行名称
     */
    private String accountSubBank;
    /**
     * 账户类型 AccountTypeEnum
     * 1收款账户  2还款账户  3代扣账户
     */
    private Integer accountType;
}
