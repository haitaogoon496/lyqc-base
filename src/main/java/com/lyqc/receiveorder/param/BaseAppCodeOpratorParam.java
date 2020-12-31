package com.lyqc.receiveorder.param;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseAppCodeOpratorParam extends BaseReiveorderOpratorParam{
    @NotBlank(message = "订单号不能为空")
    private String appCode;
}
