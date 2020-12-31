package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 延保费适用产品配置DTO
 * @Date : 上午11:47 2018/3/14
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class YbtcApplyProductDTO extends BaseDTO {
    /**
     * {@link com.lyqc.base.enums.ProductConstant.YbtcClassifyEnum}
     */
    @NotNull(message = "[classify]不能为空")
    @ApiModelProperty(name="classify",value="classify",required = true,dataType="Integer")
    private Integer classify;

    public YbtcApplyProductDTO() {
    }

    public YbtcApplyProductDTO(Integer classify) {
        this.classify = classify;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }
}
