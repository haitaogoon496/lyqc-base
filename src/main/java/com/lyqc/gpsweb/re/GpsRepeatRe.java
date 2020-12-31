package com.lyqc.gpsweb.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @description: GPS重复设备对应单号Re对象
 * @Date : 2018/7/17 下午3:52
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpsRepeatRe extends BaseRe{
    private static final long serialVersionUID = 3647896283809970625L;
    @ApiModelProperty(name="deviceNo",value="GPS设备号",dataType="String")
    private String deviceNo;
    @ApiModelProperty(name="appCodes",value="重复申请单号",dataType="Set<String>")
    private Set<String> appCodes;

    /**
     * 外部调用静态方法
     * @param deviceNo
     * @param appCodes
     * @return
     */
    public static GpsRepeatRe newInstance(String deviceNo,Set<String> appCodes){
        return new GpsRepeatRe(deviceNo,appCodes);
    }
}
