package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: GPS审批流程DTO对象
 * @Date : 2018/7/27 下午5:24
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class GpsFlowDTO extends BaseDTO {
    @ApiModelProperty(name="flowRemark",value="审批备注",dataType="String")
    private String flowRemark;
    /**
     * {@link CarGpsConstant.ViolationSituationEnum#getIndex()}
     */
    @ApiModelProperty(name="violationSituation",value="违规情况(1:有违规 0:无违规)",dataType="Integer")
    private Integer violationSituation;
    /**
     * {@link CarGpsConstant.ViolationTypeEnum#getIndex()}
     */
    @ApiModelProperty(name="violationType",value="违规类别，多个以;分割",dataType="String")
    private String violationType;
    /**
     * 只要有任何一项非审批成功，皆为审批失败
     */
    @ApiModelProperty(name="approveSuccess",value="是否审批成功",dataType="boolean")
    private boolean approveSuccess;
}
