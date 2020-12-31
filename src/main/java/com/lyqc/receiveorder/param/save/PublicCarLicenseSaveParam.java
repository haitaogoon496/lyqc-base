package com.lyqc.receiveorder.param.save;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.BaseReiveorderParam;
import com.lyqc.receiveorder.param.bdx.BdxPublicLicenseParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicCarLicenseSaveParam extends BaseReiveorderParam {
    @NotBlank(message = "订单号不能为空")
    private String appCode;

    @NotNull(message = "公牌信息不能为空")
    BdxPublicLicenseParam publicLicenseParam;
}
