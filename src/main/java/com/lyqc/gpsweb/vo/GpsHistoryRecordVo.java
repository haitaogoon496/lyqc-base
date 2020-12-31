package com.lyqc.gpsweb.vo;

import com.lyqc.base.enums.GpsFlowConstant;
import com.lyqc.base.enums.GpsHistoryConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: GPS历史记录
 * @Date : 2018/7/27 下午3:05
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@NoArgsConstructor
@Data
public class GpsHistoryRecordVo implements Serializable {
    private static final long serialVersionUID = 4526356226429689474L;
    @ApiModelProperty(name="id",value="ID",dataType="Integer")
    private Integer id;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="submitTime",value="提交时间",dataType="Date")
    private Date submitTime;
    @ApiModelProperty(value = "提交时间字符串格式")
    private String submitTimeStr;
    @ApiModelProperty(name="submitUserId",value="提交人ID",dataType="Integer")
    private Integer submitUserId;
    @ApiModelProperty(name="submitUserName",value="提交人姓名",dataType="String")
    private String submitUserName;
    @ApiModelProperty(name="approvalTime",value="审批时间",dataType="Date")
    private Date approvalTime;
    @ApiModelProperty(value = "审批时间字符串格式")
    private String approvalTimeStr;
    @ApiModelProperty(name="approvalUserId",value="审批人ID",dataType="Integer")
    private Integer approvalUserId;
    @ApiModelProperty(name="approvalUserName",value="审批人姓名",dataType="String")
    private String approvalUserName;
    @ApiModelProperty(name="approvalIdea",value="审批意见",dataType="String")
    private String approvalIdea;
    /**
     * {@link GpsHistoryConstant.GpsInstallStatusEnum#getIndex()}
     */
    @ApiModelProperty(name="installStatus",value="GPS安装状态",dataType="Integer")
    private Integer installStatus;
    /**
     * {@link GpsHistoryConstant.GpsInstallStatusEnum#getName()}
     */
    @ApiModelProperty(name="installStatusDesc",value="GPS安装状态描述",dataType="String")
    private String installStatusDesc;
    /**
     * {@link GpsFlowConstant.GpsFlowStatusEnum#getIndex()}
     */
    @ApiModelProperty(name="approvalStatus",value="GPS审批状态",dataType="Integer")
    private Integer approvalStatus;
    /**
     * {@link GpsFlowConstant.GpsFlowStatusEnum#getName()}
     */
    @ApiModelProperty(name="approvalStatusDesc",value="GPS审批状态描述",dataType="String")
    private String approvalStatusDesc;
}
