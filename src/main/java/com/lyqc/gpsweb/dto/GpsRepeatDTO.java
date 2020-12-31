package com.lyqc.gpsweb.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.MinSize;
import net.sf.oval.constraint.NotEmpty;

import java.util.Set;

/**
 * @description: GPS重复设备对应单号DTO对象
 * @Date : 2018/7/17 下午3:57
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpsRepeatDTO extends BaseDTO {
    private static final long serialVersionUID = 3647896283809970625L;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotEmpty(message = "[appCode]申请单号不能为空")
    private String appCode;
    @ApiModelProperty(name="deviceList",value="GPS设备号集合",dataType="Set<String>")
    @MinSize(value = 1,message = "GPS设备号集合最小为1")
    private Set<String> deviceList;
}
