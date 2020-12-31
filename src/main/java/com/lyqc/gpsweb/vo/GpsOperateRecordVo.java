package com.lyqc.gpsweb.vo;

import com.lyqc.base.enums.GpsFlowConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: GPS操作记录
 * @Date : 2018/7/27 下午3:05
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@NoArgsConstructor
@Data
public class GpsOperateRecordVo implements Serializable {
    private static final long serialVersionUID = 4526356226429689474L;
    @ApiModelProperty(name="id",value="ID",dataType="Integer")
    private Integer id;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    /**
     * {@link GpsFlowConstant.GpsFlowStepEnum#getIndex()}
     */
    @ApiModelProperty(name="flowStep",value="流程步骤",dataType="Integer")
    private Integer flowStep;
    /**
     * {@link GpsFlowConstant.GpsFlowStatusEnum#getIndex()}
     */
    @ApiModelProperty(name="flowStatus",value="流程状态",dataType="Integer")
    private Integer flowStatus;
    @ApiModelProperty(name="createTime",value="创建时间",dataType="Date")
    private Date createTime;
    @ApiModelProperty(value = "创建时间字符格式")
    private String createTimeStr;
    @ApiModelProperty(name="createUserId",value="创建人",dataType="Integer")
    private Integer createUserId;
    @ApiModelProperty(name="createUserName",value="创建人姓名",dataType="String")
    private String createUserName;
    @ApiModelProperty(name="remark",value="备注",dataType="String")
    private String remark;
    /**
     * {@link GpsFlowConstant.GpsFlowStepEnum#getName()}
     */
    @ApiModelProperty(name="flowStepDesc",value="流程步骤描述",dataType="String")
    private String flowStepDesc;
    /**
     * {@link GpsFlowConstant.GpsFlowStatusEnum#getName()}
     */
    @ApiModelProperty(name="flowStatusDesc",value="流程状态描述",dataType="String")
    private String flowStatusDesc;
}
