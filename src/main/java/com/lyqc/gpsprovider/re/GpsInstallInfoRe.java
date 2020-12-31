package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * @description: GPS安装信息Re对象
 * @Date : 2018/6/13 下午7:38
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsInstallInfoRe extends BaseRe {
    private static final long serialVersionUID = -8523764455995128703L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    private String appCode;
    @ApiModelProperty(name="wireDeviceCount",value="有线必填数量",dataType="Integer")
    private Integer wireDeviceCount;
    @ApiModelProperty(name="wirelessDeviceCount",value="无线必填数量",dataType="Integer")
    private Integer wirelessDeviceCount;
    @ApiModelProperty(name="carGpsList",value="carGpsList",dataType="List<CarGpsDTO>")
    private List<CarGpsRe> carGpsList = Collections.emptyList();
    @ApiModelProperty(name="gpsContract",value="GPS联系人",dataType="GpsContractRe")
    private GpsContractRe gpsContract;

    public GpsInstallInfoRe() {
    }
}
