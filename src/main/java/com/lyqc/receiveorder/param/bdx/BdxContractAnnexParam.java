package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 合同附件
 * 合同有一部分会在贷前之前由crm团队生成
 * Created by xiaoxian on 2018/8/3.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxContractAnnexParam implements Serializable{
    @NotBlank(message = "订单号不能为空")
    private String appCode;
    @NotBlank(message = "电子合同key不能为空")
    private String contractKey;
    @NotBlank(message = "签约后地址不能为空")
    private String afterSingUrl;
    @NotBlank(message = "影像件地址不能为空")
    private String imgKey;
    @NotBlank(message = "来源不能为空")
    private String from;

    private String proppserName;

    private String idCardNo;

}
