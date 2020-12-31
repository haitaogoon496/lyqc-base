package com.lyqc.transfer.re;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 门店返回结果对象
 *
 * @author lingyu.shang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DealerRe {

    @ApiModelProperty(name = "accountType", value = "账户类型")
    private String accountType;

    @ApiModelProperty(name = "address", value = "门店地址")
    private String address;

    @ApiModelProperty(name = "bankCity", value = "收款开户行所属市")
    private String bankCity;

    @ApiModelProperty(name = "bankMobile", value = "经销商银行卡手机预留号码")
    private String bankMobile;

    @ApiModelProperty(name = "bankProvince", value = "收款开户行所属省份")
    private String bankProvince;

    @ApiModelProperty(name = "dealerCode", value = "经销商门店编码")
    private Integer dealerCode;

    @ApiModelProperty(name = "dealerName", value = "经销商门店名称")
    private String dealerName;

    /**
     * {@link com.lyqc.base.enums.DealerTypeEnum}
     */
    @ApiModelProperty(name = "dealerType", value = "经销商门店类型 目前分两类：DD(1)、 SP(2,3) ")
    private String dealerType;

    @ApiModelProperty(name = "dealerTypeDesc", value = "类型描述")
    private String dealerTypeDesc;

    @ApiModelProperty(name = "province", value = "所属省份")
    private String province;

    @ApiModelProperty(name = "saleArea", value = "门店所属销售分区")
    private String saleArea;

    @ApiModelProperty(name = "city", value = "所属城市")
    private String city;

    @ApiModelProperty(name = "recAccountName", value = "收款账户名")
    private String recAccountName;

    @ApiModelProperty(name = "recAccountCard", value = "收款账户证件号码")
    private String recAccountCard;

    @ApiModelProperty(name = "recAccountBank", value = "收款开户行")
    private String recAccountBank;

    @ApiModelProperty(name = "recAccountBank2", value = "收款开户银行")
    private String recAccountBank2;

    @ApiModelProperty(name = "recAccountNo", value = "收款借记卡号")
    private String recAccountNo;

    @ApiModelProperty(name = "status", value = "状态：1-有效, 0-无效")
    private String status;

    @ApiModelProperty(name = "companyName", value = "公司名称")
    private String companyName;

}
