package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 产品分类Re
 * @Date : 下午7:52 2018/3/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductTypeRe extends BaseRe {
    private static final long serialVersionUID = 790984901958453157L;
    @ApiModelProperty(name="code",value="分类code",dataType="String")
    private String code;
    @ApiModelProperty(name="name",value="分类名称",dataType="String")
    private String name;
    @ApiModelProperty(name="pDesc",value="分类描述",dataType="String")
    private	String pDesc;
    @ApiModelProperty(name="status",value="状态",dataType="String")
    private	String status;
    @ApiModelProperty(name="createUser",value="创建人",dataType="String")
    private	String createUser;
    @ApiModelProperty(name="createTime",value="创建时间",dataType="Date")
    private Date createTime;

    public ProductTypeRe() {
    }

    public ProductTypeRe(Integer id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
    }
}
