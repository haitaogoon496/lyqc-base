package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: GPS安装信息DTO对象
 * @Date : 2018/6/19 下午4:55
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class CarGpsDTO extends BaseDTO {
    /**
     * 主键ID
     */
    @ApiModelProperty(name="tid",value="主键ID",dataType="String")
    private String tid;
    @ApiModelProperty(name="dealerCode",value="GPS经销商代码",dataType="String")
    private String dealerCode;
    @ApiModelProperty(name="dealerName",value="GPS经销商名称",dataType="String")
    private String dealerName;
    /**
     * {@link CarGpsConstant.GpsInstallTypeEnum#getIndex()}
     */
    @ApiModelProperty(name="gpsInstallWay",value="安装方式",dataType="Integer")
    private Integer gpsInstallWay;
    /**
     * {@link CarGpsConstant.GpsInstallPositionEnum#getName()}
     */
    @ApiModelProperty(name="gpsPosition",value="安装位置",dataType="String")
    private String gpsPosition;
    @ApiModelProperty(name="gpsNo",value="设备ID",dataType="String")
    private String gpsNo;
    @ApiModelProperty(name="auditSupplement",value="补充内容",dataType="String")
    private String auditSupplement;
    @ApiModelProperty(name="manualAuditCode",value="人工审核代码",dataType="String")
    private String manualAuditCode;
    @ApiModelProperty(name="manualAuditResult",value="人工审核结果",dataType="String")
    private String manualAuditResult;
}
