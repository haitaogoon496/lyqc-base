package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.Assert;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 计算服务人贷后管理费率
 * 业务需求：服务人贷后管理费率（月）=（PMT(借款总利率/12,贷款期数,-1)- PMT(资方贷款利率/12,贷款期数,-1)）
 * @see <a href="http://conf.op.mljr.com/pages/viewpage.action?pageId=27460123#id-[20181019]%E5%90%88%E5%90%8C%E6%9B%B4%E6%96%B0-%E5%88%A9%E7%8E%87%E8%A7%84%E5%88%99%E4%BB%A5%E5%8F%8A%E7%BB%8F%E9%94%80%E5%95%86%E8%B4%A6%E6%88%B7%E5%8F%96%E5%80%BC%E8%A7%84%E5%88%99-3.2%E6%9A%82%E5%81%9C-%E6%9B%B4%E6%8D%A2%E5%80%9F%E6%AC%BE%E6%9C%8D%E5%8A%A1%E5%90%88%E5%90%8C%E5%88%A9%E7%8E%87%E8%A7%84%E5%88%99">查看</a>
 * @Date : 2018/11/27 下午6:46
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SerLoanAfterMngRateDTO extends BaseDTO {
    @ApiModelProperty(name="loanRate",value="年利率",dataType="BigDecimal")
    @NotNull(message = "[loanRate]年利率不能为空")
    private BigDecimal loanRate;
    @ApiModelProperty(name="costRate",value="资方成本利率",dataType="BigDecimal")
    @NotNull(message = "[costRate]资方成本利率不能为空")
    private BigDecimal costRate;
    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="Integer")
    @NotNull(message = "[loanPeriods]还款期限不能为空")
    private Integer loanPeriods;
}
