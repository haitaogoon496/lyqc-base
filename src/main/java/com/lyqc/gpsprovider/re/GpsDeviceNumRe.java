package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: GPS设备数量Re对象
 * @Date : 2018/6/15 下午1:19
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsDeviceNumRe extends BaseRe {
    @ApiModelProperty(name="wireDeviceCount",value="有线数量",dataType="Integer")
    private Integer wireDeviceCount;
    @ApiModelProperty(name="wirelessDeviceCount",value="无线数量",dataType="Integer")
    private Integer wirelessDeviceCount;

    public GpsDeviceNumRe() {
    }

    public GpsDeviceNumRe(Integer wireDeviceCount, Integer wirelessDeviceCount) {
        this.wireDeviceCount = wireDeviceCount;
        this.wirelessDeviceCount = wirelessDeviceCount;
    }
}
