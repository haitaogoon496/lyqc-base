package com.lyqc.receiveorder.enums;

import com.lyqc.base.enums.EnumDesc;

public enum YulvMethodEnum implements EnumDesc {
    //提单
    PASS_SECOND_AUDIT(1001, "/yulv/enter/passSecondSubmit","提交初审"),
    AGREE_AUDIT(1002, "/yulv/enter/agreeAuditSubmit","准入提交"),
    CREDIT_AUDIT(1003, "/yulv/enter/creditAuditSubmit","信审提交"),
    BEFORE_LOAN_AUDIT(1004, "/yulv/enter/beforeLoanAuditSubmit","贷前提交"),
    AFTER_LOAN_AUDIT(1005, "/yulv/enter/afterLoanAuditSubmit","贷后提交"),
    LTV_ADJUST_SAVE(1010, "/yulv/enter/agreeLtvAdjustSave","ltv 保存调整"),
    LTV_ADJUST_SUBMIT(1011, "/yulv/enter/agreeLtvAdjustSubmit","ltv 同意/提交调整"),
    HIGH_RISK_AGREE(1012, "/yulv/enter/agreeHighRisk","高风险拒绝或同意"),
    BEFORE_LOAN_CHANGE_FUND(1020, "/yulv/enter/beforeLoanChangeFund","贷前更换资方"),

    //退回
    BEFORE_LAON_BACK_NEW(1101, "/yulv/back/beforeLoanBack","贷前退回新建待提交"),
    AGREE_BACK_NEW(1102, "/yulv/back/agreeBack","准入退回新建待提交"),
    AGREE_13_DEL(1103, "/yulv/back/del","新建待提交删除订单"),
    ORDER_CANCEL(1104, "/yulv/back/cancel","取消订单"),
    ORDER_DEL(1105, "/yulv/back/delAllTheWay","删除订单"),

    //订单相关查询
    UNITE_SYN_QUERY(1200, "/yulv/query/param/synQuery","通用的同步查询接口"),

    QUERY_ORDER_BAT_FEE(1201, "/yulv/query/batQueyAppInfoFee","订单费用批量查询接口"),
    QUERY_ORDER_BAT(1201, "/yulv/query/batQueyAppInfo","批量查询"),
    QUERY_ORDER_DETAIL(1202, "/yulv/query/queryAppInfo","订单详情查询"),
    QUERY_ORDER_CONTRACT(1203, "/yulv/query/queryAppInfoContract","订单合同字段信息查询"),
    QUERY_ORDER_DEALERS(1204, "/yulv/query/dealerInfoByRegCodes","根据地区码列表查询所有门店信息"),
    QUERY_ORDER_DEALER(1205, "/yulv/query/dealerInfoByRegCode","根据地区码查询所有门店信息"),
    QUERY_ORDER_DETAIL_HOOK(1206, "/yulv/query/queryAppInfoWithHook","订单查询详情-钩子方式"),
    QUERY_DEALER_COMPANY_ALL(1207, "/yulv/query/queryAllDealerCompany","查询所有的经销商单位"),
    QUERY_DEALERS_BY_COMPANYCODE(1208, "/yulv/query/queryAllDealerByDealerCompany","根据经销商单位查询所有的经销商门店"),
    QUERY_PROVINCE_LIST(1209, "/yulv/query/queryProvinceList","获取省市列表"),
    QUERY_DEALER_COMPANY_BY_CODE(1210, "/yulv/query/queryDealerCompanyByCode","根据code查询经销商单位"),
    QUERY_DEALER_BY_CODE(1211, "/yulv/query/queryDealerByCode","根据code查询经销商门店"),
    QUERY_DEALER_BY_REGCODE(1212, "/yulv/query/queryDealerCompanyByRegCode","根据RegCode地区编码查询经销商单位"),
    QUERY_FUND_BANK(1213, "/yulv/query/queryFundSupportBankList","查询资金方支持银行列表"),
    QUERY_REBEAT_AMOUNT(1214, "/yulv/query/rebeatAmount","查询返佣金额"),
    QUERY_FINANCE_USER_LIST(1215, "/yulv/query/financeUserList","金融专员查询"),
    QUERY_DEALERS_BY_DEALEARS(1216, "/yulv/query/dealerInfoByDealerCodes","根据门店code查询门店详情"),
    QUERY_LOAN_ACCOUNT(1217, "/yulv/query/loanAccount","查询放款账户"),

    //保存信息
    SAVE_REC_LOANACCOUNT(1301, "/yulv/save/loanAccount","保存车商放款账户到力蕴"),
    SAVE_PUBLICLICENSE(1302, "/yulv/save/publicLicense","保存公牌车辆卖方单位信息"),
    SAVE_CARINFO(1303, "/yulv/save/saveCarInfo","贷前保存车辆信息"),
    SAVE_FUND_CONTRACT_INFO(1304, "/yulv/econtract/saveFundContract","贷前保存资金签章完成合同"),
    SAVE_MORTGAGE_INFO(1305, "/yulv/save/mortgageInfo","贷前保存资金签章完成合同"),
    SAVE_REPAYMENT_CAR_INFO(1306, "/yulv/save/repayCardInfo","贷前保存还款卡信息"),
//    SAVE_FLOW_SEQ(1307, "/yulv/save/flowSeq","贷前更换流程"), 放入贷前提交实现

    //包装接口--微众
    WEBANK_FIRST_AUDIT(4001, "/yulv/wrap/webank/first","微众一审"),
    WEBANK_CHANGE_CARD(4002, "/yulv/wrap/webank/changeCard","微众换绑卡"),
    WEBANK_IOUTRY(4003, "/yulv/wrap/webank/ioutry","微众借据试算"),
    WEBANK_SIGN_CONTRACT(4004, "/yulv/wrap/webank/signContract","微众存证接口"),
    //包装接口--浦发零售
    PFLS_CREDIT_AUDIT(4101, "/yulv/wrap/pfls/credit","浦发零售授信接口"),

    TOOL_LTV_CAL(5001,"/yulv/tool/ltvcal","LTV融贷比计算"),

    NOTIFY_ONUPDATE(6001, "/yulv//notify/onUpdate","状态变化更新接口"),

    //电子合同
    ECONTRACT_PRE_SIGN(7001,"/yulv/econtract/preSign","电子合同预签"),
    ECONTRACT_FINAL_SIGN(7002,"/yulv/econtract/finalSign","电子合同终签"),
    ECONTRACT_QUERY_PRE_SIGN(7003,"/yulv/econtract/query/preSign","电子合同查询预签"),
    ECONTRACT_QUERY_FINAL_SIGN(7004,"/yulv/econtract/query/finalSign","电子合同查询终签状态"),
    ECONTRACT_QUERY_FINAL_SIGN_LIST(7005,"/yulv/econtract/query/finalSign/list","电子合同查询终签列表"),
    ECONTRACT_CANCEL(7006,"/yulv/econtract/cancel","电子合同取消合同"),

    ;


    /**
     * 方法编号
     * 规则4位，前两位表示同一业务范围  后两位表示序号
     */
    private Integer index;
    /**
     * url
     */
    private String url;
    /**
     * 描述
     */
    private String desc;

    YulvMethodEnum(Integer index, String url, String desc){
        this.index = index;
        this.url = url;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return getUrl();
    }

    public String getUrl() {
        return url;
    }

    public static YulvMethodEnum getYulvMethodEnum(String url){
        YulvMethodEnum[] values = YulvMethodEnum.values();
        for (YulvMethodEnum methodEnum : values) {
            String url1 = methodEnum.getUrl();
            if (url1.equals(url)){
                return methodEnum;
            }
        }
        return null;
    }
}
