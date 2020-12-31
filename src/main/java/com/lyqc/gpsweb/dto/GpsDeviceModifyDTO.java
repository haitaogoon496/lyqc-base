package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.MinSize;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.util.List;

/**
 * @description: 用于更新申请单号的相应的GPS设备
 * @Date : 2018/7/17 下午4:15
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpsDeviceModifyDTO extends BaseDTO {
    private static final long serialVersionUID = -4723213830902112856L;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotEmpty(message = "[appCode]申请单号不能为空")
    private String appCode;
    @ApiModelProperty(name="gpsList",value="GPS设备号集合",dataType="List<CarGpsDTO>")
    @NotNull(message = "[gpsList]GPS设备号集合不能为空")
    @MinSize(value = 1,message = "GPS设备号集合最小为1")
    private List<CarGpsDTO> gpsList;
}
