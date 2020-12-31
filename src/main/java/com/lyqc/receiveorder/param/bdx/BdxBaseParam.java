package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 办单侠收单基本信息
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBaseParam implements Serializable{

    //人员相关
    /**
     * 用户
     */
//    @NotBlank(message = "销售ID能为空")
    private Long userId;
    /**
     * 用户名
     */
    @NotBlank(message = "销售姓名不能为空")
    private String userName;
    /**
     * 所属市场 VARCHAR(100)
     */
    private String belongMarket;
    /**
     * 所属经销商单位
     */
    private String belongDealer;
    /**
     * 所属经销商单位名称
     */
    private String belongDealerName;
    /**
     * 门店
     */
    @NotNull
    private Long dealerCode;
    /**
     * 所属运营
     */
    private String belongOperation;
    /**
     * 所属销售
     */
    private String belongSale;
    /**
     * 所属销售
     */
    private String belongSaleManager;
    /**
     * 审批流程
     */
    private Long flowSeq;

    //意向相关
    /**
     * 车类
     */
    @NotBlank(message = "车类不能为空")
    private String isLcv;
    /**
     * 是否提供房产 CHAR(1)
     */
    private String isHouse;
    /**
     * 是否二手车
     */
    private String isOld;

    /**
     * 实际销售价/元 DECIMAL(10,2)
     */
    private BigDecimal salePrice;
    /**
     * 车辆贷款金额 DECIMAL(10,2)
     */
    private BigDecimal applyCarloanAmount;
    /**
     * 申请还款期限
     */
    @NotNull
    private Integer applyLoanPeriods;//申请还款期限(月)
    /**
     * 是否自带征信
     * 0 否 1简版 2详版 3铅笔头
     * 订单中心固定的传0,其他的哪里来的母鸡啊
     */
    @NotNull
    private Integer isCredit;

    //设备相关
    /**
     * IP地址
     */
    private String ipAddr;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 经度
     */
    private String lng;
    /**
     * 国际移动设备身份码
     */
    private String imei;

    /**
     * 资金方简称
     * XHC..WC..WZ
     */
    private String fundSource;

    /**
     * 是否公牌 0否 1是
     */
    private Integer isCompanyLicense;
}
