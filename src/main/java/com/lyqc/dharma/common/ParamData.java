package com.lyqc.dharma.common;

import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.dharma.enums.SystemSourceEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

/**
 * @author lingyu.shang
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamData {

    @ApiModelProperty(name = "appCode",value = "申请单编码")
    @NotNull
    private String appCode;

    @ApiModelProperty(name = "systemSource",value = "系统来源")
    @NotNull
    @EnumValidation(enums = SystemSourceEnum.class, method = EnumValidation.InvokeMethod.getName, message = "systemSource不合法,请核实！正确值：{0}")
    private String systemSource;

}
