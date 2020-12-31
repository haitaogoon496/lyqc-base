package com.lyqc.poseidon.enums;


/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午6:21 2018/11/5
 */
public enum PonseidonCarProductEnum {

    //poseidon字段 金融产品字段
    APP_CODE("appCode","appCode"),
    IS_SUBMIT("isSubmit","isSubmit"),
    GRAY_TARGET("grayTarget","grayTarget"),
    Renewal_Commission_Rule_Id("renewalCommissionRuleId","renewalCommissionRuleId"),
    AccountAmount("accountAmount","accountAmount"),
    LicenseType("licenseType","licenseType"),
    IsHighRisk("isHighRisk","isHighRisk"),
    CarLoanAmount("carLoanAmount","carLoanAmount"),
    ComRate("comRate","comRate"),
    DealerCode("dealerCode","dealerCode"),
    ExtendId("extendId","extendId"),
    GpsLevel("gpsLevel","gpsLevel"),
    IsHouse("isHouse","isHouse"),
    IsLcv("isLcv","isLcv"),
    IsOld("isOld","isOld"),
    IsPreInterest("isPreInterest","isPreInterest"),
    LoanPeriods("LoanPeriods","LoanPeriods"),
    LoanRate("LoanRate","LoanRate"),
    NotarizationFee("NotarizationFee","NotarizationFee"),
    ProductCode("ProductCode","ProductCode"),
    RateLevel("RateLevel","RateLevel"),
    SalePrice("SalePrice","SalePrice"),
    SecondYearPremiumTcId("aYanbaoTc","SecondYearPremiumTcId"),
    TakenMode("TakenMode","TakenMode"),
    ThirdYearPremiumTcId("aYanbaoTc3","aYanbaoTc3"),
    TheftProtectionFee("theftProtectionFee","theftProtectionFee");


    private String poseidon;
    private String carProduct;

    PonseidonCarProductEnum(String poseidon,String carProduct){
        this.poseidon = poseidon;
        this.carProduct = carProduct;
    }

    public String getPoseidon() {
        return poseidon;
    }

    public void setPoseidon(String poseidon) {
        this.poseidon = poseidon;
    }

    public String getCarProduct() {
        return carProduct;
    }

    public void setCarProduct(String carProduct) {
        this.carProduct = carProduct;
    }
}
