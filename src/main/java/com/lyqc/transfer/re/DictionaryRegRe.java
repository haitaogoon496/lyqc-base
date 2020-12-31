package com.lyqc.transfer.re;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地区返回结果对象
 * @author lingyu.shang
 */
@Data
@NoArgsConstructor
public class DictionaryRegRe {

    @ApiModelProperty(name = "regCode",value = "编码")
    private String regCode;

    @ApiModelProperty(name = "regName",value = "名称")
    private String regName;

    @ApiModelProperty(name = "regCodePar",value = "父级Id")
    private String regCodePar;

    @ApiModelProperty(name = "regLevel",value = "级别")
    private String regLevel;

    @ApiModelProperty(name = "memo",value = "说明")
    private String memo;

    @ApiModelProperty(name = "gbCode",value = "国标码")
    private String gbCode;

    @ApiModelProperty(name = "aliasName",value = "曾用名字")
    private String aliasName;

    @ApiModelProperty(name = "status",value = "状态")
    private Integer status;

}
