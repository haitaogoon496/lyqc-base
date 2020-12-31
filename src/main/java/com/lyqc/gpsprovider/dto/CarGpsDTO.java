package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.MatchPattern;
import net.sf.oval.constraint.NotEmpty;

/**
 * @description: 车辆GPS安装信息DTO对象
 * @Date : 2018/6/13 下午7:33
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CarGpsDTO extends BaseDTO {
    private static final long serialVersionUID = -1809990452604634476L;
    @ApiModelProperty(name="installWay",value="安装方式",dataType="String")
    @NotEmpty(message = "[installWay]安装方式不能为空")
    @EnumValidation(enums = CarGpsConstant.GpsInstallTypeEnum.class,message = "安装方式不合法，必须{0}")
    /**
     * {@link CarGpsConstant.GpsInstallTypeEnum#getIndex()}
     */
    private Integer installWay;
    @ApiModelProperty(name="gpsDealerName",value="GPS提供商名称",dataType="String")
    @NotEmpty(message = "GPS提供商名称不能为空")
    private String gpsDealerName;
    @ApiModelProperty(name="gpsDealerNo",value="GPS提供商代码",dataType="String")
    @NotEmpty(message = "GPS提供商代码不能为空")
    private String gpsDealerNo;
    @ApiModelProperty(name="gpsNo",value="GPS设备ID",dataType="String")
    @NotEmpty(message = "GPS设备ID不能为空")
    @MatchPattern(pattern = "^[A-Za-z0-9]+$",message = "GPS设备号不合法，请检查是否包含空格，只能输入数字或字母")
    private String gpsNo;
    @ApiModelProperty(name="gpsPosition",value="安装位置",dataType="String")
    @NotEmpty(message = "安装位置不能为空")
    @EnumValidation(enums = CarGpsConstant.GpsInstallPositionEnum.class,method = EnumValidation.InvokeMethod.getName,message = "安装位置不合法，必须{0}")
    /**
     * {@link CarGpsConstant.GpsInstallPositionEnum#getName()}
     */
    private String gpsPosition;

    public CarGpsDTO() {
    }
}
