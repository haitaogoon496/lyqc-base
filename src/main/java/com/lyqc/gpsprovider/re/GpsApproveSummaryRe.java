package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @description: 查询GPS认证汇总结果Re对象（包括系统验证和人工审核结果）
 * @Date : 2018/8/23 上午10:27
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"id"})
public class GpsApproveSummaryRe extends BaseRe {
    private static final long serialVersionUID = -4308225227700000563L;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="autoApprove",value="系统验证结果",dataType="GpsApproveResultRe")
    private GpsApproveResultRe autoApprove;
    @ApiModelProperty(name="manualApprove",value="人工审核结果",dataType="GpsApproveResultRe")
    private GpsApproveResultRe manualApprove;
}
