package com.lyqc.base.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @description: 系统配置数据字典Re
 * @Date : 下午6:34 2018/3/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class SyArgControlRe extends BaseRe{
    private static final long serialVersionUID = 6568917065333718600L;
    /**
     * 主键id
     */
    @ApiModelProperty(name="id",value="id",dataType="Integer")
    private Integer id;
    /**
     * 参数名称
     */
    @ApiModelProperty(name="name",value="参数名称",dataType="String")
    private String name;
    /**
     * 参数编码
     */
    @ApiModelProperty(name="code",value="参数编码",dataType="String")
    private String code;
    /**
     * 参数值
     */
    @ApiModelProperty(name="value",value="参数值",dataType="String")
    private String value;

    @ApiModelProperty(name = "type", value = "业务类型")
    private Integer type;

    @ApiModelProperty(name = "status", value = "状态")
    private Integer status;

    @ApiModelProperty(name = "startdate", value = "参数生效期")
    private Date startdate;

    @ApiModelProperty(name = "stopDate", value = "参数失效期")
    private Date stopDate;

    public SyArgControlRe() {
    }

    public SyArgControlRe(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public SyArgControlRe(Integer id, String name, String code, String value) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }
}
