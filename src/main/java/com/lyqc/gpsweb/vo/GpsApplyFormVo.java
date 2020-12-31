package com.lyqc.gpsweb.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: GPS审批申请表VO对象
 * @Date : 2018/6/28 下午4:11
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@NoArgsConstructor
@Data
public class GpsApplyFormVo implements Serializable {
    @ApiModelProperty(name="dealerName",value="门店名称",dataType="String")
    private String dealerName;
    @ApiModelProperty(name="dealerContract",value="门店联系人",dataType="String")
    private String dealerContract;
    @ApiModelProperty(name="dealerTelephone",value="联系电话",dataType="String")
    private String dealerTelephone;
    @ApiModelProperty(name = "carIdentify",value = "车架号",dataType = "String")
    private String carIdentify;
    @ApiModelProperty(name = "customerName",value = "客户姓名",dataType = "String")
    private String customerName;
    @ApiModelProperty(name = "carSeries",value = "车型",dataType = "String")
    private String carSeries;
    @ApiModelProperty(name = "carColor",value = "车辆颜色",dataType = "String")
    private String carColor;
    @ApiModelProperty(name = "installAddress",value = "安装地址",dataType = "String")
    private String installAddress;
    @ApiModelProperty(name = "installer",value = "安装人员",dataType = "String")
    private String installer;
    @ApiModelProperty(name = "remark",value = "备注",dataType = "String")
    private String remark;
}
