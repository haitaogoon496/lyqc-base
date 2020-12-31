package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @description: 规则 Re
 * @author: zhaoxin
 * @date: 2019/2/28 2:44 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoApprRuleRe extends BaseRe {

    /**
     * 规则策略 B-退回、C-取消、R－拒绝
     */
    private String type;
    /**
     * 规则策略
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
     */
    private String belongName;
    /**
     * 状态（1：启用 0：暂停）
     */
    private String status;
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
     * 业务类型
     */
    private Integer classify;
    /**
     * 属性集合
     */
    private List<AutoApprRulePropRe> props;
}
