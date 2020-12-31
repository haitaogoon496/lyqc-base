package com.lyqc.base.re.contract;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 产品配置电子合同DTO
 * 业务场景：根据产品ID等相关参数，获取对应配置的电子合同key
 * @Date : 下午6:39 2018/3/20
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductContractRe extends BaseRe {
    /**
     * 合同contractKeys
     */
    @ApiModelProperty(name="contractKeys",value="contractKeys",required = true,dataType="List<String>")
    private List<String> contractKeys;
}
