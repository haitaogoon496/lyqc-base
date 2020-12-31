package com.lyqc.receiveorder.param;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgreeHighRiskParam extends BaseAppCodeOpratorParam {
    @ApiModelProperty(name = "是否同意",notes = "1同意，2拒绝")
    @NotNull(message = "请选择是否同意")
    @Max(value = 2,message = "该值不允许")
    @Min(value = 1,message = "该值不允许")
    private Integer isHighRiskProduct;
}
