package com.lyqc.receiveorder.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractInfoVo implements Serializable{
    private static final long serialVersionUID = 8580823976384652713L;
    /**
     * 电子合同地址
     */
    private String afterSignUrl;
    /**
     *合同的种类
     */
    private Integer contractType;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 是否有效
     */
    private int isDelete;
    /**
     * 是否预签约
     */
    private int isPreSign;
    /**
     * 电子合同状态
     */
    private int status;
    /**
     * 合同bigsCode
     */
    private String contractKey;

    /**
     * 合同创建时间
     */
    private Date createTime;
}
