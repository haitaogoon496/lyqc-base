package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.constraint.Size;

import java.util.List;

/**
 * @description: GPS安装信息提交DTO对象
 * @Date : 下午7:48 2018/1/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpsSubmitDTO extends BaseDTO {
    private static final long serialVersionUID = -6165001330649484325L;
    /**
     * 单据号
     */
    @NotEmpty(message = "申请单号不能为空")
    private String appCode;
    /**
     * gps安装附件集合
     */
    @NotNull(message = "GPS安装附件不能为空")
    @Size(message = "GPS安装附件不能为空")
    private List<AppAnnexDTO> annexList;
    /**
     * gps影像件集合
     */
    @NotNull(message = "gps影像件不能为空")
    @Size(message = "gps影像件不能为空")
    private List<AppAnnexImgDTO> annexImgList;
}
