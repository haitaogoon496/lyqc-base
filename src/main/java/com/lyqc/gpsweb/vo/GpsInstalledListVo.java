package com.lyqc.gpsweb.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: GPS查询列表VO
 * @Date : 2018/6/20 上午10:55
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsInstalledListVo implements Serializable {
    private static final long serialVersionUID = 4526356226429689474L;
    /**
     * 订单号
     */
    @ApiModelProperty(name = "appCode",value = "订单号",dataType = "String")
    private String appCode;
    /**
     * 客户姓名
     */
    @ApiModelProperty(name = "customerName",value = "客户姓名",dataType = "String")
    private String customerName;
    /**
     * 经销商code
     */
    @ApiModelProperty(name = "dealerCode",value = "经销商code",dataType = "String")
    private String dealerCode;
    /**
     * 经销商门店
     */
    @ApiModelProperty(name = "dealerName",value = "经销商门店",dataType = "String")
    private String dealerName;

    /**
     * 经销商单位名称
     */
    @ApiModelProperty(name = "companyName",value = "经销商单位名称",dataType = "String")
    private String companyName;

    /**
     * 销售姓名
     */
    @ApiModelProperty(name = "saleId",value = "销售人",dataType = "String")
    private String saleId;
    /**
     * 销售姓名
     */
    @ApiModelProperty(name = "saleName",value = "销售人",dataType = "String")
    private String saleName;
    /**
     * 所属运营
     */
    @ApiModelProperty(name = "operationId",value = "所属运营",dataType = "String")
    private String operationId;
    /**
     * 所属运营
     */
    @ApiModelProperty(name = "operationName",value = "所属运营",dataType = "String")
    private String operationName;

    /**
     * GPS数量
     */
    @ApiModelProperty(name = "gpsCount",value = "GPS数量",dataType = "String")
    private String gpsCount;

    /**
     * 人工审核结果
     */
    @ApiModelProperty(name = "manualAuditResult",value = "人工审核结果",dataType = "String")
    private String manualAuditResult;

    /**
     * 自动验证结果
     */
    @ApiModelProperty(name = "autoAuditResult",value = "自动验证结果",dataType = "String")
    private String autoAuditResult;

    /**
     * 人工审批备注
     */
    @ApiModelProperty(name = "flowRemark",value = "人工审批备注",dataType = "String")
    private String flowRemark;

    /**
     * 申请单状态
     */
    @ApiModelProperty(name = "appStatus",value = "申请单状态",dataType = "Integer")
    private Integer appStatus;
    /**
     * 申请单状态
     */
    @ApiModelProperty(name = "appStatusDesc",value = "申请单状态",dataType = "String")
    private String appStatusDesc;
    /**
     * 提交时间
     */
    @ApiModelProperty(name = "appTime",value = "提交时间",dataType = "String")
    private String appTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "updateTime",value = "更新时间",dataType = "String")
    private String updateTime;

}
