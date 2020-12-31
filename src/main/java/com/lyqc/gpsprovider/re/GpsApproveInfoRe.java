package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: GPS认证信息详情Re对象
 * @Date : 2018/6/14 下午3:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsApproveInfoRe extends BaseRe{
    public static final String REASON_SPLIT = ";";
    private static final long serialVersionUID = 893262051379820142L;
    @ApiModelProperty(name="gpsNo",value="GPS设备号",dataType="String")
    private String gpsNo;
    /**
     * {@link CarGpsConstant.GpsDeviceTypeEnum#getName()}
     */
    @ApiModelProperty(name="gpsType",value="GPS设备类型",dataType="String")
    private String gpsType;
    @ApiModelProperty(name="result",value="认证结果",dataType="Integer")
    private Integer result;
    @ApiModelProperty(name="resultDesc",value="认证结果描述",dataType="String")
    private String resultDesc;
    @ApiModelProperty(name="reasons",value="认证原因",dataType="List<String>")
    private List<String> reasons;

    public GpsApproveInfoRe() {
    }

    /**
     * 原因再处理
     */
    public void handleReasons(){
        final boolean hasCount = null != reasons && !reasons.isEmpty();
        if(hasCount){
            List<String> newValues = new ArrayList<>();
            reasons.forEach(each -> {
                if(null != each && !"".equals(each)){
                    if(each.contains(REASON_SPLIT)){
                         newValues.addAll(Arrays.asList(each.split(REASON_SPLIT)));
                    }else{
                        newValues.add(each);
                    }
                }
            });
            this.setReasons(newValues);
        }
    }

    public static void main(String[] args) {
        GpsApproveInfoRe gpsApproveInfoRe = new GpsApproveInfoRe();
        gpsApproveInfoRe.setReasons(Arrays.asList("你好哦;在家","补充原因",""));
        gpsApproveInfoRe.handleReasons();
        System.out.println(gpsApproveInfoRe);
    }
}
