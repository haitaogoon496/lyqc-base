package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 操作者信息
 * Created by xiaoxian on 2018/8/22.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxOperatorParam implements Serializable{
    /**
     * 用户
     */
    @NotNull(message = "操作用户id不能为空")
    @ApiModelProperty(value="用户id")
    private Long optUserId;
    /**
     * 用户名
     */
    @NotBlank(message = "操作用户名不能为空")
    @ApiModelProperty(value="用户名")
    private String optUserName;
}
