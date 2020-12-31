package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: GPS相关信息Re
 * @Date : 2018/8/23 下午6:43
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GpsRelatedInfoRe extends BaseRe {
    private static final long serialVersionUID = -8879647405170138747L;
    /**
     * {@link CarGpsConstant.AppInfoIsGpsEnum#getIndex()}
     */
    @ApiModelProperty(name = "isGps", value = "GPS安装状态", dataType = "String")
    private String isGps;
    /**
     * {@link CarGpsConstant.AppInfoIsGpsEnum#getName()}
     */
    @ApiModelProperty(name = "isGpsDesc", value = "GPS安装状态描述", dataType = "String")
    private String isGpsDesc;
    @ApiModelProperty(name = "gpsCount", value = "GPS安装数量", dataType = "Integer")
    private Integer gpsCount;
    /**
     * {@link CarGpsConstant.GpsProEnum#getIndex()}
     */
    @ApiModelProperty(name = "gpsPro", value = "GPS安装属性", dataType = "Integer")
    private Integer gpsPro;
    /**
     * {@link CarGpsConstant.GpsProEnum#getName()}
     */
    @ApiModelProperty(name = "gpsProDesc", value = "GPS安装属性描述", dataType = "String")
    private String gpsProDesc;
    /**
     * 设备商code，多个以；分割
     */
    @ApiModelProperty(name = "gpsDealerCode", value = "GPS供应商代码", dataType = "String")
    private String gpsDealerCode;
    /**
     * 设备商名称，多个以；分割
     */
    @ApiModelProperty(name = "gpsDealerName", value = "GPS供应商名称", dataType = "String")
    private String gpsDealerName;
    @ApiModelProperty(name = "gpsNo", value = "GPS设备号", dataType = "String")
    private String gpsNo;
    @ApiModelProperty(name = "isGpsLoan", value = "GPS费用是否贷款", dataType = "String")
    private String isGpsLoan;
}