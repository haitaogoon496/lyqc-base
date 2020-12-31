package com.lyqc.product.dto.loanbefore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.util.List;

/**
 * @description: 贷前免审核更换资方，依赖【超享包】的规则列表
 * @Date : 2019/1/18 16:54
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
public class RelyEPRecommendDTO extends BaseRecommentDTO{
    @ApiModelProperty(name="enjoyPackItem",value="超享包包含项目Code",dataType="List<String>")
    @NotNull(message = "enjoyPackItemCodes不能为空")
    private List<String> enjoyPackItemCodes;
}
