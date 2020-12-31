package com.lyqc.receiveorder.vo;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaCarInfoVo {
    @ApiModelProperty(name = "排量吨位")
    private String carDiston;

    @ApiModelProperty(name = "车系")
    private String carStyles;

    @ApiModelProperty(name = "车款年代")
    private String carYear;

    @ApiModelProperty(name = "车辆颜色")
    private String carColor;

    @ApiModelProperty(name = "车辆变速箱")
    private String carGearbox;

    @ApiModelProperty(name = "二手车调整价")
    private BigDecimal applyCarPriceChange;

    @ApiModelProperty(name = "新车指导价")//来自cacarinfo
    private BigDecimal carNewPrice;

    @ApiModelProperty(name = "实际销售价")//来自caappinfo
    private BigDecimal salePrice;

    @ApiModelProperty(name = "外网指导价")//来自cacarinfo.ext
    private BigDecimal outsideDealerGuidePrice;

    @ApiModelProperty(name = "二手车卖方姓名")
    private String carSaleName;

    @ApiModelProperty(name = "二手车卖方身份证号码")
    private String carSaleIdno;

    @ApiModelProperty(name = "交易城市")
    private String transCity;

    @ApiModelProperty(name = "交易城市code")
    private Integer transCityId;
}
