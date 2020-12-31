package com.lyqc.base.common;

import com.lyqc.base.enums.SystemCodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: DTO父类
 * @Date : 下午12:17 2018/1/6
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = 2631762900842068932L;
    /**
     * 默认是：mljrcrm001
     */
    @ApiModelProperty(name="lyqckey",value="鉴权code(默认是：mljrcrm001)",required = true,dataType="String")
    private String lyqckey;
    @ApiModelProperty(name="traceId",value="追踪ID(可以通过UUID生成)",required = true,dataType="String")
    private String traceId;
    /**
     * {@link SystemCodeEnum#getName()}
     */
    @ApiModelProperty(name="channel",value="来源渠道",required = true,dataType="String")
    private String channel;
}
