package com.lyqc.base.common;

import java.io.Serializable;

/**
 * @description: 推送客户端PUSH消息DTO对象
 * @Date : 下午5:11 2018/1/24
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class AppPushDTO implements Serializable{
    private static final long serialVersionUID = 3528556079032274197L;
    /**
     * 消息标题
     */
    private String title;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 单据号
     */
    private String appCode;
    /**
     * 消息时间 yyyy-MM-dd HH:mm:ss
     */
    private String msgTime;
    /**
     * 消息系统来源
     * {@link com.lyqc.base.enums.PushConstant.PushSourceEnum}
     */
    private Integer pushSource;
    /**
     * 消息业务类型
     * {@link com.lyqc.base.enums.PushConstant.BizTypeEnum}
     */
    private Integer bizType;
    /**
     * 消息类型 1:站内信 2:push
     * {@link com.lyqc.base.enums.PushConstant.PushTypeEnum}
     */
    private Integer pushType;
    /**
     * 订单所属销售id
     */
    private Integer staffId;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getPushSource() {
        return pushSource;
    }

    public void setPushSource(Integer pushSource) {
        this.pushSource = pushSource;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}
