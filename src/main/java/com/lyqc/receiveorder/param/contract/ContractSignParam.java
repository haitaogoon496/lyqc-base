package com.lyqc.receiveorder.param.contract;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.lyqc.receiveorder.dto.CaAppLoanAccountDto;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.BaseReiveorderParam;

import lombok.Data;

import java.util.List;

/**
 * Created by xiaoxian on 2018/8/28.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractSignParam extends BaseReiveorderParam{

    @NotBlank(message = "订单号不能为空")
    private String appCode;

    private Long dealerCode;

    private ContractSignProppserParam crmProppserInfo;

    @NotNull(message = "还款卡不能为空")
    @Valid
    private ContractSignRepaymentAccountParam accountParam;
}
