package com.lyqc.base.re.product;

import java.math.BigDecimal;
import java.util.List;

import com.lyqc.base.common.BaseRe;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @description: 高风险贷款产品Re类
 * @Date : 2018/3/15 下午3:28
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class HighRiskRateProductRe extends BaseRe {

    private static final long serialVersionUID = 842590321117243008L;
    /**
     * 车贷产品ID
     */
    @ApiModelProperty(name="productId",value="车贷产品名",dataType="Integer")
    private Integer productId;
    /**
     * 车贷产品名称
     */
    @ApiModelProperty(name="productName",value="车贷产品名",dataType="String")
    private String productName;
    /**
     * 高风险平台费套餐
     */
    @ApiModelProperty(name="highRiskRateTcReList",value="高风险平台费套餐",dataType="List")
    private List<HighRiskRateTcRe> highRiskRateTcReList;
    /**
     * 高风险贷款利率
     */
    @ApiModelProperty(name="highLoanRate",value="高风险贷款利率",dataType="BigDecimal")
    private BigDecimal highLoanRate;
}
