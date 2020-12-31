package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.CascadeValidation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * @description: GPS安装信息DTO对象
 * @Date : 2018/6/13 下午7:38
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsInstallInfoDTO extends BaseDTO {
    private static final long serialVersionUID = -8523764455995128703L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotEmpty(message = "订单号不能为空")
    private String appCode;
    @ApiModelProperty(name="carGpsList",value="GPS信息",dataType="List<CarGpsDTO>")
    @NotNull
    @CascadeValidation("carGpsList")
    private List<CarGpsDTO> carGpsList = Collections.emptyList();
    @ApiModelProperty(name="gpsContract",value="GPS联系人",dataType="GpsContractDTO")
    @NotNull
    @CascadeValidation("gpsContract")
    private GpsContractDTO gpsContract;

    public GpsInstallInfoDTO() {
    }
}
