package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 高风险产品DTO
 * @Date : 下午4:41 2018/3/21
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class HighRiskProductDTO extends BaseDTO {
    private static final long serialVersionUID = 8143734645177836315L;
    @NotNull(message = "[dealerCode]门店code不能为空")
    @ApiModelProperty(name="dealerCode",value="门店code",required = true,dataType="Integer")
    private Integer dealerCode;

    public Integer getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(Integer dealerCode) {
        this.dealerCode = dealerCode;
    }

}
