package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huyue
 * @date 2018/10/15 14:31
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyContractDetailDto implements Serializable {

    private Integer id;

    private Integer contractId;

    private String cityCode;

    private String city;

    private String provinceCode;

    private String province;

    private String conKey;

    private String conValue;

    private String description;

    private Integer type;

    private Date createTime;

    private Date updateTime;

}
