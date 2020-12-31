package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 车辆GPS安装信息Re
 * @Date : 2018/6/13 下午7:33
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CarGpsRe extends BaseRe {
    private static final long serialVersionUID = -1809990452604634476L;
    /**
     * {@link CarGpsConstant.GpsInstallTypeEnum#getIndex()}
     */
    @ApiModelProperty(name="installWay",value="安装方式",dataType="Integer")
    private Integer installWay;
    /**
     * {@link CarGpsConstant.GpsInstallTypeEnum#getName()}
     */
    @ApiModelProperty(name="installWayDesc",value="安装方式名称",dataType="String")
    private String installWayDesc;
    @ApiModelProperty(name="gpsType",value="GPS设备类型",dataType="String")
    private String gpsType;
    @ApiModelProperty(name="gpsDealerName",value="GPS提供商名称",dataType="String")
    private String gpsDealerName;
    @ApiModelProperty(name="gpsDealerNo",value="GPS提供商编号",dataType="String")
    private String gpsDealerNo;
    @ApiModelProperty(name="gpsNo",value="GPS设备号",dataType="String")
    private String gpsNo;
    @ApiModelProperty(name="gpsPosition",value="安装位置",dataType="String")
    private String gpsPosition;
    @ApiModelProperty(name="selected",value="是否选中",dataType="boolean")
    private boolean selected = false;

    public CarGpsRe() {
    }
}
