package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.Range;

/**
 * @description: GPS安装联系人信息Re
 * @Date : 2018/6/18 上午11:02
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsContractRe extends BaseRe {
    private static final long serialVersionUID = -8523764455995128703L;
    @ApiModelProperty(name="contract",value="联系人",dataType="String")
    @NotEmpty(message = "联系人不能为空")
    @Range(min = 0,max = 20)
    private String contract;
    @ApiModelProperty(name="phone",value="联系电话",dataType="String")
    @NotEmpty(message = "联系电话不能为空")
    @Range(min = 0,max = 20)
    private String phone;
    @ApiModelProperty(name="address",value="安装地址",dataType="String")
    @NotEmpty(message = "安装地址不能为空")
    @Range(min = 0,max = 150)
    private String address;
    @ApiModelProperty(name="installer",value="安装人员",dataType="String")
    @NotEmpty(message = "安装人员不能为空")
    @Range(min = 0,max = 20)
    private String installer;
    @ApiModelProperty(name="remark",value="备注",dataType="String")
    private String remark;


    public GpsContractRe() {
    }
}
