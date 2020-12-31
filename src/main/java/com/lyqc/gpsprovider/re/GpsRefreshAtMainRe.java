package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @description: 办单侠主页面重新刷新，当APP客户端触发下拉刷新事件时返回对象
 * 对象包括：GPS汇总结果（系统验证和人工验证），以及GPS是否可用，GPS是否编辑相关业务字段
 * @Date : 2018/9/6 下午2:39
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"id"})
public class GpsRefreshAtMainRe extends BaseRe{
    private static final long serialVersionUID = 4537162875100459008L;
    @ApiModelProperty(name="gpsBuzStatusRe",value="GPS业务初始化状态对象",dataType="GpsBuzStatusRe")
    private GpsBuzStatusRe gpsBuzStatusRe;
    @ApiModelProperty(name="gpsApproveSummaryRe",value="GPS认证汇总结果Re对象（包括系统验证和人工审核结果）",dataType="GpsApproveSummaryRe")
    private GpsApproveSummaryRe gpsApproveSummaryRe;
}
