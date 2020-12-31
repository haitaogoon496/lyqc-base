package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 办单侠贷前渠道补充资料
 * 渠道新车时，一些资料只能在贷前提交到力蕴
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBeforeLoanSpParam implements Serializable {
    //车辆颜色
    @ApiModelProperty(value = "汽车颜色")
    private String carColor;

    //发动机编号
    @ApiModelProperty(value = "发动机编号")
    private String engineNo;

    //车辆识别代号vin码
    @ApiModelProperty(value = "车辆识别代号vin码")
    private String carIdentify;

    //发票开票金额
    @ApiModelProperty(value = "发票开票金额")
    private String invoicePrice;

    //发票开票日期
    @ApiModelProperty(value = "发票开票日期")
    private String invoiceDate;

}
