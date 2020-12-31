package com.lyqc.receiveorder.param.bdx;

import javax.validation.Valid;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/10.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxCreditAuditParam extends BaseEnterInParam{

    /**
     * 魔蝎授权信息
     */
/*    @Valid
    private BdxMxAuthParam mxAuthParam;*/

}
