package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * 资方相关信息
 * User: HY
 * Date: 2019/1/2
 * Time: 15:24
 * Description:
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundSideInfoDto implements Serializable {

    /**
     * 微众订单号  webankNo(数据库列名)
     */
    private String webankno;
}
