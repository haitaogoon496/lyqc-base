package com.lyqc.receiveorder.param.bdx;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxFundContractParam implements Serializable {
    @NotBlank(message = "订单号不能为空")
    private String appCode;
    @NotBlank(message = "电子合同key不能为空")
    private String contractKey;
    @NotBlank(message = "来源不能为空")
    private String from;

    private String imgKey;

    private String singUrl;

    private String proppserName;

    private String idCardNo;

    private String mobile;
    /**
     * 0是不需要，1是需要
     */
    @NotBlank(message = "签约是否完成")
    private Integer isNeedSign;

}
