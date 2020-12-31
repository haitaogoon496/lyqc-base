package com.lyqc.receiveorder.param.bdx;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import lombok.Data;

/**
 * 办单侠准入入参
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxAgreeInParam extends BaseEnterInParam{

    /**
     * 基本信息
     */
    @Valid
    private BdxBaseParam baseInfo;

    /**
     * 主贷人
     */
    @Valid
    @NotNull
    private BdxProppersParam proppersParam;

    /**
     * 婚姻状况
     */
    @NotBlank
    private String marriage;
    /**
     * 配偶情况
     */
    @Valid
    private BdxRelativeParam relativeParam;

    /**
     * 是否有担保人
     */
    @NotBlank
    private String isAssure;
    /**
     * 担保人
     */
    @Valid
    private BdxGuaranteeParam guaranteeParam;

    /**
     * 车辆
     */
    @Valid
    @NotNull
    private BdxCarParam carParam;

    /**
     * 紧急联系人
     */
    @Valid
    @NotNull
    private BdxEcontactParam econtactParam;

    /**
     * 秒拒结果
     */
    private BdxSecondRefuseParam secondRefuseParam;

    /**
     * 验卡信息
     */
    private BdxCheckCardParam checkCardParam;

    /**
     * 金融产品信息
     */
    @Valid
    @NotNull
    private BdxProductParam productParam;

    /**
     * 合同附件 主要是新网的两个
     */
    private List<BdxContractAnnexParam> contractAnnexParam;

    /**
     * 魔蝎授权信息
     */
    @Valid
    private BdxMxAuthParam mxAuthParam;
}
