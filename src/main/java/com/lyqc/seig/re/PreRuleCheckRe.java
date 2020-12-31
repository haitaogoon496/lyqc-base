package com.lyqc.seig.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:  前置规则校验结果
 * @Date : 2018/9/13 16:44
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class PreRuleCheckRe extends BaseRe{
    @ApiModelProperty(name="isPass",value="前置规则是否通过",dataType="boolean")
    private boolean access;
    @ApiModelProperty(name="unPassType",value="前置规则未通过类型",dataType="Boolean")
    private String unAccessType;
    @ApiModelProperty(name="autoAppr",value="自动审批结果",dataType="String")
    private String autoAppr;
    @ApiModelProperty(name="autoApperTime",value="自动审批时间",dataType="String")
    private String autoApperTime;
    @ApiModelProperty(name="cancelReason",value="取消/拒绝/PBOC退回原因",dataType="String")
    private String cancelReason;
}
