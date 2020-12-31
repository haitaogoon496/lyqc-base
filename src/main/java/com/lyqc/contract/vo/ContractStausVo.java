package com.lyqc.contract.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * 电子合同总状态
 * Created by xiaoxian on 2018/7/27.
 */
@Data
public class ContractStausVo implements Serializable{
    /**
     * 订单号
     */
    private String appCode;
    /**
     * 总签约状态
     */
    private Integer status;
    /**
     * 总签约状态描述
     */
    private String statusStr;
    /**
     * 总上传状态
     */
    private boolean uplaoded;
    /**
     * 总上传状态描述
     */
    private String uplaodedStr;
    /**
     * 是否已经完结
     */
    private Boolean complete;
}
