package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: GPS派单DTO对象
 * @Date : 2018/7/27 下午5:24
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class GpsSendDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotEmpty(message = "appCode非空")
    private String appCode;
    @ApiModelProperty(name="approveUserId",value="审批用户ID",dataType="Integer")
    @NotNull(message = "approveUserId(审批用户ID)非空")
    private Integer approveUserId;
    @ApiModelProperty(name="approveUserName",value="审批用户名称",dataType="String")
    @NotEmpty(message = "approveUserName(审批用户名称)非空")
    private String approveUserName;
    @ApiModelProperty(value = "是否是测试用户")
    private Boolean testUser;

}
