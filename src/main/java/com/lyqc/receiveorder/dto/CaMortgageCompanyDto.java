package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**抵押公司表
 * @author huyue
 * @date 2018/9/29 15:23
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaMortgageCompanyDto implements Serializable {

    /**
     * 公司名称
     */
    private String companyAddress;

    /**
     * 公司地址
     */
    private String companyName;
}
