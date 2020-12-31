package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 根据资金方获取准入的产品
 * @Date : 2018/7/4 下午8:50
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@NoArgsConstructor
@Data
public class ProductAccessDTO extends BaseDTO{
    private static final long serialVersionUID = 7136984620653417070L;
    @NotNull(message = "[dealerCode]门店code不能为空")
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    private Integer dealerCode;
    @NotEmpty(message = "[fundId]资金方ID不能为空")
    @ApiModelProperty(name="fundNo",value="资金方编码",dataType="String")
    private String fundNo;
}
