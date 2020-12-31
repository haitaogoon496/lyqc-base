package com.lyqc.receiveorder.vo;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.dto.LoanAccountDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单全量详情
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDetailVo extends CaAppInfoBaseVo{

    @ApiModelProperty(value = "订单基本信息")
    private CaAppInfoDetailVo appInfo;

    @ApiModelProperty(value = "主贷人信息")
    private CaProppserInfoVo proppserInfoVo;

    @ApiModelProperty(value = "配偶信息")
    private CaRelativesInfoVo relativesInfoVo;

    @ApiModelProperty(value = "金融产品和申请批复金额信息")
    private CaProductAndLoanInfoVo productAndLoanInfoVo;

    @ApiModelProperty(value = "金融产品和申请批复金额信息")
    private CaProductReplyInfoVo productReplyInfoVo;

    @ApiModelProperty(value = "车辆信息")
    private CaCarInfoVo carInfoVo;

    @ApiModelProperty(value = "是否需要弹窗同意操作")
    private NeedAgreeInfoVo needAgreeInfoVo;

    @ApiModelProperty(value = "贷后是否可编辑")
    private boolean couldEditAfterLoan;

    @ApiModelProperty(value = "放款账户信息")
    private LoanAccountListVo loanAccountVo;

    @ApiModelProperty(value = "扩展信息")
    private Map<String, Map<String,Object>> extendMap;

}
