package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 办单侠金融产品信息
 * Created by xiaoxian on 2018/7/11.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxProductParam implements Serializable{
    @NotNull
    private BigDecimal applyCarloanAmount;//车辆贷款价格
    /**
     * 首付额度
     */
    private BigDecimal applyInitPayment;//首付额度
    /**
     * 贷款期限
     */
    private Integer applyLoanPeriods;//贷款期限（月）
    /**
     * 利率档位
     */
    private String rateLevel;//利率档位
    /**
     * 账户管理费
     */
    private BigDecimal accountFee;//账户管理费
    /**
     * GPS档位
     */
    private String gpsLevel;//GPS档位
    /**
     * 金融产品code
     */
    private Long productCode;//所选贷款产品标识号
    /**
     * 金融产品名
     */
    private String productName;//所选贷款产品名称
    /**
     * 申请平台费率
     */
    private BigDecimal applyComRate;
    /**
     *第二年保险套餐id
     */
    private Long applyYanbaoTc;//延保费套餐
    /**
     * 第三年保险套餐id
     */
    private Integer applyYanbaoTc3;
    /**
     * 人身险名称
     */
    private String lifeInsuranceRule;
    /**
     * 人身险费率
     */
    private BigDecimal lifeInsuranceRate;

    /**
     * 延保费套餐id
     */
    private String extendId;//延保ID

    /**
     * 公证费
     */
    private BigDecimal notarizationFee;//公证费
    /**
     * 续保押金id
     */
    private Integer renewalCommissionId;
    /**
     * 平台费收取方式
     */
    private Integer takenMode;

    /**
     * gps浮动费用,渠道新车县网特有
     */
    private BigDecimal gpsAttachFee;

    /**
     * 平台费浮动费率,渠道新车县网特有
     */
    private BigDecimal commAttachFeeRate;

    /**
     * 申请盗抢险id
     */
    private Integer applyTheftProtectionId;

    /**
     * 申请盗抢险金额
     */
    private BigDecimal applyTheftProtectionFee;

    /**
     * 申请盗抢险返佣
     */
    private BigDecimal applyTheftProtectionRebate;

    /**
     * 超享包id
     */
    private Long enjoyPackId;
}
