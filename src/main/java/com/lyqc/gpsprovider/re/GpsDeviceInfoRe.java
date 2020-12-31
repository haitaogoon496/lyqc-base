package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: gps 设备信息对象
 * @Date : 2018/6/15 14:05
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */

@Data
public class GpsDeviceInfoRe extends BaseRe{

    @ApiModelProperty(name="gpsId",value="gpsId",dataType="String")
    private String gpsId;
    @ApiModelProperty(name = "city", value = "城市", dataType = "String")
    private String city;
    @ApiModelProperty(name = "result", value = "当前gps是否正常（1：正常，0：不正常）", dataType = "Integer")
    private Integer result;
    @ApiModelProperty(name = "statusCode", value = "gps状态code", dataType = "String[]")
    private String[] statusCode;
    @ApiModelProperty(name = "statusDesc", value = "gps状态value", dataType = "String[]")
    private String[] statusDesc;
    @ApiModelProperty(name = "blackArea", value = "黑名单区域", dataType = "String")
    private String blackArea;
    @ApiModelProperty(name = "applyTime", value = "gps信息获取时间", dataType = "Long")
    private Long applyTime;
}
