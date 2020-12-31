package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: GPS供应商信息Re
 * @Date : 2018/6/22 下午4:30
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsDealerInfoRe extends BaseRe{

    @ApiModelProperty(name="name",value="GPS供应商名称",dataType="String")
    private String name;
    @ApiModelProperty(name = "code", value = "GPS供应商编号", dataType = "String")
    private String code;
    @ApiModelProperty(name = "type", value = "GPS类型", dataType = "String")
    private String type;
}
