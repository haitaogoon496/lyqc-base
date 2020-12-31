package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 查询GPS认证结果Re对象
 * @Date : 2018/6/14 下午2:16
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsApproveResultRe extends BaseRe {
    private static final long serialVersionUID = 1010072756145913442L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    private String appCode;
    @ApiModelProperty(name="result",value="result",dataType="Integer")
    /**
     * {@link CarGpsConstant.GpsApproveStatusEnum#getIndex()}
     * GPS设备验证结果code
     */
    private Integer result;
    /**
     * {@link CarGpsConstant.GpsApproveStatusEnum#getName()}
     * GPS设备验证结果
     */
    private String resultDesc;
    @ApiModelProperty(name="List<GpsApproveInfoRe>",value="认证详情信息",dataType="List<GpsApproveInfoRe>")
    private List<GpsApproveInfoRe> approveInfoList;

    public GpsApproveResultRe() {
    }

    public GpsApproveResultRe(String appCode, Integer result, List<GpsApproveInfoRe> approveInfoList) {
        this.appCode = appCode;
        this.result = result;
        this.approveInfoList = approveInfoList;
    }
}
