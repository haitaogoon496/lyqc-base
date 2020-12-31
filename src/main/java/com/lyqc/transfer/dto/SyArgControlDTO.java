package com.lyqc.transfer.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * 数据字典 DTO
 * @author lingyu.shang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SyArgControlDTO implements Serializable {

    private static final long serialVersionUID = 5712562973876418082L;

    @ApiModelProperty(name = "rId", value = "参数id")
    private Integer rId;

    @NotNull(message = "参数名称不能为空")
    @ApiModelProperty(name = "conArgName", value = "参数名称")
    private String conArgName;

    @NotNull(message = "参数编码不能为空")
    @ApiModelProperty(name = "conArgCode", value = "参数编码")
    private String conArgCode;

    @NotNull(message = "参数类型不能为空")
    @ApiModelProperty(name = "conArgType", value = "业务类型")
    private Integer conArgType;

    @NotNull(message = "参数值不能为空")
    @ApiModelProperty(name = "conArgValue", value = "参数值")
    private String conArgValue;

    @NotNull(message = "参数状态不能为空")
    @ApiModelProperty(name = "conArgStatus", value = "状态")
    private Integer conArgStatus;

    @ApiModelProperty(name = "conArgTypeList", value = "业务类型列表")
    private List<Integer> conArgTypeList;

}
