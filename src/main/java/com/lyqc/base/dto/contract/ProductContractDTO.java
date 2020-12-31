package com.lyqc.base.dto.contract;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 产品配置电子合同DTO
 * 业务场景：根据产品ID等相关参数，获取对应配置的电子合同key
 * @Date : 下午6:28 2018/3/20
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class ProductContractDTO extends BaseDTO {
    private static final long serialVersionUID = 8576179754549820252L;
    /**
     * 产品id，必传
     */
    @NotNull(message = "[productId]productId不能为空")
    @ApiModelProperty(name="productId",value="productId",required = true,dataType="Integer")
    private Integer productId;
    /**
     * 直营渠道标识:SP:渠道，ZX：直销
     */
    @NotNull(message = "[systemCode]systemCode不能为空")
    @ApiModelProperty(name="systemCode",value="systemCode",required = true,dataType="String")
    private String systemCode;
    /**
     * 合同签署阶段 必传
     * {@link com.lyqc.base.enums.ContractConstant.ContractStepEnum}
     */
    @NotNull(message = "[step]step不能为空")
    @ApiModelProperty(name="step",value="step",required = true,dataType="Integer")
    private Integer step;
    /**
     * 公牌类型，如果传空，代表表中的NULL
     * {@link com.lyqc.base.enums.CarLoanConstant.IsCompanyLicenseEnum}
     */
    @ApiModelProperty(name="isCompanyLicense",value="isCompanyLicense",dataType="Integer")
    private Integer isCompanyLicense;

    public ProductContractDTO() {
    }

    public ProductContractDTO(Integer productId, String systemCode, Integer step, Integer isCompanyLicense) {
        this(productId,systemCode,step);
        this.isCompanyLicense = isCompanyLicense;
    }

    public ProductContractDTO(Integer productId, String systemCode, Integer step) {
        this.productId = productId;
        this.systemCode = systemCode;
        this.step = step;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getIsCompanyLicense() {
        return isCompanyLicense;
    }

    public void setIsCompanyLicense(Integer isCompanyLicense) {
        this.isCompanyLicense = isCompanyLicense;
    }
}
