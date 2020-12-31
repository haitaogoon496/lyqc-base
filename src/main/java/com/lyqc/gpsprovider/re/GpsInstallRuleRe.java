package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: GPS安装规则Re对象
 * @Date : 2018/6/13 下午7:38
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsInstallRuleRe extends BaseRe {
    private static final long serialVersionUID = -8523764455995128703L;
    @ApiModelProperty(name="wireDeviceCount",value="有线必填数量",dataType="Integer")
    private Integer wireDeviceCount;
    @ApiModelProperty(name="wirelessDeviceCount",value="无线必填数量",dataType="Integer")
    private Integer wirelessDeviceCount;

    public GpsInstallRuleRe() {
    }
}
