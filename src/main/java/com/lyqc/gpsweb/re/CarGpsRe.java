package com.lyqc.gpsweb.re;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: GPS安装信息Re对象
 * @Date : 2018/6/19 下午4:55
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CarGpsRe extends BaseDTO {
    /**
     * 主键ID
     */
    @ApiModelProperty(name="tid",value="carGpsId",dataType="String")
    private String carGpsId;
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
    private String gpsInstallWayDesc;
    /**
     * {@link CarGpsConstant.GpsInstallPositionEnum#getName()}
     */
    @ApiModelProperty(name="gpsPosition",value="安装位置",dataType="String")
    private String gpsPosition;
    @ApiModelProperty(name="gpsNo",value="设备ID",dataType="String")
    private String gpsNo;
    @ApiModelProperty(name="autoAuditCode",value="自动审核代码",dataType="String")
    private String autoAuditCode;
    @ApiModelProperty(name="autoAuditResult",value="自动审核结果",dataType="String")
    private String autoAuditResult;
    @ApiModelProperty(name="auditSupplement",value="补充内容",dataType="String")
    private String auditSupplement;
    @ApiModelProperty(name="manualAuditCode",value="人工审核代码",dataType="String")
    private String manualAuditCode;
    @ApiModelProperty(name="manualAuditResult",value="人工审核结果",dataType="String")
    private String manualAuditResult;
    /**
     * 状态：0-可修改，1-不可修改
     */
    @ApiModelProperty(name="status",value="状态",dataType="String")
    private Integer status;
    /**
     * 历史记录id
     */
    @ApiModelProperty(name="historyId",value="历史记录id",dataType="Integer")
    private Integer historyId;
    /**
     * 是否GPS审批退回
     */
    @ApiModelProperty(name="isBack",value="是否GPS审批退回",dataType="Integer")
    private Integer isBack;
    /**
     * 是否GPS当前审批记录
     */
    @ApiModelProperty(name="isCurrent",value="是否GPS当前审批记录",dataType="Integer")
    private Integer isCurrent;
    /**
     * gpsNo排除当前appCode重复设备记录号
     */
    @ApiModelProperty(name="repeatGpsNoList",value="GPS重复设备集合",dataType="List<String>")
    private List<String> repeatGpsNoList;
}
