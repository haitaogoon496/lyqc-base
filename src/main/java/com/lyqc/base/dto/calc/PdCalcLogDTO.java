package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @description: 产品计算日DTO对象
 * @Date : 2018/5/9 下午5:47
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class PdCalcLogDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="requestParam",value="请求参数",dataType="String")
    private String requestParam;
    @ApiModelProperty(name="responseResult",value="返回结果",dataType="String")
    private String responseResult;
    @ApiModelProperty(name="source",value="调用方",dataType="String")
    private String source;
    /**
     * 业务类型（1：计算引擎调用；2：Loanapply业务追踪）
     * {@link com.lyqc.base.enums.ProductEngineConstant.CalcLogBuzType}
     */
    @ApiModelProperty(name="buzType",value="业务类型",dataType="String")
    private Integer buzType;
    /**
     * 是否提交（1：提交；0：保存）
     */
    @ApiModelProperty(name="isSubmit",value="是否提交",dataType="String")
    private Integer isSubmit;
}