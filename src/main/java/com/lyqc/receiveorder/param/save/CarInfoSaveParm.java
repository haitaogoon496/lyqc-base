package com.lyqc.receiveorder.param.save;

import com.lyqc.receiveorder.param.BaseReiveorderParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author huyue
 * @date 2018/11/12 21:12
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarInfoSaveParm extends BaseReiveorderParam {

    @NotBlank(message = "订单号不能为空")
    private String appCode;

    @ApiModelProperty("汽车颜色")
    private String carColor;
    @ApiModelProperty("发动机编号")
    private String engineNo;
    @ApiModelProperty("车辆识别代号vin码")
    private String carIdentify;
}
