package com.lyqc.seig.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BaseParam {

    // 分页参数 start
    @ApiModelProperty(value = "页码", name = "pn")
    private Integer pn = 1; // 页码
    @ApiModelProperty(value = "分页数据标志位", name = "index")
    private Integer index; // 分页数据标志位
    @ApiModelProperty(value = "页大小", name = "pageSize")
    private Integer pageSize = 200; // 分页数据大小
    // 分页参数 end

    // 登录用户参数 start
    @ApiModelProperty(value = "登录用户ID", name = "syUserId")
    private Integer syUserId;
    @ApiModelProperty(value = "登录用户名称", name = "syUserName")
    private String syUserName;
    @ApiModelProperty(value = "登录用户真实姓名", name = "syTrueName")
    private String syTrueName;
    // 登录用户参数 end

    @ApiModelProperty(value = "是否直营", name = "ifZhiYing")
    private Boolean ifZhiYing;

}
