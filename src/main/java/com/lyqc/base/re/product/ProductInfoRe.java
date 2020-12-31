package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 车贷产品信息 Re对象
 * @Date : 2018/2/27 下午6:24
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductInfoRe extends BaseRe {
    private static final long serialVersionUID = -1600845940823715543L;
    @ApiModelProperty(name="productCode",value="产品编码",dataType="String")
    private String productCode;
    @ApiModelProperty(name="year",value="产品年份",required = true,dataType="String")
    private Integer year;
    @ApiModelProperty(name="productName",value="产品名称",dataType="String")
    private String productName;
    @ApiModelProperty(name="fundCode",value="资金方编码",dataType="String")
    private String fundCode;
    @ApiModelProperty(name="fundName",value="资金方名称",dataType="String")
    private String fundName;
    @ApiModelProperty(name="type",value="产品分类",dataType="Integer")
    private Integer type;
    @ApiModelProperty(name="createTime",value="产品创建时间",dataType="Date")
    private Date createTime;
    @ApiModelProperty(name="lastUpdate",value="产品修改时间",dataType="Date")
    private Date lastUpdate;
    @ApiModelProperty(name="beginTime",value="产品生效时间",required = true,dataType="Date")
    private Date beginTime;
    @ApiModelProperty(name="endTime",value="产品失效时间",required = true,dataType="Date")
    private Date endTime;
    @ApiModelProperty(name="createTime",value="数据版本",required = true,dataType="Integer")
    private Integer ver;
    @ApiModelProperty(name="status",value="产品状态",required = true,dataType="Integer")
    private Integer status;
    @ApiModelProperty(name="desp",value="产品简述",dataType="String")
    private String desp;
    @ApiModelProperty(name="isAllDealer",value="是否适用所有经销商",dataType="String")
    private String isAllDealer;
    @ApiModelProperty(name="isBrand",value="是否适用所有品牌",dataType="String")
    private String isBrand;
    @ApiModelProperty(name="isSeries",value="是否适用所有车系",dataType="String")
    private String isSeries;
    @ApiModelProperty(name="isStyles",value="是否适用所有车型",dataType="String")
    private String isStyles;
    @ApiModelProperty(name="userName",value="创建人姓名",dataType="String")
    private String userName;
    @ApiModelProperty(name="userId",value="创建人id",dataType="Integer")
    private Integer userId;
    @ApiModelProperty(name="carry",value="费用进位方式",dataType="String")
    private String carry;
    @ApiModelProperty(name="precisions",value="费用进位精度",dataType="Long")
    private Long precisions;
    @ApiModelProperty(name="isPF",value="是否浦发产品(1:是 0:否)",dataType="String")
    private String isPF;
    @ApiModelProperty(name="fundSource",value="产品缩写",dataType="String")
    private String fundSource;
    @ApiModelProperty(name = "productPropsRe",value = "产品属性",dataType = "ProductPropsRe")
    private ProductPropsRe productPropsRe;
}
