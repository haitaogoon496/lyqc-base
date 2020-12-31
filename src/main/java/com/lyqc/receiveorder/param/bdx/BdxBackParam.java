package com.lyqc.receiveorder.param.bdx;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.BaseReiveorderParam;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/21.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBackParam extends BaseReiveorderParam {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String appCode;

    /**
     * 退回目标状态
     */
    private String backStatus;

    /**
     *
     */
    private BdxOperatorParam operatorParam;

    /**
     *备注
     */
    private String remarks;

    /**
     * 取消类型
     */
    private String cancelType;

    /**
     * 取消码
     */
    private String cancelReason;

    /**
     * 操作人id
     */
    private Integer userId;

    /**
     * 操作人姓名
     */
    private String userName;
}
