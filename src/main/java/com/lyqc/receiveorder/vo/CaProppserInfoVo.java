package com.lyqc.receiveorder.vo;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaProppserInfoVo {

    @ApiModelProperty(name = "姓名")
    private String name;
    @ApiModelProperty(name = "证件类型")
    private String idType;
    @ApiModelProperty(name = "身份证号")
    private String idno;
    @ApiModelProperty(name = "联系方式")
    private String mobile;
    @ApiModelProperty(name = "生日")
    private String birth;
    @ApiModelProperty(name = "性别 1：男 0：女")
    private String sex;
    @ApiModelProperty(name = "申请人邮箱")
    private String email;
    @ApiModelProperty(name = "身份证有效起始日期")
    private String idCardValidStartDate;
    @ApiModelProperty(name = "身份证有效截止日期")
    private String idCardValidEndDate;
    @ApiModelProperty(name = "税收身份声明选项---枚举 (1.仅为中国税收居民...  2.仅为非居民... 3.即是中国税收居民.又是其他国家税收居民。)")
    private Integer taxStatement=1;
    @ApiModelProperty(name = "税收身份声明时间  (yyyy-MM-dd HH:mm:ss)")
    private String taxStatementDate;
    @ApiModelProperty(name = "证件有效期")
    private String periodOfValidity;

    @ApiModelProperty(name = "户籍省份")
    private String province;
    @ApiModelProperty(name = "户籍城市")
    private String city;
    @ApiModelProperty(name = "户籍地址")
    private String address;
    @ApiModelProperty(name = "户口性质")
    private String residenceNature;
    @ApiModelProperty(name = "户籍区或县")
    private String district;

    @ApiModelProperty(name = "现居住省份")
    private String nowProvince;
    @ApiModelProperty(name = "现居住城市")
    private String nowCity;
    @ApiModelProperty(name = "现居住区或者县")
    private String nowDistrict;
    @ApiModelProperty(name = "现居住时间/年")
    private Integer nowLivingTime;
    @ApiModelProperty(name = "现居住邮编（浦发必填）")
    private String nowPostalcode;
    @ApiModelProperty(name = "现住址行政区编码 国标")
    private String nowDistrictCode;//
    @ApiModelProperty(name = "现居住地址")
    private String nowAddress;
    @ApiModelProperty(name = "现居住电话")
    private String nowTel;
    @ApiModelProperty(name = "现工作单位地址")
    private String nowUnitAddress;
    @ApiModelProperty(name = "现工作单位电话")
    private String nowUnitTel;
    @ApiModelProperty(name = "现从事行业")
    private String nowIndustry;
    @ApiModelProperty(name = "现工作单位性质 INT")
    private String nowUnitKind;
    @ApiModelProperty(name = "现工作单位规模/人数 INT")
    private Integer nowUnitScale;
    @ApiModelProperty(name = "现单位工作年限")
    private String nowWorkYear;
    @ApiModelProperty(name = "现工作单位名称 VARCHAR(80)")
    private String nowCompany;
    @ApiModelProperty(name = "现工作单位省份 VARCHAR(40)")
    private String nowUnitProvince;
    @ApiModelProperty(name = "现工作单位城市 VARCHAR(40)")
    private String nowUnitCity;
    @ApiModelProperty(name = "现公司地址行政区")
    private String nowUnitDistrict;
    @ApiModelProperty(name = "现职位 INT")
    private String nowPosition;
    @ApiModelProperty(name = "现居住电话")
    private String 现工作单位邮编;
    @ApiModelProperty(name = "现公司地址行政区编码 国标")
    private String nowUnitDistrictCode;

    @ApiModelProperty(name = "申请人开卡城市代码")
    private String cityCode;

    @ApiModelProperty(name = "首次参加工作时间")
    private Long firstWorkTime;

    @ApiModelProperty(name = "税后月收入")
    private BigDecimal incomeMonth;

    @ApiModelProperty(name = "征信授权方式")
    private String authType;

    @ApiModelProperty(name = "征信授权书CA地址")
    private String authContractUrl;

    @ApiModelProperty(name = "住房所有权")
    private String houseOwner;

    @ApiModelProperty(name = "学历")
    private String education;

    @ApiModelProperty(name = "驾驶员与主贷人关系")
    private String relationDFl;
    @ApiModelProperty(name = "驾驶员姓名")
    private String driverName;

    @ApiModelProperty(name = "驾驶证号码")
    private String driverNo;

    @ApiModelProperty(name = "准驾车型")
    private String driverType;

    @ApiModelProperty(name = "营销人员代码")
    private String marketerCode;

    @ApiModelProperty(name = "申请卡片产品代码")
    private String cardProductCode;
    @ApiModelProperty(name = "申请卡片产品名称")
    private String cardProductName;


    @ApiModelProperty(name = "推荐人代码")
    private String referenceCode;
    @ApiModelProperty(name = "推荐人机构代码")
    private String referenceJgcode;

    @ApiModelProperty(name = "领用合约代码")
    private String applicationagreementbarcode;

    @ApiModelProperty(name = "客户类型，用于销售标记用户，给风控作参考")
    private String customerType;
}
