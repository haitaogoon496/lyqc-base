package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 产品信息DTO
 * @Date : 下午6:18 2018/3/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class ProductInfoDTO extends BaseDTO{
    private static final long serialVersionUID = -696102050484197746L;
    @NotNull(message = "[dealerCode]门店code不能为空")
    @ApiModelProperty(name="dealerCode",value="门店code",required = true,dataType="Integer")
    private Integer dealerCode;
    @ApiModelProperty(name="typeId",value="产品分类",dataType="Integer")
    private Integer typeId;
    @ApiModelProperty(name="isQuick",value="isQuick",dataType="Integer")
    private Integer isQuick;

    public Integer getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(Integer dealerCode) {
        this.dealerCode = dealerCode;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getIsQuick() {
        return isQuick;
    }

    public void setIsQuick(Integer isQuick) {
        this.isQuick = isQuick;
    }
}
