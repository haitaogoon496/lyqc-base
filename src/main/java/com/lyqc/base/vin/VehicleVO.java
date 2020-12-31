package com.lyqc.base.vin;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 根据vin码查车型
 *
 */
@Data
public class VehicleVO {
    /**
     * 厂商名称
     */
    @ApiModelProperty(name="companyName",value="厂商名称",dataType="String")
	private String companyName;
    /**
     * 品牌名称
     */
    @ApiModelProperty(name="brandName",value="品牌名称",dataType="String")
    private String brandName;
    /**
     * 车系名称
     */
    @ApiModelProperty(name="familyName",value="车系名称",dataType="String")
    private String familyName;
    /**
     * 车款
     */
    @ApiModelProperty(name="groupName",value="车款",dataType="String")
    private String groupName;
    /**
     * 车型编码
     */
    @ApiModelProperty(name="vehicleCode",value="车型编码",dataType="String")
    private String vehicleCode;
    /**
     * 车型名称
     */
    @ApiModelProperty(name="vehicleName",value="车型名称",dataType="String")
    private String vehicleName;
    /**
     * 排量
     */
    @ApiModelProperty(name="displacement",value="排量",dataType="String")
    private String displacement;
    /**
     * 额定座位数
     */
    @ApiModelProperty(name="seat",value="额定座位数",dataType="String")
    private String seat;
    /**
     * 新车购置价
     */
    @ApiModelProperty(name="purchasePrice",value="新车购置价",dataType="String")
    private String purchasePrice;
    /**
     * 备注
     */
    @ApiModelProperty(name="remark",value="备注",dataType="String")
    private String remark;

    /**
     * 变速器类型
     */
    @ApiModelProperty(name="gearboxType",value="变速器类型",dataType="String")
    private String gearboxType;
    /**
     * 年款
     */
    @ApiModelProperty(name="yearPattern",value="年款",dataType="String")
    private String yearPattern;
    /**
     * 额定载质量
     */
    @ApiModelProperty(name="tonnage",value="额定载质量",dataType="String")
    private String tonnage;
}
