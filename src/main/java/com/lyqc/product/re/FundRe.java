package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:  资金方Re对象
 * @Date : 2018/7/3 上午11:22
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class FundRe extends BaseRe {
    private static final long serialVersionUID = 6060278027562326775L;
    @ApiModelProperty(name = "fundNo", value = "资金方代码", dataType = "String")
    private String fundNo;
    @ApiModelProperty(name = "fundName", value = "资金方名称", dataType = "String")
    private String fundName;

    public FundRe(Integer id, String fundNo, String fundName) {
        super(id);
        this.fundNo = fundNo;
        this.fundName = fundName;
    }
}
