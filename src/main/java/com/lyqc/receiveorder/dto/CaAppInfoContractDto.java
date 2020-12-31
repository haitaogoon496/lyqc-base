package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 合同相关字段返回实体
 * @author huyue
 * @date 2018/9/27 16:57
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoContractDto implements Serializable {

    private String appCode;

    /**
     * 所选贷款产品名称
     */
    private String productName;

    /**
     * 所选贷款产品ID
     */
    private Integer productCode;

    /**
     * 资方信息
     */
    private FundSideInfoDto fundSideInfoDto;


    /**
     * 订单费用信息
     */
    private CaAppInfoFeeDto caAppInfoFeeDto;

    /**
     * 申请人基本信息
     */
    private CaProppserInfoDto caProppserInfoDto;

    /**
     * 是否有担保人 0 没有 1 个人担保 2 公司担保
     */
    private String isAssure;

    /**
     * 担保人信息
     */
    private CaGuaranteeInfoDto caGuaranteeInfoDto;

    /**
     * 是否打印配偶信息 0 不打印 1 打印
     */
    private String isPrintW;

    /**
     * 配偶信息
     */
    private CaMarriageInfoDto caMarriageInfoDto;

    /**
     *SY经销商门店信息
     */
    private SyDealerDto syDealerDto;

    /**
     *抵押公司信息
     */
    private CaMortgageCompanyDto caMortgageCompanyDto;

    /**
     * 放款账户信息
     */
    private CaAppLoanAccountDto caAppLoanAccountDto;

    /**
     * 合同详情
     */
    private List<SyContractDetailDto> syContractDetailDtoList;

    /**
     * CA公牌车辆挂靠公司信息表
     */
    private CaAppCompanyDto caAppCompanyDto;

}
