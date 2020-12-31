package com.lyqc.receiveorder.param.bdx;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxSecondProppserParam {
    /**
     * 申请人姓名
     */
    @ApiModelProperty(value = "申请人姓名")
    @NotBlank(message = "主贷人姓名不能为空")
    private String proppserName;
    /**
     * 证件类型
     **/
    @ApiModelProperty(value = "证件类型")
    private String idType;
    /**
     * 证件号码
     */
    @ApiModelProperty(value = "证件号码")
    @NotBlank(message = "主贷人证件号码不能为空")
    private String idno;
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    @NotBlank(message = "主贷人联系方式不能为空")
    private String mobile;
    /**
     * 生日 yyyyMMdd
     */
    @ApiModelProperty(value = "生日 yyyyMMdd")
    private String birth;
    /**
     * 性别 1：男 0：女
     */
    @ApiModelProperty(value = "性别 1：男 0：女")
    private String sex;
    /**
     * 身份证有效起始日期
     */
    @ApiModelProperty(value = "身份证有效起始日期 yyyy-MM-dd")
    private String idCardValidStartDate;
    /**
     * 身份证有效截止日期
     */
    @ApiModelProperty(value = "身份证有效截止日期 yyyy-MM-dd")
    private String idCardValidEndDate;

    /**
     * 户籍省份
     */
    @ApiModelProperty(value = "户籍省份")
    @NotBlank(message = "户籍省份不能为空")
    private String province;
    /**
     * 户籍城市 VARCHAR(40)
     */
    @ApiModelProperty(value = "户籍城市")
    @NotBlank(message = "户籍城市不能为空")
    private String city;
    /**
     * 户籍地址 VARCHAR(200)
     */
    @ApiModelProperty(value = "户籍地址")
    @NotBlank(message = "户籍地址不能为空")
    private String address;

    /**
     * CaProppserInfoEnum.AuthTypeEnum
     */
    @ApiModelProperty(value = "1表示纸质,2表示电子版")
    @NotBlank(message = "认证方式不能为空")
    private String authType;//1表示纸质,2表示电子版

    @ApiModelProperty(value = "是否为二手车")
    private String isOld;
}
