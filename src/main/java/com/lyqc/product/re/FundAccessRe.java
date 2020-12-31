package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * @description:  资金规则准入Re对象
 * @Date : 2018/7/3 上午11:22
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"id"})
public class FundAccessRe extends BaseRe {
    private static final long serialVersionUID = -1998137535971686744L;
    @ApiModelProperty(name="accessList",value="资金方准入结果",dataType="List<FundAccessResultRe>")
    private List<FundAccessResultRe> accessList;
}
