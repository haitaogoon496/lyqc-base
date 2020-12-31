package com.lyqc.receiveorder.param.query;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询单条订单详入参
 * 钩子 --  调用者决定查询哪些不查询哪些
 * 默认只有订单基本信息
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryDetailWithHookParam extends AppCodeParam{

    @ApiModelProperty(value = "订单基本信息")
    private boolean appInfoHook = true;

    @ApiModelProperty(value = "主贷人信息")
    private boolean proppserInfoVoHook;

    @ApiModelProperty(value = "配偶信息")
    private boolean relativesInfoVoHook;

    @ApiModelProperty(value = "金融产品和申请批复金额信息")
    private boolean productAndLoanInfoVoHook;

    @ApiModelProperty(value = "最后一次信审批复信息")
    private boolean productReplyInfoHook;

    @ApiModelProperty(value = "车辆信息")
    private boolean carInfoVoHook;

    @ApiModelProperty(value = "放款账户信息")
    private boolean loanAccountVoHook;

    @ApiModelProperty(value = "是否需要弹窗同意操作")
    private boolean needAgreeInfoVoHook;

    @ApiModelProperty(value = "订单可编辑情况")
    private boolean couldEditTabHook;

    public void setAllTrue(){
        this.appInfoHook = true;
        this.proppserInfoVoHook = true;
        this.relativesInfoVoHook = true;
        this.productAndLoanInfoVoHook = true;
        this.carInfoVoHook = true;
        this.loanAccountVoHook = true;
        this.needAgreeInfoVoHook = true;
        this.couldEditTabHook = true;
    }
}
