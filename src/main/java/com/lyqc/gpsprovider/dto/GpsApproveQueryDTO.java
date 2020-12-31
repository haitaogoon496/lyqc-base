package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;

/**
 * @description: GPS安装信息认证结果DTO
 * @Date : 2018/6/13 下午7:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GpsApproveQueryDTO extends BaseDTO{
    private static final long serialVersionUID = -5153572255270505605L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotEmpty(message = "[appCode]appCode不能为空")
    private String appCode;
    /**
     * true:自动 false:手动
     */
    @ApiModelProperty(name="auto",value="auto",dataType="boolean")
    private boolean auto;
}
