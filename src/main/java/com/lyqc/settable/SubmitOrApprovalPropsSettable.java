package com.lyqc.settable;

/**
 * @description: 适用于设置提交人 或者 审批人相关信息接口
 * @Date : 上午11:15 2018/1/14
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public interface SubmitOrApprovalPropsSettable {
    /**
     * 设置提交人相关字段
     * @param submitUserId
     * @param submitUserName
     * @param submitTime
     */
    default void setSubmitProps(Integer submitUserId, String submitUserName, String submitTime){}
    /**
     * 设置审批人相关字段
     * @param approvalUserId
     * @param approvalUserName
     * @param approvalTime
     */
    default void setApprovalProps(Integer approvalUserId, String approvalUserName, String approvalTime){}
}
