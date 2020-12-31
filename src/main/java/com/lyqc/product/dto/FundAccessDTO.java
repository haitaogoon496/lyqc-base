package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.heil.enums.LicenceTypeEnum;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.Assert;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 资金规则准入DTO对象
 * @Date : 2018/7/2 下午5:15
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class FundAccessDTO extends BaseDTO {
    private static final long serialVersionUID = 6271736677920606512L;
    /**
     * 基本信息
     */
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotEmpty(message = "[申请单号]不能为空")
    private String appCode;
    @ApiModelProperty(name="belongSale",value="所属销售ID",dataType="Integer")
    private Integer belongSale;
    @ApiModelProperty(name="belongSaleNa",value="所属销售名称",dataType="String")
    private String belongSaleNa;
    @ApiModelProperty(name="dealerCode",value="力蕴经销商门店编码",dataType="Integer")
    @NotNull(message = "[力蕴经销商门店编码]不能为空")
    private Integer dealerCode;
    @ApiModelProperty(name="dealerName",value="力蕴经销商门店名称",dataType="String")
    private String dealerName;
    @ApiModelProperty(name="marketId",value="市场ID",dataType="Integer")
    private Integer marketId;
    @ApiModelProperty(name="marketName",value="市场名称",dataType="String")
    private String marketName;
    @ApiModelProperty(name="belongOperation",value="运营人员编号",dataType="Integer")
    private Integer belongOperation;
    @ApiModelProperty(name="belongOperationName",value="运营人员名称",dataType="String")
    private String belongOperationName;
    @ApiModelProperty(name="flowSeq",value="审批流程",dataType="Integer")
    @NotNull(message = "[审批流程]不能为空")
    private Integer flowSeq;
    @ApiModelProperty(name="flowSeqName",value="审批流程名称",dataType="String")
    @NotEmpty(message = "[审批流程]不能为空")
    private String flowSeqName;

    /**
     * 主贷人信息
     */
    @ApiModelProperty(name="age",value="主贷人年龄",dataType="Integer")
    @NotNull(message = "[主贷人年龄]不能为空")
    private Integer age;
    @ApiModelProperty(name="idNo",value="申请人身份证号码",dataType="String")
    private String idNo;
    @ApiModelProperty(name="name",value="申请人姓名",dataType="String")
    private String name;
    @ApiModelProperty(name="mobile",value="手机号码",dataType="String")
    private String mobile;
    @ApiModelProperty(name="birth",value="出生日期",dataType="String")
    private String birth;
    @EnumValidation(enums = ConstEnum.SexEnum.class,message = "[性别]不合法，必须({0})")
    @ApiModelProperty(name="sex",value="性别 0:男性,1:女性；",dataType="String")
    @NotEmpty(message = "[性别]不能为空")
    private String sex;
    @ApiModelProperty(name="nation",value="民族",dataType="String")
    private String nation;
    @ApiModelProperty(name="province",value="户籍省code",dataType="String")
    @NotEmpty(message = "[户籍省code]不能为空")
    private String province;
    @ApiModelProperty(name="provinceName",value="户籍省名称",dataType="String")
    @NotEmpty(message = "[户籍省名称]不能为空")
    private String provinceName;
    @ApiModelProperty(name="city",value="户籍市code",dataType="String")
    @NotEmpty(message = "[户籍市code]不能为空")
    private String city;
    @ApiModelProperty(name="cityName",value="户籍市名称",dataType="String")
    @NotEmpty(message = "[户籍市名称]不能为空")
    private String cityName;
    @ApiModelProperty(name="address",value="户籍地址",dataType="String")
    private String address;
    @EnumValidation(enums = ConstEnum.HouseholdRegisterEnum.class,message = "[户口性质]不合法，必须({0})")
    @ApiModelProperty(name="householdRegister",value="户口性质",dataType="String")
    private String householdRegister;
    @ApiModelProperty(name="householdRegisterName",value="户口性质名称",dataType="String")
    private String householdRegisterName;
    @ApiModelProperty(name="nowProvince",value="现居住地省code",dataType="String")
    private String nowProvince;
    @ApiModelProperty(name="householdRegisterName",value="现居住地省名称",dataType="String")
    private String nowProvinceName;
    @ApiModelProperty(name="nowCity",value="现居住地市code",dataType="String")
    private String nowCity;
    @ApiModelProperty(name="nowCityName",value="现居住地市名称",dataType="String")
    private String nowCityName;
    @ApiModelProperty(name="nowAddress",value="现居住地地址",dataType="String")
    private String nowAddress;
    @ApiModelProperty(name="nowTel",value="现居住地电话",dataType="String")
    private String nowTel;
    @ApiModelProperty(name="nowLivingTime",value="现居住地居住时间",dataType="String")
    private String nowLivingTime;
    @EnumValidation(enums = ConstEnum.CreditAuthTypeEnum.class,message = "[征信授权]不合法，必须({0})")
    @ApiModelProperty(name="creditAuthType",value="征信授权",dataType="String")
    private String creditAuthType;

    /**
     * 主贷人工作信息
     */
    @ApiModelProperty(name="nowIndustry",value="从事行业",dataType="String")
    @NotEmpty(message = "[从事行业]不能为空")
    private String nowIndustry;
    @ApiModelProperty(name="nowUnitKind",value="工作单位性质",dataType="String")
    private String nowUnitKind;
    @ApiModelProperty(name="nowUnitScale",value="现工作单位规模/人数",dataType="String")
    private String nowUnitScale;
    @ApiModelProperty(name="nowCompany",value="工作单位名称",dataType="String")
    private String nowCompany;
    @ApiModelProperty(name="nowUnitProvince",value="工作单位名称省code",dataType="String")
    private String nowUnitProvince;
    @ApiModelProperty(name="nowUnitProvinceName",value="工作单位名称省名称",dataType="String")
    private String nowUnitProvinceName;
    @ApiModelProperty(name="nowUnitCityCity",value="工作单位名称市code",dataType="String")
    private String nowUnitCityCity;
    @ApiModelProperty(name="nowUnitCityName",value="工作单位名称市名称",dataType="String")
    private String nowUnitCityName;
    @ApiModelProperty(name="nowUnitAddress",value="工作地址",dataType="String")
    private String nowUnitAddress;
    @ApiModelProperty(name="nowUnitTel",value="工作电话",dataType="String")
    private String nowUnitTel;
    @ApiModelProperty(name="nowWorkYear",value="现单位工作年限",dataType="String")
    private String nowWorkYear;
    @ApiModelProperty(name="nowPosition",value="职位",dataType="String")
    private String nowPosition;
    @ApiModelProperty(name="firstWorkTime",value="首次参加工作时间",dataType="Date")
    private Date firstWorkTime;
    @ApiModelProperty(name="incomeMonth",value="税后月收入",dataType="BigDecimal")
    @NotNull(message = "[税后月收入]不能为空")
    private BigDecimal incomeMonth;

    /**
     * 主贷人其他基本信息
     */
    @ApiModelProperty(name="houseOwner",value="住房所有权",dataType="String")
    private String houseOwner;
    @ApiModelProperty(name="houseProperty",value="是否提供房产 0:否,1:是",dataType="String")
    //@EnumValidation(enums = ConstEnum.YesOrNoEnum.class,message = "[是否提供房产]不合法，必须(0/1)")
    //@NotEmpty(message = "[是否提供房产]不能为空")
    private String houseProperty;
    @ApiModelProperty(name="housePropertyName",value="是否提供房产名称",dataType="String")
    private String housePropertyName;
    @ApiModelProperty(name="driverLicenseOwner",value="驾照归属",dataType="String")
    //@EnumValidation(enums = ConstEnum.DriverLicenseOwnerEnum.class,message = "[驾照归属]不合法，必须(0/1/2/3)")
    @NotNull(message = "[驾照归属]不能为空")
    private String driverLicenseOwner;
    @ApiModelProperty(name="driverName",value="驾驶员姓名",dataType="String")
    private String driverName;
    @ApiModelProperty(name="driverNo",value="驾驶证号码",dataType="String")
    private String driverNo;
    @ApiModelProperty(name="driverType",value="准驾车型",dataType="String")
    private String driverType;
    @ApiModelProperty(name="education",value="学历",dataType="String")
    private String education;
    @ApiModelProperty(name="educationName",value="学历名称",dataType="String")
    private String educationName;
    @ApiModelProperty(name="marriage",value="婚姻状况",dataType="String")
    private String marriage;
    @ApiModelProperty(name="marriageName",value="婚姻状况名称",dataType="String")
    private String marriageName;
    @ApiModelProperty(name="guaranteeType",value="是否有担保人",dataType="String")
    private String guaranteeType;
    @ApiModelProperty(name="bankCardNo",value="银行卡号",dataType="String")
    private String bankCardNo;
    @ApiModelProperty(name="bankAccount",value="开户行",dataType="String")
    private String bankAccount;
    @ApiModelProperty(name="bankAccountMobile",value="还款银行预留手机号",dataType="String")
    private String bankAccountMobile;

    /**
     * 主贷人配偶信息
     */
    @ApiModelProperty(name="poName",value="配偶姓名",dataType="String")
    private String poName;
    @ApiModelProperty(name="poIdNo",value="配偶身份证号码",dataType="String")
    private String poIdNo;
    @ApiModelProperty(name="poMobile",value="配偶手机号码",dataType="String")
    private String poMobile;

    /**
     * 担保人信息
     */
    @ApiModelProperty(name="dbName",value="担保人姓名",dataType="String")
    private String dbName;
    @ApiModelProperty(name="dbIdNo",value="担保人身份证号码",dataType="String")
    private String dbIdNo;
    @ApiModelProperty(name="dbMobile",value="担保人手机号码",dataType="String")
    private String dbMobile;
    @ApiModelProperty(name="dbContactType",value="担保人与申请人关系类型",dataType="Integer")
    private Integer dbContactType;
    @ApiModelProperty(name="dbContactTypeName",value="担保人与申请人关系类型名称",dataType="String")
    private String dbContactTypeName;
    @ApiModelProperty(name="dbProvince",value="户籍省code",dataType="String")
    private String dbProvince;
    @ApiModelProperty(name="dbProvinceName",value="户籍省名称",dataType="String")
    private String dbProvinceName;
    @ApiModelProperty(name="dbCity",value="户籍市code",dataType="String")
    private String dbCity;
    @ApiModelProperty(name="dbCityName",value="户籍市名称",dataType="String")
    private String dbCityName;
    @ApiModelProperty(name="dbAddress",value="户籍地址",dataType="String")
    private String dbAddress;
    @ApiModelProperty(name="dbNowProvince",value="现居住地省code",dataType="String")
    private String dbNowProvince;
    @ApiModelProperty(name="dbNowProvinceName",value="现居住地省名称",dataType="String")
    private String dbNowProvinceName;
    @ApiModelProperty(name="dbNowCity",value="现居住地市code",dataType="String")
    private String dbNowCity;
    @ApiModelProperty(name="dbNowCityName",value="现居住地市名称",dataType="String")
    private String dbNowCityName;
    @ApiModelProperty(name="dbNowAddress",value="现居住地地址",dataType="String")
    private String dbNowAddress;
    @ApiModelProperty(name="dbNowCompany",value="工作单位名称",dataType="String")
    private String dbNowCompany;
    @ApiModelProperty(name="dbNowUnitProvince",value="工作单位名称省code",dataType="String")
    private String dbNowUnitProvince;
    @ApiModelProperty(name="dbNowUnitProvinceName",value="工作单位名称省名称",dataType="String")
    private String dbNowUnitProvinceName;
    @ApiModelProperty(name="dbNowUnitCityCity",value="工作单位名称市code",dataType="String")
    private String dbNowUnitCityCity;
    @ApiModelProperty(name="dbNowUnitCityName",value="工作单位名称市名称",dataType="String")
    private String dbNowUnitCityName;
    @ApiModelProperty(name="dbNowUnitAddress",value="工作地址",dataType="String")
    private String dbNowUnitAddress;

    /**
     * 紧急联系人
     * 说明：下属字段原以e+前缀开头，规范以urgency+开头
     */
    @ApiModelProperty(name="urgencyContactNameFirst",value="紧急联系人1姓名",dataType="String")
    private String urgencyContactNameFirst;
    @ApiModelProperty(name="urgencyContactMobileFirst",value="紧急联系人1手机号码",dataType="String")
    private String urgencyContactMobileFirst;
    @ApiModelProperty(name="urgencyContactTypeFirst",value="紧急联系人1与申请人关系类型",dataType="Integer")
    private String urgencyContactTypeFirst;
    @ApiModelProperty(name="urgencyContactTypeNameFirst",value="紧急联系人1与申请人关系类型名称",dataType="String")
    private String urgencyContactTypeNameFirst;
    @ApiModelProperty(name="urgencyContactNameSecond",value="紧急联系人2姓名",dataType="String")
    private String urgencyContactNameSecond;
    @ApiModelProperty(name="urgencyContactMobileSecond",value="紧急联系人2手机号码",dataType="String")
    private String urgencyContactMobileSecond;
    @ApiModelProperty(name="urgencyContactTypeSecond",value="紧急联系人2与申请人关系类型",dataType="Integer")
    private String urgencyContactTypeSecond;
    @ApiModelProperty(name="urgencyContactTypeNameSecond",value="紧急联系人2与申请人关系类型名称",dataType="String")
    private String urgencyContactTypeNameSecond;

    /**
     * 车辆信息
     */
    @EnumValidation(enums = ConstEnum.CarTypeEnum.class,message = "[车类]不合法，必须({0})")
    @ApiModelProperty(name="carType",value="车类 0:乘用车,1:LCV,2:MMPV",dataType="String")
    @NotEmpty(message = "[车类]不能为空")
    private String carType;
    @ApiModelProperty(name="carTypeName",value="车类名称",dataType="String")
    private String carTypeName;
    @EnumValidation(enums = LicenceTypeEnum.class,message = "[车牌类型]不合法，必须({0})")
    @ApiModelProperty(name="carLicenseType",value="车牌类型 0:非公牌,1:一般公牌,2:LCV挂靠公牌,3:以租代购",dataType="Integer")
    @NotNull(message = "[车牌类型]不能为空")
    private Integer carLicenseType;
    @ApiModelProperty(name="carIdentify",value="车辆识别代号vin码",dataType="String")
    private String carIdentify;
    @ApiModelProperty(name="vehicleName",value="车辆公号型号",dataType="String")
    private String vehicleName;
    @ApiModelProperty(name="carBrand",value="品牌",dataType="String")
    private String carBrand;
    @ApiModelProperty(name="carBrandId",value="车品牌ID",dataType="String")
    private String carBrandId;
    @ApiModelProperty(name="carSeries",value="车系",dataType="String")
    private String carSeries;
    @ApiModelProperty(name="carSeriesId",value="车系ID",dataType="String")
    private String carSeriesId;
    @ApiModelProperty(name="carYear",value="车款年代",dataType="String")
    private String carYear;
    @ApiModelProperty(name="carYearId",value="车款年代ID",dataType="String")
    private String carYearId;
    @ApiModelProperty(name="carStyles",value="二手车款式",dataType="String")
    private String carStyles;
    @ApiModelProperty(name="carDiston",value="二手车档位",dataType="String")
    private String carDiston;
    @ApiModelProperty(name="carGearbox",value="二手车排量吨位",dataType="String")
    private String carGearbox;
    @ApiModelProperty(name="carColor",value="车辆颜色",dataType="String")
    private String carColor;
    @EnumValidation(enums = ConstEnum.FuelTypeEnum.class,message = "[燃油类型]不合法，必须({0})")
    @ApiModelProperty(name="fuelType",value="燃油类型 1 汽油柴油 2 油电混动 3 纯电",dataType="Integer")
    @NotNull(message = "[燃油类型]不能为空")
    private Integer fuelType;
    @ApiModelProperty(name="engineNo",value="发动机编号",dataType="String")
    private String engineNo;
    @ApiModelProperty(name="carMiles",value="二手车里程数/公里",dataType="Integer")
    @Assert(expr="_value != null && _value > 0" ,lang="javascript",message="二手车时，里程数不能为空且大于0"  ,when="javascript:_this.isOld == 1")
    private Integer carMiles;
    @ApiModelProperty(name="carSaleName",value="卖方姓名",dataType="String")
    private String carSaleName;
    @ApiModelProperty(name="carSaleIdno",value="卖方身份证号码",dataType="String")
    private String carSaleIdno;
    @ApiModelProperty(name="licensePlateNum",value="卖方车牌号",dataType="String")
    private String licensePlateNum;
    @ApiModelProperty(name="carFirstBook",value="首次登记日期",dataType="Date")
    @Assert(expr="_value != null" ,lang="javascript",message="二手车时，[首次登记日期]不为空"  ,when="javascript:_this.isOld == 1")
    private Date carFirstBook;

    /**
     * 贷款信息
     * 说明：下属字段原以a+前缀开头，规范以 apply+开头
     */
    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[实际销售价]不能为空")
    private BigDecimal salePrice;
    @ApiModelProperty(name="applyCarLoanAmount",value="车贷贷款金额(元)",dataType="BigDecimal")
    @NotNull(message = "[车贷贷款金额]不能为空")
    private BigDecimal applyCarLoanAmount;
    @ApiModelProperty(name="applyLoanPeriods",value="申请还款期限(月)",dataType="Integer")
    @NotNull(message = "[申请还款期限]不能为空")
    private Integer applyLoanPeriods;
    @ApiModelProperty(name="isOld",value="是否二手车",dataType="Integer")
    private Integer isOld;


    /**
     * 以下为扩展字段
     */
    @ApiModelProperty(name="initScale",value="首付比",dataType="BigDecimal")
    private BigDecimal initScale;
    @ApiModelProperty(name="carAge",value="二手车车龄",dataType="Integer")
    private Integer carAge;

}