package com.lyqc.transfer.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @Date : 2018/5/28$ 14:56$
 * @Author : liht
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DictionaryRegDTO implements Serializable {

    @ApiModelProperty(name = "regLevel",value = "地区登记")
    private String regLevel;
    @ApiModelProperty(name = "regName",value = "名称")
    private String regName;
    @ApiModelProperty(name = "status",value = "状态")
    private Integer status;

}
