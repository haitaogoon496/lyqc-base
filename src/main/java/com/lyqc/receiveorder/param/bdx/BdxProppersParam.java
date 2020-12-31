package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 办单侠 申请人信息
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxProppersParam implements Serializable{
    /**
     * 申请人姓名
     */
    @NotBlank(message = "主贷人姓名不能为空")
    private String proppserName;
    /**
     * 证件类型
     **/
    private String idType;
    /**
     * 证件号码
     */
    @NotBlank(message = "主贷人证件号码不能为空")
    private String idno;
    /**
     * 手机号码
     */
    @NotBlank(message = "主贷人联系方式不能为空")
    private String mobile;
    /**
     * 生日 yyyyMMdd
     */
    private String birth;
    /**
     * 性别 1：男 0：女
     */
    private String sex;
    /**
     * 申请人邮箱
     */
    private String email;
    /**
     * 身份证有效起始日期
     */
    private String idCardValidStartDate;
    /**
     * 身份证有效截止日期
     */
    private String idCardValidEndDate;
    /**
     * 税收身份声明选项---枚举 (1.仅为中国税收居民...  2.仅为非居民... 3.即是中国税收居民.又是其他国家税收居民。)
     */
    private Integer taxStatement=1;
    /**
     * 税收身份声明时间  (yyyy-MM-dd HH:mm:ss)
     */
    private String taxStatementDate;
    /**
     * 证件有效期
     */
    private String periodOfValidity;


    /**
     * 户籍省份
     */
    @NotBlank(message = "户籍省份不能为空")
    private String province;
    /**
     * 户籍城市 VARCHAR(40)
     */
    @NotBlank(message = "户籍城市不能为空")
    private String city;
    /**
     * 户籍地址 VARCHAR(200)
     */
    @NotBlank(message = "户籍地址不能为空")
    private String address;
    /**
     * 户口性质
     */
    private String residenceNature;
    /**
     * 户籍区或县
     */
    private String district;
    /**
     * 申请人开卡城市代码
     */
    private String cityCode;


    /**
     * 现居住省份 VARCHAR(40)
     */
    private String nowProvince;
    /**
     * 现居住城市 VARCHAR(40)
     */
    private String nowCity;
    /**
     * 现居住区或者县
     */
    private String nowDistrict;
    /**
     * 现居住地址 VARCHAR(200)
     */
    private String nowAddress;
    /**
     * 现居住时间/年 INT
     */
    private Integer nowLivingTime;
    /**
     * 现居住电话 1105添加
     */
    private String nowTel;
    /**
     * 现居住邮编（浦发必填）
     */
    private String nowPostalcode;
    /**
     * 现住址行政区编码 国标
     */
    private String nowDistrictCode;//


    /**
     * 从事行业 INT
     */
    private String nowIndustry;
    /**
     * 现工作单位性质 INT
     */
    private String nowUnitKind;
    /**
     * 现工作单位规模/人数 INT
     */
    private Integer nowUnitScale;
    /**
     * 现工作单位名称 VARCHAR(80)
     */
    private String nowCompany;
    /**
     * 现工作单位省份 VARCHAR(40)
     */
    private String nowUnitProvince;
    /**
     * 现工作单位城市 VARCHAR(40)
     */
    private String nowUnitCity;
    /**
     * 现工作单位地址 VARCHAR(200)
     */
    private String nowUnitAddress;
    /**
     * 公司地址行政区
     */
    private String nowUnitDistrict;
    /**
     * 现工作单位电话 VARCHAR(20)
     */
    private String nowUnitTel;
    /**
     * 职位 INT
     */
    private String nowPosition;
    /**
     * 首次参加工作时间
     */
    private Long firstWorkTime;
    /**
     * 现单位工作年限 VARCHAR(10)
     */
    private String nowWorkYear;
    /**
     * 税后月收入 DECIMAL(10,2)
     */
    private BigDecimal incomeMonth;
    /**
     * 现工作单位邮编
     */
    private String nowUnitPostalcode;
    /**
     * 公司地址行政区编码 国标
     */
    private String nowUnitDistrictCode;

    /**
     * 征信授权方式
     */
    private String authType;
    /**
     * 征信授权书CA地址
     */
    private String authContractUrl;


    /**
     * 住房所有权 VARCHAR(20)
     */
    private String houseOwner;


    /**
     * 学历 INT
     */
    private String education;


//    /**
//     * 本人是否有驾驶证 CHAR(1)
//     */
//    @NotBlank(message = "本人是否有驾驶证不能为空")
//    private String isDriverLicense;
    /**
     * 驾驶员与主贷人关系 CHAR(2)
     */
    @NotBlank(message = "驾驶员与主贷人关系不能为空")
    private String relationDFl;
    /**
     * 驾驶员姓名 VARCHAR(40)
     */
    private String driverName;
    /**
     * 驾驶证号码 VARCHAR(40)
     */
    private String driverNo;
    /**
     * 准驾车型 INT
     */
    private String driverType;


    /**
     * 营销人员代码
     */
    private String marketerCode;

    /**
     * 申请卡片产品代码
     */
    private String cardProductCode;
    /**
     * 申请卡片产品名称
     */
    private String cardProductName;


    /**
     * 推荐人代码
     */
    private String referenceCode;
    /**
     * 推荐人机构代码
     */
    private String referenceJgcode;

    /**
     * 	领用合约代码(2017年5月底需要放开)
     */
    private String applicationagreementbarcode;

    /**
     * 客户类型，用于销售标记用户，给风控作参考
     */
    private String customerType;

}
