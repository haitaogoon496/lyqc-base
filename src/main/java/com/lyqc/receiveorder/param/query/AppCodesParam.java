package com.lyqc.receiveorder.param.query;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseReiveorderParam;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/25.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppCodesParam extends BaseReiveorderParam{
    @NotNull(message = "订单号列表不能为空")
    @Size(min = 1,max = 150,message="订单号列表长度1~150")
    private List<String> appCodeList;
}
