package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.lyqc.gpsweb.enums.GpsManualAuditCodeEnum;

import java.util.List;

/**
 * @description: GPS查询列表DTO
 * @author: zhaoxin
 * @date: 2018/10/26 下午2:43
 **/
@Data
@NoArgsConstructor
public class GpsQueryListDTO extends BaseDTO{
    /**
     * 申请单编号 订单编号  客户名称 经销商名称 提交时间 所属销售 所属运营 经销商门店范围
     */
    @ApiModelProperty(name = "appCode",value = "申请单编号",dataType = "String")
    private String appCode;
    /**
     * 客户姓名
     */
    @ApiModelProperty(name = "customerName",value = "客户姓名",dataType = "String")
    private String customerName;
    /**
     * 经销商范围（主要用于按权限查询，不同用户所属不同管辖门店）
     */
    @ApiModelProperty(name = "dealerCodeScope",value = "经销商范围",dataType = "List<Integer>")
    private List<Integer> dealerCodeScope;
    /**
     * 经销商单位名称
     */
    @ApiModelProperty(name = "companyName",value = "经销商单位名称",dataType = "String")
    private String companyName;
    /**
     * 提交开始时间
     */
    @ApiModelProperty(name = "beginTime",value = "提交时间",dataType = "String")
    private String beginTime;
    /**
     * 提交结束时间
     */
    @ApiModelProperty(name = "endTime",value = "提交时间",dataType = "String")
    private String endTime;
    /**
     * 人工审核结果代码
     * {@link GpsManualAuditCodeEnum#getName()}
     */
    @ApiModelProperty(name = "manualAuditCode",value = "人工审核状态",dataType = "String")
    private String manualAuditCode;
    /**
     * 所属销售
     */
    @ApiModelProperty(name = "saleName",value = "所属销售",dataType = "String")
    private String saleName;
    /**
     * 所属运营
     */
    @ApiModelProperty(name = "operationName",value = "所属运营",dataType = "String")
    private String operationName;
}
