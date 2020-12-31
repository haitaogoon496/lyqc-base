package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.enums.AnnexTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;

import java.util.Date;

/**
 * @description: 车架号变更DTO对象
 * @Date : 2018/12/10 上午10:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VinChangeDTO extends BaseDTO {
    @NotEmpty(message = "申请单编号不能为空")
    @ApiModelProperty(name="appCode",value="申请单编号",dataType="String")
    private	String appCode;
    @NotEmpty(message = "车架号(VIN码)不能为空")
    @ApiModelProperty(name="frameNo",value="车架号(VIN码)",dataType="String")
    private	String frameNo;
}
