package com.lyqc.receiveorder.param;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import com.lyqc.receiveorder.param.bdx.BdxAnnexParam;
import com.lyqc.receiveorder.param.bdx.BdxOperatorParam;

import lombok.Data;

/**
 * app提交调用基本参数
 * Created by xiaoxian on 2018/8/25.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseEnterInParam extends BaseReiveorderParam{

    @NotBlank(message = "订单号不能为空")
    private String appCode;

    /**
     * 操作者
     */
    @NotNull(message = "操作者信息不能为空")
    @Valid
    private BdxOperatorParam operatorParam;

    /**
     * 影像件信息
     */
    @Valid
    private List<BdxAnnexParam> imgParams;

    /**
     * 留言
     */
    private String remark;
}
