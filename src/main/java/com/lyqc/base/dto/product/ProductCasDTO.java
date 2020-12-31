package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 为 lyqc-cas 与金融产品项目交互查询产品列表提供的 DTO
 * @author lingyu.shang
 */
@Data
public class ProductCasDTO extends BaseDTO {

    @ApiModelProperty(name = "dealerCodes", value = "门店code列表")
    private List<Integer> dealerCodes;

    @ApiModelProperty(name = "productName", value = "产品名称")
    private String productName;

    @ApiModelProperty(name = "type", value = "产品分类")
    private Integer type;

    @ApiModelProperty(name = "id", value = "产品ID")
    private Integer id;

    @ApiModelProperty(name = "choiceDate", value = "选择日期")
    private String choiceDate;

    @ApiModelProperty(name = "isUseCondition", value = "是否使用查询条件")
    private Boolean isUseCondition;

    @ApiModelProperty(name = "status", value = "状态")
    private Integer status;

}
