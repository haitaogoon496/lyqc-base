package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 根据资金方选择金融产品DTO
 * @Date : 2018/7/3 下午6:07
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductChooseDTO extends BaseDTO{
    private static final long serialVersionUID = 2467334557170130594L;
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    @NotNull
    private Integer dealerCode;
    @ApiModelProperty(name="fundId",value="资金方Id",dataType="Integer")
    @NotNull
    private Integer fundId;
    @ApiModelProperty(name="fundNo",value="资金方编码",dataType="String")
    @NotEmpty
    private String fundNo;
}
