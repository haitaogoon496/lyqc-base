package com.lyqc.receiveorder.param;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.dto.LoanAccountDto;
import com.lyqc.receiveorder.dto.LoanAccountRebeatDto;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/6/21.
 */
@Data
public class LoanAccountSaveContentParam implements Serializable{
    @NotBlank(message = "订单号不能为空")
    private String appCode;

    private Integer rebeatType;//返点方案 1 全额

    private Integer distributeType;//1 单账户全额，2双账户定比，3双账户定额

    @Valid
    @NotNull(message = "放款账户必须填写")
    private LoanAccountDto loanAccount;

    private List<LoanAccountRebeatDto> rebeatAccount;
}
