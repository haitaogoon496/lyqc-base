package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.enums.AnnexTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 申请单附件DTO对象
 * @Date : 2018/6/15 下午7:18
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class AppAnnexDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="申请单编号",dataType="String")
    private	String appCode;//申请单编号
    @ApiModelProperty(name="imgKey",value="影像件key",dataType="String")
    private	String imgKey;//影像件key
    @ApiModelProperty(name="annexName",value="附件名称",dataType="String")
    private	String annexName;//附件名称
    @ApiModelProperty(name="annexAddress",value="附件路径",dataType="String")
    private	String annexAddress;//附件路径
    @ApiModelProperty(name="createTime",value="上传时间",dataType="Date")
    private Date createTime;//上传时间
    @ApiModelProperty(name="userId",value="上传用户ID",dataType="String")
    private	Integer userId;//上传用户ID
    @ApiModelProperty(name="userName",value="上传用户名称",dataType="String")
    private	String userName;//上传用户名称
    @ApiModelProperty(name="status",value="状态 0 无效 1 有效   默认1",dataType="Integer")
    private	Integer status;//状态 0 无效 1 有效   默认1
    @ApiModelProperty(name="remarks",value="备注",dataType="String")
    private	String remarks;//备注
    /**
     * {@link AnnexTypeEnum#getIndex()}
     */
    @ApiModelProperty(name="annexType",value="附件类型",dataType="Integer")
    private	Integer annexType;//附件类型
}
