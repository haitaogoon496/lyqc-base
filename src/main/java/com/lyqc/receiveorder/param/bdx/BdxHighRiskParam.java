package com.lyqc.receiveorder.param.bdx;

import com.lyqc.receiveorder.param.BaseEnterInParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * User: HY
 * Date: 2019/1/7
 * Time: 10:49
 * Description:
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxHighRiskParam extends BaseEnterInParam {

    @ApiModelProperty(name = "是否同意",notes = "1同意，2拒绝")
    @NotNull(message = "请选择是否同意")
    @Max(value = 2,message = "该值不允许")
    @Min(value = 1,message = "该值不允许")
    private Integer isHighRiskProduct;
}
