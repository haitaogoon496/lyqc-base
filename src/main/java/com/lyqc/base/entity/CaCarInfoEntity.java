package com.lyqc.base.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @description: 贷款车辆基本信息
 * @Date : 2018/12/3 下午3:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CaCarInfoEntity implements Serializable{
    private static final long serialVersionUID = 5750307862889430057L;
    /**
     * 车辆标识号
     */
    private Integer carId;

    /**
     * 品牌
     */
    private String carBrand;

    /**
     * 车系
     */
    private String carSeries;

    /**
     * 年份
     */
    private String carYear;

    /**
     * 排量或吨位（注：档位）
     */
    private String carGearbox;

    /**
     * 档位（注：排量或吨位）
     */
    private String carDiston;

    /**
     * 款式
     */
    private String carStyles;

    /**
     * 新车参考价格(不含税)(元)
     */
    private BigDecimal carNewPrice;

    /**
     * 车辆识别代号
     */
    private String carIdentify;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 车辆颜色
     */
    private String carColor;

    /**
     * 燃料类型(1:汽油柴油 2:油电混动 3:纯电)
     */
    private Byte fuelType;

    /**
     * 是否二手车
     */
    private String isOld;

    /**
     * 二手车里程数
     */
    private Integer carMiles;

    /**
     * 二手车首次登记日期
     */
    private Date carFirstBook;

    /**
     * 二手车卖方姓名
     */
    private String carSaleName;

    /**
     * 二手车卖方身份证号码
     */
    private String carSaleIdno;

    /**
     * 备注
     */
    private String remakes;

    /**
     * 评估车况
     */
    private String aCarCondtion;

    /**
     * 评估车价
     */
    private BigDecimal aCarPrice;

    /**
     * 二手车车价上浮比例
     */
    private Integer floatingPro;

    /**
     * 二手车调整价
     */
    private BigDecimal aCarPriceChange;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 抵押日期
     */
    private Date mortgageDate;

    /**
     * 开票价
     */
    private BigDecimal openFare;

    /**
     * 车300认证渠道验证
     */
    private String vinIdentifyChe300;

    /**
     * 转让次数
     */
    private Integer transferCnt;

    /**
     * 转让城市
     */
    private String transCity;

    /**
     * 是否匹配车300
     */
    private String isMatchChe300;

    /**
     * 报告url
     */
    private String reportUrl;

    /**
     * 转让城市id
     */
    private Integer transCityId;

    /**
     * 车300认证渠道验证id
     */
    private Integer vinIdentifyChe300Id;

    /**
     * 卖方的车牌号
     */
    private String licensePlateNum;

    /**
     * 出单延保公司
     */
    private String extendInCompany;

    /**
     * 延保金额
     */
    private BigDecimal extendAmount;

    /**
     * 经销商延保返点
     */
    private BigDecimal exDealerRebate;

    /**
     * 延保公司返点
     */
    private BigDecimal exCompanyRebate;

    /**
     * 延保备注
     */
    private String exRemarks;

    /**
     * 出单保险公司
     */
    private String insuranceCompany;

    /**
     * 投保金额
     */
    private BigDecimal insuredAmount;

    /**
     * 保险公司返点
     */
    private BigDecimal inCompanyRebate;

    /**
     * 经销商保险返点
     */
    private BigDecimal inDealerRebate;

    /**
     * 保险盈利金额
     */
    private BigDecimal inProfitability;

    /**
     * 保险备注
     */
    private String inRemarks;

    /**
     * 抵押专员姓名
     */
    private String morOperator;

    /**
     * 抵押收费金额
     */
    private BigDecimal mortgageAmount;

    /**
     * 支付外部抵押费
     */
    private BigDecimal exterMoramount;

    /**
     * 抵押备注
     */
    private String morRemarks;

    /**
     * 评估公司
     */
    private String measureCompany;

    /**
     * gps提供商
     */
    private String gpsDealer;

    /**
     * gps安装方式
     */
    private String gpsInstallWay;

    /**
     * 产证收到日期
     */
    private Date getCarBookDate;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * GPS数量
     */
    private Integer gpsCount;

    /**
     * GPS属性,有线无线
     */
    private String gpsPro;

    /**
     * GPS设备ID
     */
    private String gpsNo;

    /**
     * 贷前抵押渠道
     */
    private String bePledModelId;

    /**
     * 贷后抵押渠道
     */
    private String afPledModelId;

    /**
     * 第一车网查询结果：0:无记录； 1:一致；2:不一致
     */
    private String carResult;

    /**
     * 保存抵押时间
     */
    private Date saveMortgageDateTime;

    /**
     * 是否是特殊车系.0-否,1-是.
     */
    private Byte isSpecialCarserise;

    /**
     * 二手车过户完成时间
     */
    private Date transferRegDate;

    /**
     * 发票开票金额
     */
    private BigDecimal invoicePrice;

    /**
     * 发票开票日期
     */
    private Date invoiceDate;

    /**
     * 购置税实际金额
     */
    private BigDecimal taxPrice;

    /**
     * 交强险
     */
    private BigDecimal trafficInsurance;

    /**
     * 商业保险
     */
    private BigDecimal businessInsurance;


    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarGearbox() {
        return carGearbox;
    }

    public void setCarGearbox(String carGearbox) {
        this.carGearbox = carGearbox;
    }

    public String getCarDiston() {
        return carDiston;
    }

    public void setCarDiston(String carDiston) {
        this.carDiston = carDiston;
    }

    public String getCarStyles() {
        return carStyles;
    }

    public void setCarStyles(String carStyles) {
        this.carStyles = carStyles;
    }

    public BigDecimal getCarNewPrice() {
        return carNewPrice;
    }

    public void setCarNewPrice(BigDecimal carNewPrice) {
        this.carNewPrice = carNewPrice;
    }

    public String getCarIdentify() {
        return carIdentify;
    }

    public void setCarIdentify(String carIdentify) {
        this.carIdentify = carIdentify;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Byte getFuelType() {
        return fuelType;
    }

    public void setFuelType(Byte fuelType) {
        this.fuelType = fuelType;
    }

    public String getIsOld() {
        return isOld;
    }

    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    public Integer getCarMiles() {
        return carMiles;
    }

    public void setCarMiles(Integer carMiles) {
        this.carMiles = carMiles;
    }

    public Date getCarFirstBook() {
        return carFirstBook;
    }

    public void setCarFirstBook(Date carFirstBook) {
        this.carFirstBook = carFirstBook;
    }

    public String getCarSaleName() {
        return carSaleName;
    }

    public void setCarSaleName(String carSaleName) {
        this.carSaleName = carSaleName;
    }

    public String getCarSaleIdno() {
        return carSaleIdno;
    }

    public void setCarSaleIdno(String carSaleIdno) {
        this.carSaleIdno = carSaleIdno;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }

    public String getaCarCondtion() {
        return aCarCondtion;
    }

    public void setaCarCondtion(String aCarCondtion) {
        this.aCarCondtion = aCarCondtion;
    }

    public BigDecimal getaCarPrice() {
        return aCarPrice;
    }

    public void setaCarPrice(BigDecimal aCarPrice) {
        this.aCarPrice = aCarPrice;
    }

    public Integer getFloatingPro() {
        return floatingPro;
    }

    public void setFloatingPro(Integer floatingPro) {
        this.floatingPro = floatingPro;
    }

    public BigDecimal getaCarPriceChange() {
        return aCarPriceChange;
    }

    public void setaCarPriceChange(BigDecimal aCarPriceChange) {
        this.aCarPriceChange = aCarPriceChange;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getMortgageDate() {
        return mortgageDate;
    }

    public void setMortgageDate(Date mortgageDate) {
        this.mortgageDate = mortgageDate;
    }

    public BigDecimal getOpenFare() {
        return openFare;
    }

    public void setOpenFare(BigDecimal openFare) {
        this.openFare = openFare;
    }

    public String getVinIdentifyChe300() {
        return vinIdentifyChe300;
    }

    public void setVinIdentifyChe300(String vinIdentifyChe300) {
        this.vinIdentifyChe300 = vinIdentifyChe300;
    }

    public Integer getTransferCnt() {
        return transferCnt;
    }

    public void setTransferCnt(Integer transferCnt) {
        this.transferCnt = transferCnt;
    }

    public String getTransCity() {
        return transCity;
    }

    public void setTransCity(String transCity) {
        this.transCity = transCity;
    }

    public String getIsMatchChe300() {
        return isMatchChe300;
    }

    public void setIsMatchChe300(String isMatchChe300) {
        this.isMatchChe300 = isMatchChe300;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public Integer getTransCityId() {
        return transCityId;
    }

    public void setTransCityId(Integer transCityId) {
        this.transCityId = transCityId;
    }

    public Integer getVinIdentifyChe300Id() {
        return vinIdentifyChe300Id;
    }

    public void setVinIdentifyChe300Id(Integer vinIdentifyChe300Id) {
        this.vinIdentifyChe300Id = vinIdentifyChe300Id;
    }

    public String getLicensePlateNum() {
        return licensePlateNum;
    }

    public void setLicensePlateNum(String licensePlateNum) {
        this.licensePlateNum = licensePlateNum;
    }

    public String getExtendInCompany() {
        return extendInCompany;
    }

    public void setExtendInCompany(String extendInCompany) {
        this.extendInCompany = extendInCompany;
    }

    public BigDecimal getExtendAmount() {
        return extendAmount;
    }

    public void setExtendAmount(BigDecimal extendAmount) {
        this.extendAmount = extendAmount;
    }

    public BigDecimal getExDealerRebate() {
        return exDealerRebate;
    }

    public void setExDealerRebate(BigDecimal exDealerRebate) {
        this.exDealerRebate = exDealerRebate;
    }

    public BigDecimal getExCompanyRebate() {
        return exCompanyRebate;
    }

    public void setExCompanyRebate(BigDecimal exCompanyRebate) {
        this.exCompanyRebate = exCompanyRebate;
    }

    public String getExRemarks() {
        return exRemarks;
    }

    public void setExRemarks(String exRemarks) {
        this.exRemarks = exRemarks;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public BigDecimal getInCompanyRebate() {
        return inCompanyRebate;
    }

    public void setInCompanyRebate(BigDecimal inCompanyRebate) {
        this.inCompanyRebate = inCompanyRebate;
    }

    public BigDecimal getInDealerRebate() {
        return inDealerRebate;
    }

    public void setInDealerRebate(BigDecimal inDealerRebate) {
        this.inDealerRebate = inDealerRebate;
    }

    public BigDecimal getInProfitability() {
        return inProfitability;
    }

    public void setInProfitability(BigDecimal inProfitability) {
        this.inProfitability = inProfitability;
    }

    public String getInRemarks() {
        return inRemarks;
    }

    public void setInRemarks(String inRemarks) {
        this.inRemarks = inRemarks;
    }

    public String getMorOperator() {
        return morOperator;
    }

    public void setMorOperator(String morOperator) {
        this.morOperator = morOperator;
    }

    public BigDecimal getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(BigDecimal mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public BigDecimal getExterMoramount() {
        return exterMoramount;
    }

    public void setExterMoramount(BigDecimal exterMoramount) {
        this.exterMoramount = exterMoramount;
    }

    public String getMorRemarks() {
        return morRemarks;
    }

    public void setMorRemarks(String morRemarks) {
        this.morRemarks = morRemarks;
    }

    public String getMeasureCompany() {
        return measureCompany;
    }

    public void setMeasureCompany(String measureCompany) {
        this.measureCompany = measureCompany;
    }

    public String getGpsDealer() {
        return gpsDealer;
    }

    public void setGpsDealer(String gpsDealer) {
        this.gpsDealer = gpsDealer;
    }

    public String getGpsInstallWay() {
        return gpsInstallWay;
    }

    public void setGpsInstallWay(String gpsInstallWay) {
        this.gpsInstallWay = gpsInstallWay;
    }

    public Date getGetCarBookDate() {
        return getCarBookDate;
    }

    public void setGetCarBookDate(Date getCarBookDate) {
        this.getCarBookDate = getCarBookDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getGpsCount() {
        return gpsCount;
    }

    public void setGpsCount(Integer gpsCount) {
        this.gpsCount = gpsCount;
    }

    public String getGpsPro() {
        return gpsPro;
    }

    public void setGpsPro(String gpsPro) {
        this.gpsPro = gpsPro;
    }

    public String getGpsNo() {
        return gpsNo;
    }

    public void setGpsNo(String gpsNo) {
        this.gpsNo = gpsNo;
    }

    public String getBePledModelId() {
        return bePledModelId;
    }

    public void setBePledModelId(String bePledModelId) {
        this.bePledModelId = bePledModelId;
    }

    public String getAfPledModelId() {
        return afPledModelId;
    }

    public void setAfPledModelId(String afPledModelId) {
        this.afPledModelId = afPledModelId;
    }

    public String getCarResult() {
        return carResult;
    }

    public void setCarResult(String carResult) {
        this.carResult = carResult;
    }

    public Date getSaveMortgageDateTime() {
        return saveMortgageDateTime;
    }

    public void setSaveMortgageDateTime(Date saveMortgageDateTime) {
        this.saveMortgageDateTime = saveMortgageDateTime;
    }

    public Byte getIsSpecialCarserise() {
        return isSpecialCarserise;
    }

    public void setIsSpecialCarserise(Byte isSpecialCarserise) {
        this.isSpecialCarserise = isSpecialCarserise;
    }

    public Date getTransferRegDate() {
        return transferRegDate;
    }

    public void setTransferRegDate(Date transferRegDate) {
        this.transferRegDate = transferRegDate;
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }

    public BigDecimal getTrafficInsurance() {
        return trafficInsurance;
    }

    public void setTrafficInsurance(BigDecimal trafficInsurance) {
        this.trafficInsurance = trafficInsurance;
    }

    public BigDecimal getBusinessInsurance() {
        return businessInsurance;
    }

    public void setBusinessInsurance(BigDecimal businessInsurance) {
        this.businessInsurance = businessInsurance;
    }
}