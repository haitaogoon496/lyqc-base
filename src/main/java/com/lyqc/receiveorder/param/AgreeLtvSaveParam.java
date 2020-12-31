package com.lyqc.receiveorder.param;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgreeLtvSaveParam extends BaseAppCodeOpratorParam{

    @NotNull(message = "车贷金额必须填写")
    private BigDecimal adjustAmount;

    @NotBlank(message = "gps档位必须填写")
    private String adjustGpsLevel;

    @NotNull(message = "平台费率必须填写")
    private BigDecimal adjustComFeeRate;

    //@NotNull(message = "盗抢险费用必须填写")
    private BigDecimal adjustTheftProtectionFee;
    //盗抢险id
    private Integer adjustTheftProtectionId;
}
