package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * @description:  资金规则准入结果Re对象
 * @Date : 2018/7/3 上午11:22
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"id"})
public class FundAccessResultRe extends BaseRe {
    private static final long serialVersionUID = 3019917254167733377L;
    @ApiModelProperty(name="access",value="是否校验通过",dataType="boolean")
    private boolean access;
    @ApiModelProperty(name="fund",value="资金方",dataType="FundRe")
    private FundRe fund;
    @ApiModelProperty(name="messages",value="不通过校验信息",dataType="List<String>")
    private List<String> messages;
    @ApiModelProperty(name="fundsCanSwitchToThis",value="能够切换成此资金方的资金方列表",dataType="List<String>")
    private List<String> fundsCanSwitchToThis;
}
