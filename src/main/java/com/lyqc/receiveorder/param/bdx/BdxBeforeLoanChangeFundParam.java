package com.lyqc.receiveorder.param.bdx;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 贷前变更资金方
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBeforeLoanChangeFundParam extends BaseEnterInParam {

    @ApiModelProperty(value = "fasle=保存,true=提交")
    private boolean submit;

    @NotNull(message = "申请车贷金额不能为空")
    @ApiModelProperty(value = "申请变更的车贷金额")
    private BigDecimal carLoanAmount;

    @NotNull(message = "金融产品不能为空")
    @ApiModelProperty(value = "金融产品id")
    private Integer productCode;

    @ApiModelProperty(value = "金融产品名称")
    private String productName;//所选贷款产品名称

    @NotBlank(message = "gps档位不能为空")
    private String gpsLevel;

    @NotBlank(message = "利率档位不能为空")
    private String rateLevel;

    /**
     * 申请平台费率
     */
    @NotNull
    private BigDecimal applyComRate;


    /**
     * 人身险名称
     */
    private String lifeInsuranceRule;

    /**
     * 人身险费率
     */
    private BigDecimal lifeInsuranceRate;

    /**
     * 申请盗抢险id
     */
    private Integer applyTheftProtectionId;

    /**
     * 续保押金id
     */
    private Integer renewalCommissionId;

    /**
     * 账户管理费
     */
    private BigDecimal accountFee;//账户管理费

    /**
     * 资方code
     */
    private String fundSource;

    /**
     * 超享包id
     */
    private Long enjoyPackId;


}
