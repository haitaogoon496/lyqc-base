package com.lyqc.base.dto.grayControl;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 产品灰度控制DTO对象
 * @Date : 下午5:39 2018/4/16
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class GrayControlDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotNull(message = "[appCode]appCode不能为空")
    private String appCode;
    @ApiModelProperty(name="productId",value="productId",dataType="Integer")
    private Integer productId;
    @ApiModelProperty(name="grayTarget",value="grayTarget",dataType="Integer")
    @NotNull(message = "[grayTarget]灰度目标能为空")
    private Integer grayTarget;
}
