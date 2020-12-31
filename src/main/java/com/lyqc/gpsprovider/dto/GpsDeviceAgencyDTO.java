package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.gpsprovider.enums.GpsDeviceAgencyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.constraint.Size;

import java.util.List;

/**
 * @description: GPS设备商认证DTO对象
 * @Date : 下午7:48 2018/1/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GpsDeviceAgencyDTO extends BaseDTO {
    private static final long serialVersionUID = -6165001330649484325L;
    /**
     * GPS设备商类型
     */
    @NotEmpty(message = "GPS设备商类型不能为空")
    @EnumValidation(enums = GpsDeviceAgencyType.class,method = EnumValidation.InvokeMethod.getName,message = "非法GPS设备商类型")
    private String agencyType;
    /**
     * GPS设备号集合
     */
    @NotNull(message = "deviceList不能为空")
    @Size(message = "deviceList大小必须[0-2]",max = 2)
    private List<String> deviceList;
}
