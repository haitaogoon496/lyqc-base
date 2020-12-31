package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Collections;
import java.util.List;

/**
 * @author lingyu.shang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"id"})
public class RuleCommendRe<T> extends BaseRe {

    private static final long serialVersionUID = 2211718665047002614L;

    @ApiModelProperty(name="must",value="是否必须")
    private boolean must;

    @ApiModelProperty(name="ruleList",value="费用项列表")
    private List<T> ruleList = Collections.emptyList();

}
