package com.lyqc.gpsprovider.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.gpsprovider.enums.CarGpsConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.Range;
/**
 * @description: 用来显示办单超人业务初始化状态Re对象
 * @Date : 2018/8/28 下午7:59
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GpsBuzStatusRe extends BaseRe {
    private static final long serialVersionUID = -1293981875691273462L;
    /**
     * {@link CarGpsConstant.GpsApproveStatusEnum#getName()}
     */
    @ApiModelProperty(name="approveStatusDesc",value="GPS审核状态描述",dataType="String")
    private String approveStatusDesc;
    @ApiModelProperty(name="gpsEditable",value="GPS是否可编辑(意味着当前页面是预览状态还是编辑状态)",dataType="boolean")
    private boolean gpsEditable;
    @ApiModelProperty(name="gpsEnabled",value="GPS是否可用(意味着客户端销售是否允许安装GPS)",dataType="boolean")
    private boolean gpsEnabled;
}
