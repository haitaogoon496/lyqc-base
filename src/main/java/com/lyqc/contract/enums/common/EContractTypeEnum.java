package com.lyqc.contract.enums.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ggg on 2017/8/2.
 * 电子合同类型和影像中心bigsCode对应枚举
 */
public enum EContractTypeEnum {
    /**
     * 南粤电子合同
     */
    NY_LOAN_APPLY(83, "ny_loan_apply", "南粤贷款申请表", false),
    NY_WARRANT(82, "ny_warrant", "南粤客户授权委托书", false),
    NY_CRE_WARRANT(79, "ny_cre_warrant", "南粤征信授权书", false),
    NY_COMMITMENT(81, "ny_commitment", "南粤告知及承诺书", false),
    NY_ECONTRACT(80, "ny_econtract", "南粤借款合同", false),
    /**
     * 新网电子合同
     */
    XW_JTHJ_ECONTRACT_ELE(89,"xw_jthj_econtract_ele","个人借款合同-金堂汇金", false),
    XW_WARRANT_ELE(72, "xw_warrant_ele", "新网个人信息查询及使用授权书", true),
    XW_ECONTRACT_ELE(10, "xw_econtract_ele", "新网个人借款合同-联合贷", false),
    XW_BBW_ECONTRACT_ELE(89 , "xw_bbw_econtract_ele", "新网个人借款合同-广西北部湾", false),
    XW_CREDIT_AUTHORIZATION(109, "xw_credit_authorization", "新网征信授权书", true),
    XW_LIFE_SAFE(56, "xw_life_safe", "新华昌-人保寿险贷款借款人意外险投保授权书", true),

    //app给力蕴
    XW_UNITE_LOAN_C(10, "xw_unite_loan_c", "新网联合贷合同",true),

    WC_LOAN_AGREE(88,"wc_loan_agree","挖财借款服务合同", false),
	WC_LOAN_ECONTRACT(10,"wc_loan_econtract","挖财借款合同", false),

    // 以租代售合同
    YZDS_ASSURE_CONT(83, "yzdg_assure_cont", "以租代售-抵押担保合同", false),
    YZDS_LEASE_BACK(84, "yzdg_rent_econtract", "以租代售-租赁售后回租合同", false),

    // 众邦
    ZB_LOAN_USE_PROOF(47, "zb_loan_use_proof", "众邦借款用途证明书", true),
    ZB_LOAN_APPLY(48, "zb_loan_apply", "众邦提款申请书", true),
    ZB_LOAN_ECONTRACT(49, "zb_loan_econtract", "武汉众邦银行个人借款合同", true),

    // 微众合同
    WEBANK_WARRANT_CONTRACT_ELE(23, "webank_warrant_contract", "微众保证协议书", true),
    WEBANK_MLJR_ASSESS(64, "webank_assessment_report", "微众-美利云评估报告", true),
    MLJR_ASSESS(64, "assessment_report", "美利云评估报告", true),


    BOHAI_LEASE_SERVICE_C(26, "bh_loan_agree", "渤海-汽车融资租赁合同", true),
    BOHAI_LEASE_SERVICE_OTHER_C(27, "bh_rent_econtract", "渤海-汽车融资租赁合同之补充协议", true),
    BOHAI_LOAN_SERVICE_C(28, "bh_service_econtract", "渤海-融资服务合同", true),
    BOHAI_LOAN_SERVICE_MORTGAGE_C(29, "bh_car_mortgage_c", "渤海-融资服务合同之抵押合同", true),

    PFLS_4IN1(116, "pfls_4in1", "浦发新零售-四合一合同", true),
    PFLS_LEASE_SERVICE_C(85, "pfls_lease_service_c", "浦发新零售-汽车租赁服务合同", false),
    THEFT_PROTECTION(137, "theft_protection", "车辆卫星定位及盗抢服务购买协议", true),

    STANDARD_MORTGAGE_C(87, "standard_mortgage_c", "汽车抵押合同-通用", false),
    LEASE_SERVICE_C(85, "lease_service_c", "汽车租赁服务合同", false),
    WEBANK_RENT_ECONTRACT(45, "webank_rent_econtract", "微众-汽车融资租赁售后回租合同", true),
    WEBANK_LEASE_SERVICE_C(46, "webank_lease_service_c", "微众-汽车租赁服务合同", true),

    CAR_MORTGAGE_C(143, "car_mortgage_c", "汽车抵押合同——融租",true),
    LOAN_AGREE(145, "loan_agree","借款服务合同", true),
    RENT_ECONTRACT(141, "rent_econtract", "汽车融资租赁合同", true),

    CAR_LOAN_CONTRACT(155, "car_loan_contract","新网车贷借款合同",true),
    EXTRA_LOAN_CONTRACT(156, "extra_loan_contract","新网超融借款合同",true);


    /**
     * 电子合同编号，对应电子合同签署类型
     */
    private int num;
    /**
     * 影像中心bigsCode
     */
    private String code;
    /**
     * 合同描述
     */
    private String desc;

    /**
     * 外部生成合同
     */
    private boolean external;

    EContractTypeEnum(int num, String code, String desc, boolean external) {
        this.num = num;
        this.code = code;
        this.desc = desc;
        this.external = external;
    }

    public static EContractTypeEnum parse(String code) {
        for (EContractTypeEnum eContractTypeEnum : EContractTypeEnum.values()) {
            if (eContractTypeEnum.getCode().equals(code)) {
                return eContractTypeEnum;
            }
        }
        throw new RuntimeException(ErrorConstants.ENUM_EXCEPTION.getErrorCode() + "-" + ErrorConstants.ENUM_EXCEPTION.getErrorMessage() + ":" + code);
    }

    /**
     * 需要转换成图片的电子合同
     * @param eContractTypeEnum
     * @return
     */
    public static boolean isProcessImg(EContractTypeEnum eContractTypeEnum) {
        List<EContractTypeEnum> contractTypeList = new ArrayList<>();
        contractTypeList.add(NY_LOAN_APPLY);
        contractTypeList.add(NY_WARRANT);
        contractTypeList.add(NY_CRE_WARRANT);
        contractTypeList.add(NY_COMMITMENT);
        contractTypeList.add(NY_ECONTRACT);
        if (contractTypeList.contains(eContractTypeEnum)) {
            return true;
        }
        return false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }
}
