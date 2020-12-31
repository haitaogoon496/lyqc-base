package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.query.AppCodeParam;

import lombok.Data;

/**
 * @Author: xiaoxian
 * @Date: 2019/3/1 15:06
 * @Version
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxSaveRepaymentParam extends AppCodeParam{

    private BdxRepmentCardParam repmentCardParam;
}
