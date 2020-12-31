package com.lyqc.base.entity;

import com.lyqc.base.enums.AutoApprConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @description: 订单费用信息
 * @Date : 2018/12/3 下午3:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CaAutoApprRuleEntity {
    /**
     * 规则策略 B-退回、C-取消、R－拒绝
     * {@link AutoApprConstant.RuleTypeEnum#getName()}
     */
    private String type;
    /**
     * 规则策略
     * {@link AutoApprConstant.RuleTypeEnum#getDesc()}
     */
    private String typeName;
    /**
     * 分类编码
     */
    private String subType;
    /**
     * 分类名称
     */
    private String subTypeName;
    /**
     * 规则编号
     */
    private String ruleId;
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 归属名称
     * {@link AutoApprConstant.BelongNameEnum#getName()}
     */
    private String belongName;
    /**
     * 状态（1：启用 0：暂停）
     */
    private Integer status;
    /**
     * 规则优先级
     */
    private Integer ruleSeq;

    private String sysIdn;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 校验信息
     */
    private String msgTemplate;
    /**
     * 属性集合
     */
    private List<CaAutoApprRulePropEntity> props;
}