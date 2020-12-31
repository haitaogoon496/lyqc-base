package com.lyqc.receiveorder.param.bdx;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * User: HY
 * Date: 2019/2/26
 * Time: 15:55
 * Description:贷前更换产品入参
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBeforeLoanChangeProductParam extends BdxBeforeLoanChangeFundParam{
}
