package com.lyqc.receiveorder.param.bdx;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 办单侠贷前提交接口
 * Created by xiaoxian on 2018/8/14.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBeforeLoanParam extends BaseEnterInParam{

    /**
     * 放款卡信息(车商的卡)
     */
    @Valid
//    @NotNull(message = "放款账户必须填写")
    private BdxLoanAccountParam loanAccountParam;

    /**
     * 还款卡信息(做过四要素的卡)
     */
    @Valid
    @NotNull(message = "还款卡信息必须填写")
    private BdxRepmentCardParam repmentCardParam;

    /**
     * 资金方预审结果
     * 辛巴系统认为提交的都是通过的。不给传，收单暂时给默认值
     */
    @Valid
    private BdxPreFundParam preFundParam;

    /**
     * 补充资料
     */
    @Valid
    private BdxBefoerLoanOtherParam otherParam;

    /**
     * 贷前渠道额外资料
     * 进入ca_car_info
     */
    private BdxBeforeLoanSpParam spParam;

    //贷前可能会变更流程
    @ApiModelProperty(value = "贷款流程")
    private Integer flowSeq;
}
