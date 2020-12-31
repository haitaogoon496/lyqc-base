package com.lyqc.base.re.cas;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;

/**
 * 自动分单RE
 */
public class AutoSeparateRe extends BaseRe {

    @ApiModelProperty(name="code",value="参数编码",dataType="String")
    private String code;

    @ApiModelProperty(name="data",value="返回数据",dataType="String")
    private String data;

    @ApiModelProperty(name="message",value="返回信息",dataType="String")
    private String message;

    @ApiModelProperty(name="errorMessage",value="失败信息",dataType="String")
    private String errorMessage;

    public AutoSeparateRe () {}

    public AutoSeparateRe (String code,String message,String errorMessage,String data){
        this.code = code;
        this.message = message;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
