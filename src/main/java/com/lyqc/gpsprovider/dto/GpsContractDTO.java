package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: GPS安装联系人信息DTO
 * @Date : 2018/6/18 上午11:02
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsContractDTO extends BaseDTO {
    private static final long serialVersionUID = -8523764455995128703L;
    @ApiModelProperty(name="contract",value="联系人",dataType="String")
    @NotEmpty(message = "联系人不能为空")
    @NotNull(message = "联系人不能为空")
    @Length(max = 20,message = "联系人请输入20个字符以内")
    private String contract;
    @ApiModelProperty(name="phone",value="联系电话",dataType="String")
    @NotEmpty(message = "联系电话不能为空")
    @NotNull(message = "联系电话不能为空")
    @Length(max = 20,message = "联系电话请输入20个字符以内")
    private String phone;
    @ApiModelProperty(name="address",value="安装地址",dataType="String")
    @NotEmpty(message = "安装地址不能为空")
    @NotNull(message = "安装地址不能为空")
    @Length(max = 150,message = "安装地址请输入150个字符以内")
    private String address;
    @ApiModelProperty(name="installer",value="安装人员",dataType="String")
    @NotEmpty(message = "安装人员不能为空")
    @NotNull(message = "安装人员不能为空")
    @Length(max = 20,message = "安装人员请输入20个字符以内")
    private String installer;
    @ApiModelProperty(name="remark",value="备注",dataType="String")
    private String remark;


    public GpsContractDTO() {
    }
}
