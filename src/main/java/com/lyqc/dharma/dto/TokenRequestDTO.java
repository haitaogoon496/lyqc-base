package com.lyqc.dharma.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

/**
 * @description:
 * @Date : 2018/12/29$ 13:15$
 * @Author : liht
 */
@Data
public class TokenRequestDTO extends BaseDTO {

    @NotNull(message = "订单号不能为空")
    @ApiModelProperty(value = "订单号")
    private String appCode;
    @ApiModelProperty(value = "是否直营")
    private Boolean isZy;
    @ApiModelProperty(value = "业务方")
    private String businessType;

}
