package com.lyqc.seig.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="SeperateParam对象",description="经销商额度列表查询&分单&退单操作对象")
public class SeperateParam extends BaseParam {

    @ApiModelProperty(value="申请单号",name="appCode",required=true)
    private String appCode; // 申请单号

    @ApiModelProperty(value="指定的分单人的ID",name="sepUserId")
    private Integer sepUserId; // 指定的分单人的ID

    @ApiModelProperty(value="指定的分单人的名字",name="sepUserName")
    private String sepUserName; // 指定的分单人的名字

    @ApiModelProperty(value="经销商单位",name="companyName")
    private String companyName;// 经销商单位

}
