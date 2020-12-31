package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 办单侠 车辆信息
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxCarParam implements Serializable{
    private String gpsInstallWay;
    /**
     * 品牌 VARCHAR(20)
     */
    private String carBrand;
    private String carBrandCode;
    /**
     * 车系 VARCHAR(20)
     */
    private String carSeries;
    private String carSeriesCode;

    /**
     * 车款年代 VARCHAR(80)
     */
    private String carYear;
    private String carYearCode;
    /**
     * 排量吨位 VARCHAR(20)
     */
    private String carGearbox;
    /**
     * 档位 VARCHAR(20)
     */
    private String carDiston;
    /**
     * 款式 VARCHAR(100)
     */
    private String carStyles;
    /**
     * 车辆识别代号 VARCHAR(50)
     */
    private String carIdentify;
    /**
     * 车辆颜色 VARCHAR(10)
     */
    private String carColor;
    /**
     * 燃料类型(1:汽油柴油 2:油电混动 3:纯电)
     */
    private Integer fuelType;
    /**
     * 二手车里程数/公里 INT
     */
    private Integer carMiles;
    /**
     * 二手车首次登记日期 DATE 转换 成 long
     */
    private Long carFirstBook;
    /**
     * 二手车卖方姓名 VARCHAR(30)
     */
    private String carSaleName;
    /**
     * 二手车卖方身份证号码 VARCHAR(30)
     */
    private String carSaleIdno;
    /**
     * 新车参考价 DECIMAL(10,2)
     */
    private BigDecimal carNewPrice;
    /**
     * 卖方车牌号 VARCHAR(25)
     */
    private String licensePlateNum;

    /**
     * 是否二手车
     */
    private String isOld;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 公告型号
     */
    private String vehicleName;

    /**
     *车辆型号风控用 车型库的vehicleCode
     */
    private String modelId;

    /**
     * 发票开票金额
     */
    private BigDecimal invoicePrice;

    /**
     * 发票开票日期
     */
    private Date invoiceDate;

}
