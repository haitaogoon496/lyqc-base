package com.lyqc.receiveorder.vo;

import java.io.Serializable;
import java.util.List;

import com.lyqc.receiveorder.dto.LoanAccountDto;
import com.lyqc.receiveorder.dto.LoanAccountRebeatDto;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/6/25.
 */
@Data
public class LoanAccountListVo implements Serializable{
    private String appCode;

    private Integer rebeatType;//返点方案 1 全额

    private Integer distributeType;//1 单账户全额，2双账户定比，3双账户定额

    private LoanAccountDto loanAccount;

    private List<LoanAccountRebeatDto> rebeatAccount;
}
