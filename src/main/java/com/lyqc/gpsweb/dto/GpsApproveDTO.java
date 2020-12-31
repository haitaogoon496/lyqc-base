package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.CascadeValidation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.MinSize;
import net.sf.oval.constraint.NotEmpty;

import java.util.List;

/**
 * @description: GPS审批流程DTO对象
 * @Date : 2018/7/27 下午5:24
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class GpsApproveDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotEmpty(message = "appCode非空")
    private String appCode;
    @ApiModelProperty(name="gpsFlowDTO",value="GpsFlowDTO",dataType="GpsFlowDTO")
    @CascadeValidation("gpsFlowDTO")
    private GpsFlowDTO gpsFlowDTO;
    @MinSize(value = 0,message = "安装信息(gpsList)集合不能为空")
    @ApiModelProperty(name="gpsList",value="安装信息(gpsList)",dataType="List<CarGpsDTO>")
    private List<CarGpsDTO> gpsList;
}
