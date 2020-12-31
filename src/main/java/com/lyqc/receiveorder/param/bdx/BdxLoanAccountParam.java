package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.dto.LoanAccountDto;
import com.lyqc.receiveorder.dto.LoanAccountRebeatDto;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/14.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxLoanAccountParam implements Serializable{
    private Integer rebeatType;//返点方案 1 全额

    private Integer distributeType;//1 单账户全额，2双账户定比，3双账户定额

    @NotNull(message = "放款账户必须填写")
    @Valid
    private LoanAccountDto loanAccount;

    /**
     * 返点账户
     */
    private List<LoanAccountRebeatDto> rebeatAccount;
}
