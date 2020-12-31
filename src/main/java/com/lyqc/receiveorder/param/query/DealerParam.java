package com.lyqc.receiveorder.param.query;

import com.lyqc.receiveorder.param.BaseReiveorderParam;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * @author huyue
 * @date 2018/10/25 17:17
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DealerParam extends BaseReiveorderParam {

    private Integer companyCode;//经销商单位code

    private Integer dealerCode;//经销商门店code

    private List<Integer> companyCodeList;

    private List<Integer> dealerCodeList;
}
