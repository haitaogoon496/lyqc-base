package com.lyqc.poseidon.dto;

import com.lyqc.receiveorder.vo.CaCarInfoVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: csd
 * @Date: 2018/11/29 17:22
 * @Version 1.0
 */
@Data
public class ModifyInfoDTO implements Serializable {


    private static final long serialVersionUID = -6288984265321150707L;
    @ApiModelProperty(name="appCode",value="申请单编号",dataType="String")
    private String appCode;

    @ApiModelProperty(name="proppserid",value="主贷人id",dataType="String")
    private String proppserid;

    @ApiModelProperty(name="mobile",value="主贷人手机号码1",dataType="String")
    private String  mobile;

    @ApiModelProperty(name="mobiles",value="主贷人手机号码2",dataType="String")
    private String  mobiles;

    @ApiModelProperty(name="nowTel",value="主贷人现居住电话",dataType="String")
    private String  nowTel;

    @ApiModelProperty(name="nowAddress",value="主贷人现居住地址",dataType="String")
    private String  nowAddress;

    @ApiModelProperty(name="spouseMobile",value="配偶手机号",dataType="String")
    private String  spouseMobile;

    @ApiModelProperty(name="relationEContact",value="与紧急联系人1关系",dataType="String")
    private String  relationEContact;

    @ApiModelProperty(name="eContactMobile",value="紧急联系人1手机号码",dataType="String")
    private String  eContactMobile;

    @ApiModelProperty(name="eContact",value="紧急联系人1姓名",dataType="String")
    private String  eContact;

    @ApiModelProperty(name="relationEContacts",value="与紧急联系人2关系",dataType="String")
    private String  relationEContacts;

    @ApiModelProperty(name="eContactMobiles",value="紧急联系人2手机号码",dataType="String")
    private String  eContactMobiles;

    @ApiModelProperty(name="eContacts",value="紧急联系人2姓名",dataType="String")
    private String  eContacts;

    @ApiModelProperty(name="relationGFl",value="担保人与申请人关系",dataType="String")
    private String  relationGFl;

    @ApiModelProperty(name="guaranteeMobile",value="担保人手机号",dataType="String")
    private String  guaranteeMobile;

    @ApiModelProperty(name="carIdentify",value="VIN码",dataType="String")
    private String carIdentify;

    @ApiModelProperty(name="carStyles",value="款式",dataType="String")
    private String carStyles;

    @ApiModelProperty(name="carColor",value="车辆颜色",dataType="String")
    private String carColor;

    @ApiModelProperty(name="carGearbox",value="档位",dataType="String")
    private String carGearbox;

    @ApiModelProperty(name="carYear",value="车款年代",dataType="String")
    private String carYear;

    @ApiModelProperty(name="carDiston",value="排量/吨位",dataType="String")
    private String carDiston;

    @ApiModelProperty(name="transCity",value="交易城市",dataType="String")
    private String transCity;

    @ApiModelProperty(name="carMiles",value="二手车里程数(公里)",dataType="String")
    private Integer carMiles;

    @ApiModelProperty(name="transferCnt",value="过户次数",dataType="Integer")
    private Integer transferCnt;

    @ApiModelProperty(name="carFirstBook",value="二手车首次登记日期",dataType="Date")
    private Date carFirstBook;

    @ApiModelProperty(name="carSaleName",value="二手车卖方姓名",dataType="String")
    private String carSaleName;

    @ApiModelProperty(name="carSaleIdno",value="二手车卖方身份证号码",dataType="String")
    private String carSaleIdno;


}
