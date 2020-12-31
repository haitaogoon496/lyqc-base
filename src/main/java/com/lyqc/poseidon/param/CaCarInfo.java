package com.lyqc.poseidon.param;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.Date;

@Data
public class CaCarInfo implements Serializable {
    private static final long serialVersionUID = 2458864052313491815L;

    private Integer carId;

    private String carBrand;

    private String carSeries;

    private String carYear;

    @JsonProperty(value = "carGearBox")
    private String carGearbox;

    @JsonProperty(value = "carDisTon")
    private String carDiston;

    private String carStyles;

    private Double carNewPrice;

    private String carIdentify;

    private String engineNo;

    private String carColor;

    private String fuelType;

    private String isOld;

    private Integer carMiles;

    private Date carFirstBook;

    private String carSaleName;

    private String carSaleIdno;

    private String remakes;

    private String aCarCondtion;

    @JsonProperty(value = "acarPrice")
    private Double aCarPrice;

    private String floatingPro;

    @JsonProperty(value = "acarPriceChange")
    private String aCarPriceChange;

    private String plateNumber;

    private Date mortgageDate;

    private Double openFare;

    private String vinIdentifyChe300;

    private Integer transferCnt;

    private String transCity;

    private String isMatchChe300;

    private String reportUrl;

    private Integer transCityId;

    private Integer vinIdentifyChe300Id;

    private String licensePlateNum;

    private String extendInCompany;

    private Double extendAmount;

    private Double exDealerRebate;

    private Double exCompanyRebate;

    private String exRemarks;

    private String insuranceCompany;

    private Double insuredAmount;

    private Double inCompanyRebate;

    private Double inDealerRebate;

    private Double inProfitability;

    private String inRemarks;

    private String morOperator;

    private Double mortgageAmount;

    private Double exterMoramount;

    private String morRemarks;

    private String measureCompany;

    private String gpsDealer;

    private String gpsInstallWay;

    private Date getCarBookDate;

    private Date updateTime;

    private Integer gpsCount;

    private String gpsPro;

    private String gpsNo;

    private String bePledModelId;

    private String afPledModelId;

    private String carResult;

    private Date saveMortgageDateTime;

    private Integer isSpecialCarserise;

    private Date transferRegDate;

    private Double invoicePrice;

    private Date invoiceDate;

    private Double taxPrice;

    private Double trafficInsurance;

    private Double businessInsurance;

    private String vehicleName;

    private String vehicleCode;

    private String insuranceNo;
}
