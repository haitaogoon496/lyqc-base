package com.lyqc.transfer.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 门店 DTO
 * @author lingyu.shang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DealerDTO implements Serializable {

    @ApiModelProperty(name = "dealerCode",value = "门店code")
    private Integer dealerCode;

    @ApiModelProperty(name = "dealerName",value = "门店名称")
    private String dealerName;

    @ApiModelProperty(name = "dealerType",value = "门店类型")
    private String dealerType;

    @ApiModelProperty(name = "dealerScopes",value = "门店code集合")
    private List<Integer> dealerScopes;

    @ApiModelProperty(name = "saleArea",value = "销售地区")
    private String saleArea;

    @ApiModelProperty(name = "province",value = "所在省份")
    private String province;

    @ApiModelProperty(name = "city",value = "所选城市")
    private String city;

    @ApiModelProperty(name = "status",value = "状态")
    private String status;

}
