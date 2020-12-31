package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 刷新Redis缓存DTO对象
 * @Date : 2019/1/2 下午6:10
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RedisRefreshDTO extends BaseDTO {
    private static final long serialVersionUID = -8053896803034329986L;
    @ApiModelProperty(name="refreshAllMetadata",value="是否全局刷新辛巴数据字典",dataType="boolean")
    private boolean refreshAllMetadata;
    @ApiModelProperty(name="refreshAllProductInfo",value="是否全局刷新所有产品详情",dataType="boolean")
    private boolean refreshAllProductInfo;
    @ApiModelProperty(name="metadataCodes",value="数据字典name集合",dataType="List<String>")
    private List<String> metadataCodes;
    @ApiModelProperty(name="productCodes",value="产品ID集合",dataType="List<Integer>")
    private List<Integer> productCodes;
}